package marketanalysis.market.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marketanalysis.market.dto.SeoulMarketBenefitDto;
import marketanalysis.market.entity.enums.MarketTypeCd;
import marketanalysis.market.service.interfaces.SeoulMarketBenefitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seoul/benefit")
@RequiredArgsConstructor
public class SeoulMarketBenefitController {

    private final SeoulMarketBenefitService MARKET_BENEFIT_SERVICE;

    @GetMapping("")
    public ResponseEntity<List<SeoulMarketBenefitDto>> getAll() {
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/year/{year}/quarter/{quarter}")
    public ResponseEntity<List<SeoulMarketBenefitDto>> getAllByYearAndQuarter(
        @PathVariable Long year,
        @PathVariable Long quarter
    ) {
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByYearsAndQuarter(year, quarter);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/marketType/{marketType}")
    public ResponseEntity<List<SeoulMarketBenefitDto>> getAllByMarketTypeCd(@PathVariable String marketType) {
        MarketTypeCd marketTypeCd = MarketTypeCd.getByCd(marketType);
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByMarketTypeCd(marketTypeCd);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/marketCd/{marketCd}")
    public ResponseEntity<List<SeoulMarketBenefitDto>> getAllByMarketCd(@PathVariable Long marketCd) {
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByMarketCd(marketCd);
        return ResponseEntity.ok().body(result);
    }
}
