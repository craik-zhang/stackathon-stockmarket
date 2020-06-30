package com.craik.stock.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="s_ipo")
public class IpoEntity {
    private Integer id;
    private String companyName;
    private String stockExchange;
    private Double pricePerShare;
    private Integer numOfShares;
    private Date openDateTime;
    private String remarks;
    @Id
    @GeneratedValue
    @Column(name="id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name="COMPANY_NAME")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Column(name="STOCK_EXCHANGE")
    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    @Column(name="PRICE_PER_SHARE")
    public Double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(Double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    @Column(name="NUM_OF_SHARES")
    public Integer getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(Integer numOfShares) {
        this.numOfShares = numOfShares;
    }

    @Column(name="OPEN_DATE_TIME")
    public Date getOpenDateTime() {
        return openDateTime;
    }

    public void setOpenDateTime(Date openDateTime) {
        this.openDateTime = openDateTime;
    }

    @Column(name="REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
