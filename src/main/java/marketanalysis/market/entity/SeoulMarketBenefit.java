package marketanalysis.market.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import marketanalysis.market.entity.enums.MarketTypeCd;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "market_benefit")
@NoArgsConstructor
@AllArgsConstructor
public class SeoulMarketBenefit {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "years")
    private Long years;

    @Column(name = "quarter")
    private Long quarter;

    @Enumerated
    @Column(name = "market_type_cd")
    private MarketTypeCd marketTypeCd;

    @Column(name = "market_type_cd_name")
    private String marketTypeCdName;

    @Column(name = "market_cd")
    private Long marketCd;

    @Column(name = "market_cd_name")
    private String marketCdName;

    @Column(name = "month_avg_income")
    private Long monthAvgIncome;

    @Column(name = "month_avg_income_index")
    private Long monthAvgIncomeIndex;

    @Column(name = "expense_total")
    private Long expenseTotal;

    @Column(name = "food_total")
    private Long foodTotal;

    @Column(name = "apparel_total")
    private Long apparelTotal;

    @Column(name = "deily_necessity_total")
    private Long dailyNecessityTotal;

    @Column(name = "medical_total")
    private Long medicalTotal;

    @Column(name = "traffic_total")
    private Long trafficTotal;

    @Column(name = "leisure_total")
    private Long leisureTotal;

    @Column(name = "colture_total")
    private Long cultureTotal;

    @Column(name = "education_total")
    private Long educationTotal;

    @Column(name = "pleasure_total")
    private Long pleasureTotal;
}
