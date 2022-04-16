package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulSggMarketChange;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class SeoulSggMarketChangeRepositoryTest {

    @Autowired SeoulSggMarketChangeRepository SGG_MARKET_CHANGE_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        SGG_MARKET_CHANGE_REPOSITORY.save(new SeoulSggMarketChange(null,2021L,4L,11740L,"강동구","LL","다이나믹",112L,52L,118L,55L));
        SGG_MARKET_CHANGE_REPOSITORY.save(new SeoulSggMarketChange(null,2021L,4L,11710L,"송파구","LL","다이나믹",117L,55L,118L,55L));
        SGG_MARKET_CHANGE_REPOSITORY.save(new SeoulSggMarketChange(null,2021L,4L,11680L,"강남구","LL","다이나믹",110L,51L,118L,55L));
        SGG_MARKET_CHANGE_REPOSITORY.save(new SeoulSggMarketChange(null,2021L,4L,11650L,"서초구","HH","정체",128L,56L,118L,55L));
        SGG_MARKET_CHANGE_REPOSITORY.save(new SeoulSggMarketChange(null,2021L,4L,11620L,"관악구","LL","다이나믹",114L,53L,118L,55L));
    }

    @Test
    @DisplayName("성공) seoulSggMarketChange 저장")
    void save() {
        //given
        SeoulSggMarketChange seoulSggMarketChange = new SeoulSggMarketChange(null, 2021L, 4L, 11590L, "동작구", "HH", "정체", 122L, 59L, 118L, 55L);

        //when
        SeoulSggMarketChange result = SGG_MARKET_CHANGE_REPOSITORY.save(seoulSggMarketChange);

        //then
        assertThat(result.getId()).isNotNull();
    }

    @Test
    @DisplayName("성공) sggCd로 seoulSggMarketChange 조회")
    void findAllBySggCd() {
        //given
        Long sggCd = 11740L;

        //when
        List<SeoulSggMarketChange> result = SGG_MARKET_CHANGE_REPOSITORY.findAllBySggCd(sggCd);

        //then
        assertThat(result.size()).isEqualTo(1);
    }
}