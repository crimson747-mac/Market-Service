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

    public static MarketTypeCd getByCd(String code) {
        switch (code) {
            case "U": return MarketTypeCd.U;
            case "R": return MarketTypeCd.R;
            case "D": return MarketTypeCd.D;
            case "A": return MarketTypeCd.A;
            default: throw new IllegalArgumentException("일치하는 MarketType을 찾을 수 없습니다.");
        }
    }
}
