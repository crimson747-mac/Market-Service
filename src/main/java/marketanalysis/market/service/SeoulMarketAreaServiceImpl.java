package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulMarketAreaDto;
import marketanalysis.market.repository.SeoulMarketAreaRepository;
import marketanalysis.market.service.interfaces.SeoulMarketAreaService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SeoulMarketAreaServiceImpl implements SeoulMarketAreaService {

    private final SeoulMarketAreaRepository SEOUL_MARKET_AREA_REPOSITORY;

    @Override
    public List<SeoulMarketAreaDto> getAll() {
        return SEOUL_MARKET_AREA_REPOSITORY.findAll().stream()
                .map(SeoulMarketAreaDto::new)
                .collect(Collectors.toList());

    }

    @Override
    public List<SeoulMarketAreaDto> getAllBySggCd(Long sggCd) {
        return SEOUL_MARKET_AREA_REPOSITORY.findAllBySggCd(sggCd).stream()
                .map(SeoulMarketAreaDto::new)
                .collect(Collectors.toList());
    }

    @Override
    public List<SeoulMarketAreaDto> getAllByUmdCd(Long umdCd) {
        return SEOUL_MARKET_AREA_REPOSITORY.findAllByUmdCd(umdCd).stream()
                .map(SeoulMarketAreaDto::new)
                .collect(Collectors.toList());
    }
}
