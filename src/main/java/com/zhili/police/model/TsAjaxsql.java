package com.zhili.police.model;

import javax.persistence.*;

@Table(name = "TS_AJAXSQL")
public class TsAjaxsql {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String code;

    @Column(name = "sqlText")
    private String sqltext;

    private String url;

    private Integer enabled;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return sqlText
     */
    public String getSqltext() {
        return sqltext;
    }

    /**
     * @param sqltext
     */
    public void setSqltext(String sqltext) {
        this.sqltext = sqltext;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}