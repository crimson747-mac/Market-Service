package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulMarketBenefitDto;
import marketanalysis.market.entity.enums.MarketTypeCd;
import marketanalysis.market.repository.SeoulMarketBenefitRepository;
import marketanalysis.market.service.interfaces.SeoulMarketBenefitService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SeoulMarketBenefitServiceImpl implements SeoulMarketBenefitService {

    private final SeoulMarketBenefitRepository MARKET_BENEFIT_REPOSITORY;

    @Override
    public List<SeoulMarketBenefitDto> getAll() {
        return MARKET_BENEFIT_REPOSITORY.findAll().stream()
                .map(SeoulMarketBenefitDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<SeoulMarketBenefitDto> getAllByYearsAndQuarter(Long years, Long quarter) {
        return MARKET_BENEFIT_REPOSITORY.findAllByYearsAndQuarter(years, quarter).stream()
                .map(SeoulMarketBenefitDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<SeoulMarketBenefitDto> getAllByMarketTypeCd(MarketTypeCd marketTypeCd) {
        return MARKET_BENEFIT_REPOSITORY.findAllByMarketTypeCd(marketTypeCd).stream()
                .map(SeoulMarketBenefitDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<SeoulMarketBenefitDto> getAllByMarketCd(Long marketCd) {
        return MARKET_BENEFIT_REPOSITORY.findAllByMarketCd(marketCd).stream()
                .map(SeoulMarketBenefitDto::new)
                .collect(Collectors.toList());
    }
}
