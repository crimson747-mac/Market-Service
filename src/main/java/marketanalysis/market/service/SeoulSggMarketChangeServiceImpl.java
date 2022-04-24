package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulSggMarketChangeDto;
import marketanalysis.market.repository.SeoulSggMarketChangeRepository;
import marketanalysis.market.service.interfaces.SeoulSggMarketChangeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SeoulSggMarketChangeServiceImpl implements SeoulSggMarketChangeService {

    private final SeoulSggMarketChangeRepository SEOUL_SGG_MARKET_CHANGE_REPOSITORY;

    @Override
    public List<SeoulSggMarketChangeDto> getAllBySggCd(Long sggCd) {
        return SEOUL_SGG_MARKET_CHANGE_REPOSITORY.findAllBySggCd(sggCd).stream()
                .map(SeoulSggMarketChangeDto::new)
                .collect(Collectors.toList());
    }
}
