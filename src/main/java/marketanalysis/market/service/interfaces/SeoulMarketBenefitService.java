package marketanalysis.market.service.interfaces;

import marketanalysis.market.dto.SeoulMarketBenefitDto;
import marketanalysis.market.entity.enums.MarketTypeCd;

import java.util.List;

public interface SeoulMarketBenefitService {

    List<SeoulMarketBenefitDto> getAll();

    List<SeoulMarketBenefitDto> getAllByYearsAndQuarter(Long years, Long quarter);

    List<SeoulMarketBenefitDto> getAllByMarketTypeCd(MarketTypeCd marketTypeCd);

    List<SeoulMarketBenefitDto> getAllByMarketCd(Long marketCd);
}
