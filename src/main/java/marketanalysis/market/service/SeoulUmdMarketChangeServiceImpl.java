package marketanalysis.market.service;

import lombok.RequiredArgsConstructor;
import marketanalysis.market.dto.SeoulUmdMarketChangeDto;
import marketanalysis.market.repository.SeoulUmdMarketChangeRepository;
import marketanalysis.market.service.interfaces.SeoulUmdMarketChangeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class SeoulUmdMarketChangeServiceImpl implements SeoulUmdMarketChangeService {

    private final SeoulUmdMarketChangeRepository SEOUL_UMD_MARKET_CHANGE_REPOSITORY;

    @Override
    public List<SeoulUmdMarketChangeDto> getAllByUmdCd(Long umdCd) {
        return SEOUL_UMD_MARKET_CHANGE_REPOSITORY.findAllByUmdCd(umdCd).stream()
                .map(SeoulUmdMarketChangeDto::new)
                .collect(Collectors.toList());

    }
}
