package marketanalysis.market.service;

import marketanalysis.market.dto.SeoulUmdMarketChangeDto;
import marketanalysis.market.entity.SeoulUmdMarketChange;
import marketanalysis.market.repository.SeoulUmdMarketChangeRepository;
import marketanalysis.market.service.interfaces.SeoulUmdMarketChangeService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SeoulUmdMarketChangeServiceImplTest {

    @Autowired
    SeoulUmdMarketChangeService UMD_MARKET_CHANGE_SERVICE;

    @Autowired
    SeoulUmdMarketChangeRepository UMD_MARKET_CHANGE_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740700L,"둔촌2동","HL","상권축소", 120L, 52L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740690L,"둔촌1동","HH","정체", 172L, 72L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740685L,"길동","LL","다이나믹", 111L, 49L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740660L,"성내3동","HL","상권축소", 120L, 49L, 118L, 55L));
        UMD_MARKET_CHANGE_REPOSITORY.save(new SeoulUmdMarketChange(null, 2021L, 4L, 11740650L,"성내2동","LL","다이나믹", 117L, 49L, 118L, 55L));
    }

    @Test
    void getAllByUmd() {
        //given
        Long umdCd = 11740700L;

        //when
        List<SeoulUmdMarketChangeDto> result = UMD_MARKET_CHANGE_SERVICE.getAllByUmdCd(umdCd);

        //then
        assertThat(result.size()).isEqualTo(1);
    }

}