package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulUmdMarketChange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeoulUmdMarketChangeRepository extends JpaRepository<SeoulUmdMarketChange, Long> {
    List<SeoulUmdMarketChange> findAllByUmdCd(Long umdCd);
}
