package marketanalysis.market.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "seoul_umd_market_change")
@NoArgsConstructor
@AllArgsConstructor
public class SeoulUmdMarketChange {

    @Id @GeneratedValue
    private Long id;

    private Long year;

    private Long quarter;

    @Column(name = "umd_cd")
    private Long umdCd;

    @Column(name = "umd_cd_name")
    private String umdCdName;

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
