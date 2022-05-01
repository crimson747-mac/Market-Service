package marketanalysis.market.service.interfaces;

import marketanalysis.market.dto.SeoulMarketStoreDto;

import java.util.List;

public interface SeoulMarketStoreService {
    List<SeoulMarketStoreDto> getAllByYearAndQuarter(Long year, Long quarter);

    List<SeoulMarketStoreDto> getAllByMarketCd(Long marketCd);
}
