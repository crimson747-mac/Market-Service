package marketanalysis.market.dto;

import lombok.Data;
import marketanalysis.market.entity.SeoulMarketArea;

@Data
public class SeoulMarketAreaDto {
    private Long id;
    private String areaCd;
    private String areaCdName;
    private Long marketCd;
    private String marketCdName;
    private Long sggCd;
    private Long umdCd;

    public SeoulMarketAreaDto(SeoulMarketArea seoulMarketArea) {
        this.id = seoulMarketArea.getId();
        this.areaCd = seoulMarketArea.getAreaCd();
        this.areaCdName = seoulMarketArea.getAreaCdName();
        this.marketCd = seoulMarketArea.getMarketCd();
        this.marketCdName = seoulMarketArea.getMarketCdName();
        this.sggCd = seoulMarketArea.getSggCd();
        this.umdCd = seoulMarketArea.getUmdCd();
    }

}
