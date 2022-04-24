package marketanalysis.market.service.interfaces;

import marketanalysis.market.dto.SeoulUmdMarketChangeDto;

import java.util.List;

public interface SeoulUmdMarketChangeService {

    List<SeoulUmdMarketChangeDto> getAllByUmdCd(Long umdCd);

}
