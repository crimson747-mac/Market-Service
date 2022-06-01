package marketanalysis.market.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import marketanalysis.market.dto.SeoulMarketStoreDto;
import marketanalysis.market.service.interfaces.SeoulMarketStoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/seoul/store")
@RequiredArgsConstructor
public class SeoulMarketStoreController {

    private final SeoulMarketStoreService MARKET_STORE_SERVICE;

    @GetMapping("/year/{year}/quarter/{quarter}")
    public ResponseEntity<List<SeoulMarketStoreDto>> getAllByYearAndQuarter(
        @PathVariable Long year,
        @PathVariable Long quarter
    ) {
        List<SeoulMarketStoreDto> result = MARKET_STORE_SERVICE.getAllByYearAndQuarter(year, quarter);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/marketCd/{marketCd}")
    public ResponseEntity<List<SeoulMarketStoreDto>> getAllByMarketCd(@PathVariable Long marketCd) {
        List<SeoulMarketStoreDto> result = MARKET_STORE_SERVICE.getAllByMarketCd(marketCd);
        return ResponseEntity.ok().body(result);
    }


}
