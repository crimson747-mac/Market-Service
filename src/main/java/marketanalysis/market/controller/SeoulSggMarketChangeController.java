package marketanalysis.market.controller;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulSggMarketChangeDto;
import marketanalysis.market.service.interfaces.SeoulSggMarketChangeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/seoul/change/sgg")
public class SeoulSggMarketChangeController {

    private final SeoulSggMarketChangeService SGG_CHANGE_SERVICE;

    @GetMapping("/{sggCd}")
    public ResponseEntity<List<SeoulSggMarketChangeDto>> getAllBySggCd(@PathVariable Long sggCd) {
        List<SeoulSggMarketChangeDto> result = SGG_CHANGE_SERVICE.getAllBySggCd(sggCd);
        return ResponseEntity.ok().body(result);
    }

}
