package marketanalysis.market.service.interfaces;

import marketanalysis.market.dto.SeoulSggMarketChangeDto;

import java.util.List;

public interface SeoulSggMarketChangeService {

    List<SeoulSggMarketChangeDto> getAllBySggCd(Long sggCd);

}
