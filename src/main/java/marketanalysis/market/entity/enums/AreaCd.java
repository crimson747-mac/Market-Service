package marketanalysis.market.entity.enums;

public enum AreaCd {
    A("골목상권"),
    D("발달상권"),
    R("전통시장"),
    U("관광특구");

    private String AreaCdName;

    AreaCd(String areaCdName) {
        AreaCdName = areaCdName;
    }

    public String getCdName(String cd) {
        if(cd.equals(A.toString())) return A.AreaCdName;
        if(cd.equals(D.toString())) return D.AreaCdName;
        if(cd.equals(R.toString())) return R.AreaCdName;
        if(cd.equals(U.toString())) return U.AreaCdName;
        throw new IllegalArgumentException("일치하는 상권 코드가 없습니다.");
    }
}
