package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulMarketStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeoulMarketStoreRepository extends JpaRepository<SeoulMarketStore, Long> {
    List<SeoulMarketStore> findAllByYearAndQuarter(Long year, Long quarter);

    List<SeoulMarketStore> findAllByMarketCd(Long marketCd);
}
