package marketanalysis.market.service.interfaces;

import marketanalysis.market.dto.SeoulMarketAreaDto;

import java.util.List;

public interface SeoulMarketAreaService {

    List<SeoulMarketAreaDto> getAll();

    List<SeoulMarketAreaDto> getAllBySggCd(Long sggCd);

    List<SeoulMarketAreaDto> getAllByUmdCd(Long umdCd);

}
