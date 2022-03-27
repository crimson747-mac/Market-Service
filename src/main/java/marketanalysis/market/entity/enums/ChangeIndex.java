package marketanalysis.market.entity.enums;

public enum ChangeIndex {
    LL("다이나믹"),
    LH("상권확장"),
    HH("정체"),
    HL("상권축소");

    private String indexName;

    ChangeIndex(String indexName) {
        this.indexName = indexName;
    }

    public static String getIndexName(String index) {
        if(index.equals(LL.toString())) return LL.indexName;
        if(index.equals(LH.toString())) return LH.indexName;
        if(index.equals(HH.toString())) return HH.indexName;
        if(index.equals(HL.toString())) return HL.indexName;
        throw new IllegalArgumentException("일치하는 지표값이 존재하지 않습니다.");
    }
}
