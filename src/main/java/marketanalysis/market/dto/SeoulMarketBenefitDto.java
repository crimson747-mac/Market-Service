package marketanalysis.market.dto;

import lombok.Data;
import marketanalysis.market.entity.SeoulMarketBenefit;

@Data
public class SeoulMarketBenefitDto {
    private Long year;
    private Long quarter;
    private String marketTypeCdName;
    private Long marketCd;
    private String marketCdName;
    private Long monthAvgIncome;
    private Long expenseTotal;
    private Long foodTotal;
    private Long apparelTotal;
    private Long dailyNecessityTotal;
    private Long medicalTotal;
    private Long trafficTotal;
    private Long leisureTotal;
    private Long cultureTotal;
    private Long educationTotal;
    private Long pleasureTotal;

    public SeoulMarketBenefitDto(SeoulMarketBenefit seoulMarketBenefit) {
        this.year = seoulMarketBenefit.getYears();
        this.quarter = seoulMarketBenefit.getQuarter();
        this.marketTypeCdName = seoulMarketBenefit.getMarketTypeCdName();
        this.marketCd = seoulMarketBenefit.getMarketCd();
        this.marketCdName = seoulMarketBenefit.getMarketCdName();
        this.monthAvgIncome = seoulMarketBenefit.getMonthAvgIncome();
        this.expenseTotal = seoulMarketBenefit.getExpenseTotal();
        this.foodTotal = seoulMarketBenefit.getFoodTotal();
        this.apparelTotal = seoulMarketBenefit.getApparelTotal();
        this.dailyNecessityTotal = seoulMarketBenefit.getDailyNecessityTotal();
        this.medicalTotal = seoulMarketBenefit.getMedicalTotal();
        this.trafficTotal = seoulMarketBenefit.getTrafficTotal();
        this.leisureTotal = seoulMarketBenefit.getLeisureTotal();
        this.cultureTotal = seoulMarketBenefit.getCultureTotal();
        this.educationTotal = seoulMarketBenefit.getEducationTotal();
        this.pleasureTotal = seoulMarketBenefit.getPleasureTotal();
    }
}
