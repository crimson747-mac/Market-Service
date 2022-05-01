package marketanalysis.market.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import marketanalysis.market.entity.enums.store.MarketTypeCd;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "seoul_market_store")
public class SeoulMarketStore {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "years")
    private Long year;

    @Column(name = "quarter")
    private Long quarter;

    @Enumerated(EnumType.STRING)
    @Column(name = "market_type_cd")
    private MarketTypeCd marketTypeCd;

    @Column(name = "market_type_cd_name")
    private String marketTypeCdName;

    @Column(name = "market_cd")
    private Long marketCd;

    @Column(name = "market_cd_name")
    private String marketCdName;

    @Column(name = "service_type_cd")
    private String serviceTypeCd;

    @Column(name = "service_type_cd_name")
    private String serviceTypeCdName;

    @Column(name = "store_cnt")
    private Long storeCnt;

    @Column(name = "similar_store_cnt")
    private Long similarStoreCnt;

    @Column(name = "open_rate")
    private Long openRate;

    @Column(name = "open_cnt")
    private Long openCnt;

    @Column(name = "close_rate")
    private Long closeRate;

    @Column(name = "close_cnt")
    private Long closeCnt;

    @Column(name = "franchise_cnt")
    private Long franchiseCnt;
}
