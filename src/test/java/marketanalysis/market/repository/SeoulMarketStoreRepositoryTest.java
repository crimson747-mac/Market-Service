package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulMarketStore;
import marketanalysis.market.entity.enums.store.MarketTypeCd;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class SeoulMarketStoreRepositoryTest {

    @Autowired
    SeoulMarketStoreRepository MARKET_STORE_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        SeoulMarketStore one = new SeoulMarketStore(null, 2021L, 4L, MarketTypeCd.D, "관광특구", 1001496L, "강남 마이스 관광특구", "CS300043", "전자상거래업", 8L, 8L, 0L, 0L, 0L, 0L, 0L);
        SeoulMarketStore two = new SeoulMarketStore(null, 2021L, 4L, MarketTypeCd.D, "관광특구", 1001496L, "강남 마이스 관광특구", "CS300042", "주유소", 1L, 1L, 0L, 0L, 0L, 0L, 0L);
        SeoulMarketStore three = new SeoulMarketStore(null, 2021L, 4L, MarketTypeCd.D, "관광특구", 1001496L, "강남 마이스 관광특구", "CS300041", "예술품", 10L, 10L, 0L, 0L, 0L, 0L, 0L);
        SeoulMarketStore four = new SeoulMarketStore(null, 2021L, 4L, MarketTypeCd.D, "관광특구", 1001496L, "강남 마이스 관광특구", "CS300038", "자동차부품", 10L, 10L, 0L, 0L, 0L, 0L, 0L);

        MARKET_STORE_REPOSITORY.save(one);
        MARKET_STORE_REPOSITORY.save(two);
        MARKET_STORE_REPOSITORY.save(three);
        MARKET_STORE_REPOSITORY.save(four);
    }

    @AfterEach
    void afterEach() {
        MARKET_STORE_REPOSITORY.deleteAll();
    }

    @Test
    @DisplayName("year과 quarter 정보를 사용하여 상권 정포 정보 조회")
    void findAllByYearAndQuarter() {
        //given
        Long year = 2021L;
        Long quarter = 4L;

        //when
        List<SeoulMarketStore> result = MARKET_STORE_REPOSITORY.findAllByYearAndQuarter(year, quarter);

        //thenR
        assertThat(result.size()).isGreaterThan(1);
    }

    @Test
    void findOneByMarketCd() {
        //given
        Long marketCd = 1001496L;

        //when
        List<SeoulMarketStore> result = MARKET_STORE_REPOSITORY.findAllByMarketCd(marketCd);

        //then
        assertThat(result.size()).isGreaterThan(1);
    }
}