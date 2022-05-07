package marketanalysis.market.entity.enums;

public enum MarketTypeCd {
    U("관광 특구"),
    R("전통 시장"),
    D("발달 상권"),
    A("골목 상권");

    private String cdName;

    MarketTypeCd(String cdName) {
        this.cdName = cdName;
    }

    public String getCdName() {
        return this.cdName;
    }
}
