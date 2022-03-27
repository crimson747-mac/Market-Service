package marketanalysis.market.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "market_area")
public class SeoulMarketArea {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "year_month")
    private Long yearAndMonth;

    @Column(name = "area_cd")
    private String areaCd;

    @Column(name = "area_cd_name")
    private String areaCdName;

    @Column(name = "market_cd")
    private Long marketCd;

    @Column(name = "market_cd_name")
    private String marketCdName;

    private Long x;

    private Long y;

    @Column(name = "sgg_cd")
    private Long sggCd;

    @Column(name = "umd_cd")
    private Long umdCd;

    private String etc;
}
