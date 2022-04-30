package marketanalysis.market.controller;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulMarketAreaDto;
import marketanalysis.market.service.interfaces.SeoulMarketAreaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seoul/area")
public class SeoulMarketAreaController {

    private final SeoulMarketAreaService MARKET_AREA_SERVICE;

    @GetMapping("")
    public ResponseEntity<List<SeoulMarketAreaDto>> getAll() {
        List<SeoulMarketAreaDto> result = MARKET_AREA_SERVICE.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/sgg/{sggCd}")
    public ResponseEntity<List<SeoulMarketAreaDto>> getAllBySggCd(@PathVariable Long sggCd) {
        List<SeoulMarketAreaDto> result = MARKET_AREA_SERVICE.getAllBySggCd(sggCd);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/umd/{umdCd}")
    public ResponseEntity<List<SeoulMarketAreaDto>> getAllByUmdCd(@PathVariable Long umdCd) {
        List<SeoulMarketAreaDto> result = MARKET_AREA_SERVICE.getAllByUmdCd(umdCd);
        return ResponseEntity.ok().body(result);
    }

}
