package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulMarketArea;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeoulMarketAreaRepository extends JpaRepository<SeoulMarketArea, Long> {
    List<SeoulMarketArea> findAllByAreaCd(String areaCd);

    List<SeoulMarketArea> findAllBySggCd(Long sggCd);

    List<SeoulMarketArea> findAllByUmdCd(Long umdCd);
}
