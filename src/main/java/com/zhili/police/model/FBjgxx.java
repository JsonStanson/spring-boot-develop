package com.zhili.police.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "F_BJGXX")
public class FBjgxx {
    @Column(name = "ZJ")
    private String zj;

    @Column(name = "SJLY_ZJ")
    private String sjlyZj;

    @Column(name = "LM")
    private String lm;

    @Column(name = "LX")
    private String lx;

    @Column(name = "ZS")
    private String zs;

    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "FL")
    private String fl;

    @Column(name = "SFXS")
    private String sfxs;

    @Column(name = "BQM")
    private String bqm;

    @Column(name = "SYLX")
    private String sylx;

    @Column(name = "DA_SFXS")
    private String daSfxs;

    @Column(name = "DA_SORT")
    private String daSort;

    @Column(name = "DA_ORDERBY")
    private String daOrderby;

    /**
     * @return ZJ
     */
    public String getZj() {
        return zj;
    }

    /**
     * @param zj
     */
    public void setZj(String zj) {
        this.zj = zj;
    }

    /**
     * @return SJLY_ZJ
     */
    public String getSjlyZj() {
        return sjlyZj;
    }

    /**
     * @param sjlyZj
     */
    public void setSjlyZj(String sjlyZj) {
        this.sjlyZj = sjlyZj;
    }

    /**
     * @return LM
     */
    public String getLm() {
        return lm;
    }

    /**
     * @param lm
     */
    public void setLm(String lm) {
        this.lm = lm;
    }

    /**
     * @return LX
     */
    public String getLx() {
        return lx;
    }

    /**
     * @param lx
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * @return ZS
     */
    public String getZs() {
        return zs;
    }

    /**
     * @param zs
     */
    public void setZs(String zs) {
        this.zs = zs;
    }

    /**
     * @return XH
     */
    public BigDecimal getXh() {
        return xh;
    }

    /**
     * @param xh
     */
    public void setXh(BigDecimal xh) {
        this.xh = xh;
    }

    /**
     * @return FL
     */
    public String getFl() {
        return fl;
    }

    /**
     * @param fl
     */
    public void setFl(String fl) {
        this.fl = fl;
    }

    /**
     * @return SFXS
     */
    public String getSfxs() {
        return sfxs;
    }

    /**
     * @param sfxs
     */
    public void setSfxs(String sfxs) {
        this.sfxs = sfxs;
    }

    /**
     * @return BQM
     */
    public String getBqm() {
        return bqm;
    }

    /**
     * @param bqm
     */
    public void setBqm(String bqm) {
        this.bqm = bqm;
    }

    /**
     * @return SYLX
     */
    public String getSylx() {
        return sylx;
    }

    /**
     * @param sylx
     */
    public void setSylx(String sylx) {
        this.sylx = sylx;
    }

    /**
     * @return DA_SFXS
     */
    public String getDaSfxs() {
        return daSfxs;
    }

    /**
     * @param daSfxs
     */
    public void setDaSfxs(String daSfxs) {
        this.daSfxs = daSfxs;
    }

    /**
     * @return DA_SORT
     */
    public String getDaSort() {
        return daSort;
    }

    /**
     * @param daSort
     */
    public void setDaSort(String daSort) {
        this.daSort = daSort;
    }

    /**
     * @return DA_ORDERBY
     */
    public String getDaOrderby() {
        return daOrderby;
    }

    /**
     * @param daOrderby
     */
    public void setDaOrderby(String daOrderby) {
        this.daOrderby = daOrderby;
    }
}