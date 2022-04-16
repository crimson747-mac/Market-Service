package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulUmdMarketChange;
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
class SeoulUmdMarketChangeRepositoryTest {

    @Autowired SeoulUmdMarketChangeRepository UMD_MARKET_CHANGE_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740700L,"둔촌2동","HL","상권축소", 120L, 52L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740690L,"둔촌1동","HH","정체", 172L, 72L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740685L,"길동","LL","다이나믹", 111L, 49L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740660L,"성내3동","HL","상권축소", 120L, 49L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740650L,"성내2동","LL","다이나믹", 117L, 49L, 118L, 55L));
    }

    @Test
    @DisplayName("성공) SeoulUmdMarketChange 저장")
    void save() {
        //given
        SeoulUmdMarketChange seoulUmdMarketChange = new SeoulUmdMarketChange(null, 2021L, 4L, 11740640L, "성내1동", "LL", "다이나믹", 117L, 53L, 118L, 55L);

        //when
        SeoulUmdMarketChange result = UMD_MARKET_CHANGE_REPOSITORY.save(seoulUmdMarketChange);

        //then
        assertThat(result.getId()).isNotNull();
    }

    @Test
    @DisplayName("성공) umdCd로 SeoulUmdMarketChange 정보 조회")
    void findAllByUmdCd() {
        //given
        Long umdCd = 11740660L;

        //when
        List<SeoulUmdMarketChange> result = UMD_MARKET_CHANGE_REPOSITORY.findAllByUmdCd(umdCd);

        //then
        assertThat(result.size()).isEqualTo(1);
    }
}