package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulMarketStoreDto;
import marketanalysis.market.repository.SeoulMarketStoreRepository;
import marketanalysis.market.service.interfaces.SeoulMarketStoreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SeoulMarketStoreServiceImpl implements SeoulMarketStoreService {

    private final SeoulMarketStoreRepository MARKET_CHANGE_REPOSITORY;

    @Override
    public List<SeoulMarketStoreDto> getAllByYearAndQuarter(Long year, Long quarter) {
        return MARKET_CHANGE_REPOSITORY.findAllByYearAndQuarter(year, quarter).stream()
                .map(SeoulMarketStoreDto::new).collect(Collectors.toList());
    }

    @Override
    public List<SeoulMarketStoreDto> getAllByMarketCd(Long marketCd) {
        return MARKET_CHANGE_REPOSITORY.findAllByMarketCd(marketCd).stream()
                .map(SeoulMarketStoreDto::new).collect(Collectors.toList());
    }
}
