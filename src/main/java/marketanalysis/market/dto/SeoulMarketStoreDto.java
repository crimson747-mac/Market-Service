package marketanalysis.market.dto;

import lombok.Data;
import marketanalysis.market.entity.SeoulMarketStore;

@Data
public class SeoulMarketStoreDto {
    private Long year;
    private Long quarter;
    private String marketTypeCdName;
    private Long marketCd;
    private String marketCdName;
    private String serviceTypeName;
    private Long storeCnt;
    private Long similarStoreCnt;
    private Long openRate;
    private Long openCnt;
    private Long closeRate;
    private Long closeCnt;
    private Long franchiseCnt;

    public SeoulMarketStoreDto(SeoulMarketStore store) {
        this.year = store.getYear();
        this.quarter = store.getQuarter();
        this.marketTypeCdName = store.getMarketTypeCdName();
        this.marketCd = store.getMarketCd();
        this.marketCdName = store.getMarketCdName();
        this.serviceTypeName = store.getServiceTypeCdName();
        this.storeCnt = store.getStoreCnt();
        this.similarStoreCnt = store.getSimilarStoreCnt();
        this.openRate = store.getOpenRate();
        this.openCnt = store.getOpenCnt();
        this.closeRate = store.getCloseRate();
        this.closeCnt = store.getCloseCnt();
        this.franchiseCnt = store.getFranchiseCnt();
    }

}
