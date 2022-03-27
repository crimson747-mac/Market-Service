package marketanalysis.market.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "seoul_sgg_market_change")
public class SeoulSggMarketChange {

    @Id @GeneratedValue
    private Long id;

    private Long quarter;

    @Column(name = "sgg_cd")
    private Long sggCd;

    @Column(name = "sgg_cd_name")
    private String sggCdName;

    @Column(name = "market_change_index")
    private String changeIndex;

    @Column(name = "market_change_index_name")
    private String changeIndexName;

    @Column(name = "run_avg_month")
    private Long runAvgMonth;

    @Column(name = "close_avg_month")
    private Long closeAvgMonth;

    @Column(name = "seoul_run_avg_month")
    private Long seoulRunAvgMonth;

    @Column(name = "seoul_close_avg_month")
    private Long seoulCloseAvgMonth;

}
