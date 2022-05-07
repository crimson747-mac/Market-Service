package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulMarketBenefit;
import marketanalysis.market.entity.enums.MarketTypeCd;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeoulMarketBenefitRepository extends JpaRepository<SeoulMarketBenefit, Long> {

    List<SeoulMarketBenefit> findAllByYearsAndQuarter(Long years, Long quarter);

    List<SeoulMarketBenefit> findAllByMarketTypeCd(MarketTypeCd marketTypeCd);

    List<SeoulMarketBenefit> findAllByMarketCd(Long marketCd);
}
