package marketanalysis.market.dto;

import lombok.Data;
import marketanalysis.market.entity.SeoulSggMarketChange;

@Data
public class SeoulSggMarketChangeDto {
    private Long id;
    private Long year;
    private Long quarter;
    private Long sggCd;
    private String sggCdName;
    private String changeIndex;
    private String changeIndexName;
    private Long runAvgMonth;
    private Long closeAvgMonth;

    public SeoulSggMarketChangeDto(SeoulSggMarketChange entity) {
        this.id = entity.getId();
        this.year = entity.getYear();
        this.quarter = entity.getQuarter();
        this.sggCd = entity.getSggCd();
        this.sggCdName = entity.getSggCdName();
        this.changeIndex = entity.getChangeIndex();
        this.changeIndexName = entity.getChangeIndexName();
        this.runAvgMonth = entity.getRunAvgMonth();
        this.closeAvgMonth = entity.getCloseAvgMonth();
    }
}
