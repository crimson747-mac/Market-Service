package marketanalysis.market.utils.convert;

import marketanalysis.market.entity.*;
import marketanalysis.market.entity.enums.MarketTypeCd;

import java.util.List;

public class StringRowConverter {

    public static Object get(EntityType type, List<String> tableRow) {
        switch (type) {
            case MARKET_AREA: return toSeoulMarketArea(tableRow);
            case MARKET_STORE: return toSeoulMarketStore(tableRow);
            case MARKET_BENEFIT: return toSeoulMarketBenefit(tableRow);
            case MARKET_SGG_CHANGE: return toSeoulSggChange(tableRow);
            case MARKET_UMD_CHANGE: return toSeoulUmdChange(tableRow);
            default: throw new IllegalArgumentException("일차하는 타입이 변환기가 없습니다.");
        }
    }

    private static SeoulMarketArea toSeoulMarketArea(List<String> tableRow) {
        return new SeoulMarketArea(
                null,
                Long.parseLong(tableRow.get(0)),
                tableRow.get(1),
                tableRow.get(2),
                Long.parseLong(tableRow.get(3)),
                tableRow.get(4),
                Long.parseLong(tableRow.get(5)),
                Long.parseLong(tableRow.get(6)),
                Long.parseLong(tableRow.get(7)),
                Long.parseLong(tableRow.get(8)),
                tableRow.get(9));
    }

    private static SeoulMarketStore toSeoulMarketStore(List<String> tableRow) {
        return new SeoulMarketStore(
            null,
            Long.parseLong(tableRow.get(0)),
            Long.parseLong(tableRow.get(1)),
            MarketTypeCd.getByCd(tableRow.get(2)),
            tableRow.get(3),
            Long.parseLong(tableRow.get(4)),
            tableRow.get(5),
            tableRow.get(6),
            tableRow.get(7),
            Long.parseLong(tableRow.get(8)),
            Long.parseLong(tableRow.get(9)),
            Long.parseLong(tableRow.get(10)),
            Long.parseLong(tableRow.get(11)),
            Long.parseLong(tableRow.get(12)),
            Long.parseLong(tableRow.get(13)),
            Long.parseLong(tableRow.get(14))
        );
    }

    private static SeoulMarketBenefit toSeoulMarketBenefit(List<String> tableRow) {
        return new SeoulMarketBenefit(
                null,
                Long.parseLong(tableRow.get(0).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(0)),
                Long.parseLong(tableRow.get(1).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(1)),
                MarketTypeCd.getByCd(tableRow.get(2)),
                tableRow.get(3),
                Long.parseLong(tableRow.get(4).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(4)),
                tableRow.get(5),
                Long.parseLong(tableRow.get(6).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(6)),
                tableRow.get(7),
                Long.parseLong(tableRow.get(8).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(8)),
                Long.parseLong(tableRow.get(9).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(9)),
                Long.parseLong(tableRow.get(10).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(10)),
                Long.parseLong(tableRow.get(11).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(11)),
                Long.parseLong(tableRow.get(12).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(12)),
                Long.parseLong(tableRow.get(13).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(13)),
                Long.parseLong(tableRow.get(14).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(14)),
                Long.parseLong(tableRow.get(15).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(15)),
                Long.parseLong(tableRow.get(16).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(16)),
                Long.parseLong(tableRow.get(17).trim().isEmpty() ? String.valueOf(0L) : tableRow.get(17))
        );
    }

    private static SeoulSggMarketChange toSeoulSggChange(List<String> tableRow) {
        return  new SeoulSggMarketChange(
                null,
                Long.parseLong(tableRow.get(0)),
                Long.parseLong(tableRow.get(1)),
                Long.parseLong(tableRow.get(2)),
                tableRow.get(3),
                tableRow.get(4),
                tableRow.get(5),
                Long.parseLong(tableRow.get(6)),
                Long.parseLong(tableRow.get(7)),
                Long.parseLong(tableRow.get(8)),
                Long.parseLong(tableRow.get(9))
        );
    }

    private static SeoulUmdMarketChange toSeoulUmdChange(List<String> tableRow) {
        return new SeoulUmdMarketChange(
                null,
                Long.parseLong(tableRow.get(0)),
                Long.parseLong(tableRow.get(1)),
                Long.parseLong(tableRow.get(2)),
                tableRow.get(3),
                tableRow.get(4),
                tableRow.get(5),
                Long.parseLong(tableRow.get(6)),
                Long.parseLong(tableRow.get(7)),
                Long.parseLong(tableRow.get(8)),
                Long.parseLong(tableRow.get(9))
        );
    }

}
