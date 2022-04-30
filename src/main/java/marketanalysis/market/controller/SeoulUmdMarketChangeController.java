package marketanalysis.market.controller;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulUmdMarketChangeDto;
import marketanalysis.market.service.interfaces.SeoulUmdMarketChangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seoul/change/umd")
public class SeoulUmdMarketChangeController {

    private final SeoulUmdMarketChangeService UMD_MARKET_CHANGE;

    @GetMapping("/{umdCd}")
    public ResponseEntity<List<SeoulUmdMarketChangeDto>> getAllByUmdCd(@PathVariable Long umdCd) {
        List<SeoulUmdMarketChangeDto> result = UMD_MARKET_CHANGE.getAllByUmdCd(umdCd);
        return ResponseEntity.ok().body(result);
    }

}
