package com.craik.stock.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="s_company")
public class CompanyEntity {
    private Integer id;
    private String companyName;
    private Long turnOver;
    private String ceo;
    private String directors;
    private String sectorCode;
    private String brief;
    private String stockCode;
    private String companyCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(Long turnOver) {
        this.turnOver = turnOver;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getSectorCode() {
        return sectorCode;
    }

    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
