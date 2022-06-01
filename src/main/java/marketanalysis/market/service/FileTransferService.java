package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marketanalysis.market.utils.convert.EntityType;
import marketanalysis.market.utils.file.FileUtils;
import marketanalysis.market.utils.convert.StringRowConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class FileTransferService {

    @Value("${file_path}")
    private String filePath;

    @Value("${market_area}")
    private String marketArea;

    @Value("${market_benefit}")
    private String marketBenefit;

    @Value("${market_sgg_change}")
    private String marketSggChange;

    @Value("${market_umd_change}")
    private String marketUmdChange;

    @Value("${market_store}")
    private String marketStore;

    private final EntityManagerFactory EMF;

    public void transferMarketArea() {
        List<List<String>> table = FileUtils.getCsvFileAsTwoDimensionArray(filePath + marketArea);
        save(table, table.size(), EntityType.MARKET_AREA);
    }

    public void transferMarketStore() {
        List<List<String>> table = FileUtils.getCsvFileAsTwoDimensionArray(filePath + marketStore);
        save(table, table.size(), EntityType.MARKET_STORE);
    }

    public void transferMarketBenefit() {
        List<List<String>> table = FileUtils.getCsvFileAsTwoDimensionArray(filePath + marketBenefit);
        save(table, table.size(), EntityType.MARKET_BENEFIT);
    }

    public void transferSggMarketChange() {
        List<List<String>> table = FileUtils.getCsvFileAsTwoDimensionArray(filePath + marketSggChange);
        save(table, table.size(), EntityType.MARKET_SGG_CHANGE);
    }

    public void transferUmdMarketChange() {
        List<List<String>> table = FileUtils.getCsvFileAsTwoDimensionArray(filePath + marketUmdChange);
        save(table, table.size(), EntityType.MARKET_UMD_CHANGE);
    }

    private void save(List<List<String>> table, int rowCount, EntityType type) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        CountDownLatch countDownLatch = new CountDownLatch(rowCount);

        executor.submit(() -> {
            EntityManager em = EMF.createEntityManager();
            List<List<String>> oneQuarter = table.subList(0, (int) Math.floor(rowCount * 0.25));
            for (List<String> row : oneQuarter) {
                em.persist(StringRowConverter.get(type, row));
                countDownLatch.countDown();
            }
        });
        executor.submit(() -> {
            EntityManager em = EMF.createEntityManager();
            List<List<String>> twoQuarter = table.subList((int) Math.floor(rowCount * 0.25), (int) Math.floor(rowCount * 0.5));
            for (List<String> row : twoQuarter) {
                em.persist(StringRowConverter.get(type, row));
                countDownLatch.countDown();
            }
        });
        executor.submit(() -> {
            EntityManager em = EMF.createEntityManager();
            List<List<String>> threeQuarter = table.subList((int) Math.floor(rowCount * 0.5), (int) Math.floor(rowCount * 0.75));
            for (List<String> row : threeQuarter) {
                em.persist(StringRowConverter.get(type, row));
                countDownLatch.countDown();
            }
        });
        executor.submit(() -> {
            EntityManager em = EMF.createEntityManager();
            List<List<String>> fourQuarter = table.subList((int) Math.floor(rowCount * 0.75), rowCount);
            for (List<String> row : fourQuarter) {
                em.persist(StringRowConverter.get(type, row));
                countDownLatch.countDown();
            }
        });

        try {
            countDownLatch.await(5L, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
