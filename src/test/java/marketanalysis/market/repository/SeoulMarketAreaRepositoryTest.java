package marketanalysis.market.repository;

import marketanalysis.market.entity.SeoulMarketArea;
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

@SpringBootTest
@Transactional
class SeoulMarketAreaRepositoryTest {

    @Autowired SeoulMarketAreaRepository MARKET_AREA_REPOSITORY;

    @BeforeEach
    void beforeEach() {
        MARKET_AREA_REPOSITORY.save(
                new SeoulMarketArea(null, 201810L, "A", "골목상권", 1000275L, "보문로26길", 201886L, 454183L, 11290L, 11290600L, ""));
        MARKET_AREA_REPOSITORY.save(
                new SeoulMarketArea(null, 201810L, "A", "골목상권", 1000276L, "보문로31길", 201385L, 454290L, 11290L, 11290555L, ""));
        MARKET_AREA_REPOSITORY.save(
                new SeoulMarketArea(null, 201810L, "D", "발달상권", 1001045L, "동작구 총신대입구역_1", 198304L, 442948L, 11590L, 11590630L, ""));
        MARKET_AREA_REPOSITORY.save(
                new SeoulMarketArea(null, 201810L, "D", "발달상권", 1001046L, "서울 관악구 신림역_4", 193828L, 443001L, 11620L, 11620695L, ""));
        MARKET_AREA_REPOSITORY.save(
                new SeoulMarketArea(null, 201810L, "D", "발달상권", 1001047L, "뱅뱅사거리_1", 443242L, 11680L, 11680L, 11680655L, ""));
    }

    @Test
    @DisplayName("성공) MARKET_AREA 정보 저장")
    void save() {
        //given
        SeoulMarketArea seoulMarketArea = new SeoulMarketArea(null, 201810L, "A", "골목상권", 1000275L, "보문로26길", 201886L, 454183L, 11290L, 11290600L, "");

        //when
        SeoulMarketArea result = MARKET_AREA_REPOSITORY.save(seoulMarketArea);

        //then
        assertThat(result.getId()).isNotNull();
    }

    @Test
    @DisplayName("성공) AreaCd를 활용하여 MARKET_AREA 정보 조회")
    void findAllByAreaCd() {
        //given
        String areaCd = "A";

        //when
        List<SeoulMarketArea> result = MARKET_AREA_REPOSITORY.findAllByAreaCd(areaCd);

        //then
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("성공) sggCd 활용하여 MARKET_AREA 정보 조회")
    void findAllBySggCd() {
        //given
        Long sggCd = 11290L;

        //when
        List<SeoulMarketArea> result = MARKET_AREA_REPOSITORY.findAllBySggCd(sggCd);

        //then
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("성공) umdCd 활용하여 MARKET_AREA 정보 조회")
    void findAllByUmdCd() {
        //given
        Long umdCd = 11290600L;

        //when
        List<SeoulMarketArea> result = MARKET_AREA_REPOSITORY.findAllByUmdCd(umdCd);

        //then
        assertThat(result.size()).isEqualTo(1);
    }
}