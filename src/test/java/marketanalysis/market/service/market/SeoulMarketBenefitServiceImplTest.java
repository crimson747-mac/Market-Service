package marketanalysis.market.service.market;

import marketanalysis.market.dto.SeoulMarketBenefitDto;
import marketanalysis.market.entity.SeoulMarketBenefit;
import marketanalysis.market.entity.enums.MarketTypeCd;
import marketanalysis.market.repository.SeoulMarketBenefitRepository;
import marketanalysis.market.service.interfaces.SeoulMarketBenefitService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class SeoulMarketBenefitServiceImplTest {

    @Autowired
    SeoulMarketBenefitService MARKET_BENEFIT_SERVICE;

    @Autowired
    SeoulMarketBenefitRepository MARKET_BENEFIT_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        SeoulMarketBenefit one = new SeoulMarketBenefit(null, 2021L, 4L, MarketTypeCd.A, "골목상권", 2110001L, "이북5도청사", 4305934L, "08", 520427635L, 129126028L, 64853632L, 37122367L, 65974602L, 88343761L, 22223650L, 14656697L, 76185341L, 21941557L);
        SeoulMarketBenefit two = new SeoulMarketBenefit(null, 2021L, 4L, MarketTypeCd.A, "골목상권", 2110002L, "독립문역 1번", 3463885L, "07", 232465205L, 54998987L, 28932090L, 17084860L, 28271372L, 40933079L, 10180461L, 6575012L, 35805283L, 9684061L);
        SeoulMarketBenefit three = new SeoulMarketBenefit(null, 2021L, 4L, MarketTypeCd.A, "골목상권", 2110003L, "세검정초등학교", 3548020L, "07", 1349699230L, 336704220L, 166150296L, 98720958L, 170559024L, 227367090L, 54707608L, 39088030L, 199219764L, 57182240L);

        MARKET_BENEFIT_REPOSITORY.save(one);
        MARKET_BENEFIT_REPOSITORY.save(two);
        MARKET_BENEFIT_REPOSITORY.save(three);
    }

    @Test
    void getAll() {
        //given

        //when
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAll();

        //then
        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    void getAllByYearsAndQuarter() {
        //given
        Long year = 2021L;
        Long quarter = 4L;

        //when
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByYearsAndQuarter(year, quarter);

        //then
        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    void getAllByMarketTypeCd() {
        //given
        String marketTypeCd = "A";
        MarketTypeCd typeCd = MarketTypeCd.getByCd(marketTypeCd);

        //when
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByMarketTypeCd(typeCd);

        //then
        assertThat(result.size()).isEqualTo(3);
    }

    @Test
    void getAllByMarketCd() {
        //given
        Long marketCd = 2110003L;

        //when
        List<SeoulMarketBenefitDto> result = MARKET_BENEFIT_SERVICE.getAllByMarketCd(marketCd);

        //then
        assertThat(result.size()).isEqualTo(1);
    }
}