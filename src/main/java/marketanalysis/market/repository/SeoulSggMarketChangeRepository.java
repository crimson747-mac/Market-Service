package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulSggMarketChange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeoulSggMarketChangeRepository extends JpaRepository<SeoulSggMarketChange, Long> {
    List<SeoulSggMarketChange> findAllBySggCd(Long sggCd);
}
