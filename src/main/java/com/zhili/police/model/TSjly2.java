package com.zhili.police.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "T_SJLY_2")
public class TSjly2 {
    @Column(name = "ZJ")
    private String zj;

    @Column(name = "LY_XT")
    private String lyXt;

    @Column(name = "LY_SJK")
    private String lySjk;

    @Column(name = "LY_SJKYH")
    private String lySjkyh;

    @Column(name = "LY_SJB")
    private String lySjb;

    @Column(name = "XH")
    private BigDecimal xh;

    @Column(name = "JC")
    private String jc;

    @Column(name = "FL")
    private String fl;

    @Column(name = "SORT")
    private String sort;

    @Column(name = "SFXS")
    private String sfxs;

    @Column(name = "ZS")
    private String zs;

    @Column(name = "DB_USER")
    private String dbUser;

    @Column(name = "DB_PWD")
    private String dbPwd;

    @Column(name = "LASTUPDATEXH")
    private String lastupdatexh;

    @Column(name = "LASTUPDATETIME")
    private String lastupdatetime;

    @Column(name = "SFTB")
    private String sftb;

    @Column(name = "INDEX_NAME")
    private String indexName;

    @Column(name = "INDEX_SOURCE")
    private String indexSource;

    @Column(name = "YJZT")
    private String yjzt;

    @Column(name = "ZS_LASTUPDATETIME")
    private String zsLastupdatetime;

    @Column(name = "HBASE_ZS")
    private String hbaseZs;

    @Column(name = "HBASE_LASTUPDATETIME")
    private String hbaseLastupdatetime;

    @Column(name = "HBASE_LASTUPDATEXH")
    private String hbaseLastupdatexh;

    @Column(name = "ES_ZS")
    private String esZs;

    @Column(name = "ES_LASTUPDATETIME")
    private String esLastupdatetime;

    @Column(name = "ES_LASTUPDATEXH")
    private String esLastupdatexh;

    @Column(name = "UPDATETIME")
    private BigDecimal updatetime;

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
     * @return LY_XT
     */
    public String getLyXt() {
        return lyXt;
    }

    /**
     * @param lyXt
     */
    public void setLyXt(String lyXt) {
        this.lyXt = lyXt;
    }

    /**
     * @return LY_SJK
     */
    public String getLySjk() {
        return lySjk;
    }

    /**
     * @param lySjk
     */
    public void setLySjk(String lySjk) {
        this.lySjk = lySjk;
    }

    /**
     * @return LY_SJKYH
     */
    public String getLySjkyh() {
        return lySjkyh;
    }

    /**
     * @param lySjkyh
     */
    public void setLySjkyh(String lySjkyh) {
        this.lySjkyh = lySjkyh;
    }

    /**
     * @return LY_SJB
     */
    public String getLySjb() {
        return lySjb;
    }

    /**
     * @param lySjb
     */
    public void setLySjb(String lySjb) {
        this.lySjb = lySjb;
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
     * @return JC
     */
    public String getJc() {
        return jc;
    }

    /**
     * @param jc
     */
    public void setJc(String jc) {
        this.jc = jc;
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
     * @return SORT
     */
    public String getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
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
     * @return DB_USER
     */
    public String getDbUser() {
        return dbUser;
    }

    /**
     * @param dbUser
     */
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * @return DB_PWD
     */
    public String getDbPwd() {
        return dbPwd;
    }

    /**
     * @param dbPwd
     */
    public void setDbPwd(String dbPwd) {
        this.dbPwd = dbPwd;
    }

    /**
     * @return LASTUPDATEXH
     */
    public String getLastupdatexh() {
        return lastupdatexh;
    }

    /**
     * @param lastupdatexh
     */
    public void setLastupdatexh(String lastupdatexh) {
        this.lastupdatexh = lastupdatexh;
    }

    /**
     * @return LASTUPDATETIME
     */
    public String getLastupdatetime() {
        return lastupdatetime;
    }

    /**
     * @param lastupdatetime
     */
    public void setLastupdatetime(String lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    /**
     * @return SFTB
     */
    public String getSftb() {
        return sftb;
    }

    /**
     * @param sftb
     */
    public void setSftb(String sftb) {
        this.sftb = sftb;
    }

    /**
     * @return INDEX_NAME
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return INDEX_SOURCE
     */
    public String getIndexSource() {
        return indexSource;
    }

    /**
     * @param indexSource
     */
    public void setIndexSource(String indexSource) {
        this.indexSource = indexSource;
    }

    /**
     * @return YJZT
     */
    public String getYjzt() {
        return yjzt;
    }

    /**
     * @param yjzt
     */
    public void setYjzt(String yjzt) {
        this.yjzt = yjzt;
    }

    /**
     * @return ZS_LASTUPDATETIME
     */
    public String getZsLastupdatetime() {
        return zsLastupdatetime;
    }

    /**
     * @param zsLastupdatetime
     */
    public void setZsLastupdatetime(String zsLastupdatetime) {
        this.zsLastupdatetime = zsLastupdatetime;
    }

    /**
     * @return HBASE_ZS
     */
    public String getHbaseZs() {
        return hbaseZs;
    }

    /**
     * @param hbaseZs
     */
    public void setHbaseZs(String hbaseZs) {
        this.hbaseZs = hbaseZs;
    }

    /**
     * @return HBASE_LASTUPDATETIME
     */
    public String getHbaseLastupdatetime() {
        return hbaseLastupdatetime;
    }

    /**
     * @param hbaseLastupdatetime
     */
    public void setHbaseLastupdatetime(String hbaseLastupdatetime) {
        this.hbaseLastupdatetime = hbaseLastupdatetime;
    }

    /**
     * @return HBASE_LASTUPDATEXH
     */
    public String getHbaseLastupdatexh() {
        return hbaseLastupdatexh;
    }

    /**
     * @param hbaseLastupdatexh
     */
    public void setHbaseLastupdatexh(String hbaseLastupdatexh) {
        this.hbaseLastupdatexh = hbaseLastupdatexh;
    }

    /**
     * @return ES_ZS
     */
    public String getEsZs() {
        return esZs;
    }

    /**
     * @param esZs
     */
    public void setEsZs(String esZs) {
        this.esZs = esZs;
    }

    /**
     * @return ES_LASTUPDATETIME
     */
    public String getEsLastupdatetime() {
        return esLastupdatetime;
    }

    /**
     * @param esLastupdatetime
     */
    public void setEsLastupdatetime(String esLastupdatetime) {
        this.esLastupdatetime = esLastupdatetime;
    }

    /**
     * @return ES_LASTUPDATEXH
     */
    public String getEsLastupdatexh() {
        return esLastupdatexh;
    }

    /**
     * @param esLastupdatexh
     */
    public void setEsLastupdatexh(String esLastupdatexh) {
        this.esLastupdatexh = esLastupdatexh;
    }

    /**
     * @return UPDATETIME
     */
    public BigDecimal getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(BigDecimal updatetime) {
        this.updatetime = updatetime;
    }
}