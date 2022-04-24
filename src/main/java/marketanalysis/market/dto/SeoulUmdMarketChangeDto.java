package marketanalysis.market.dto;

import lombok.Data;
import marketanalysis.market.entity.SeoulUmdMarketChange;

@Data
public class SeoulUmdMarketChangeDto {
    private Long id;
    private Long year;
    private Long quarter;
    private Long umdCd;
    private String umdCdName;
    private String changeIndex;
    private String changeIndexName;
    private Long runAvgMonth;
    private Long closeAvgMonth;

    public SeoulUmdMarketChangeDto(SeoulUmdMarketChange entity) {
        this.id = entity.getId();
        this.year = entity.getYear();
        this.quarter = entity.getQuarter();
        this.umdCd = entity.getUmdCd();
        this.umdCdName = entity.getUmdCdName();
        this.changeIndex = entity.getChangeIndex();
        this.changeIndexName = entity.getChangeIndexName();
        this.runAvgMonth = entity.getRunAvgMonth();
        this.closeAvgMonth = entity.getCloseAvgMonth();
    }
}
