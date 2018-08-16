/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author 4m4l
 */
public class Invoice {

    private int invoiceId;
    private Date invoiceDate;
    private Time invoiceTime;
    private int invoiceUserId;
    private int invoiceStatus;
    private int invoiceDeleverStatus;
    private BigDecimal invoiceTotal;
    private String address;
    private String city;
    private String country;
    private int qty;
    private String custName;

    /**
     * @return the invoiceId
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * @param invoiceId the invoiceId to set
     */
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * @return the invoiceDate
     */
    public Date getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * @param invoiceDate the invoiceDate to set
     */
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    /**
     * @return the invoiceTime
     */
    public Time getInvoiceTime() {
        return invoiceTime;
    }

    /**
     * @param invoiceTime the invoiceTime to set
     */
    public void setInvoiceTime(Time invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    /**
     * @return the invoiceUserId
     */
    public int getInvoiceUserId() {
        return invoiceUserId;
    }

    /**
     * @param invoiceUserId the invoiceUserId to set
     */
    public void setInvoiceUserId(int invoiceUserId) {
        this.invoiceUserId = invoiceUserId;
    }

    /**
     * @return the invoiceStatus
     */
    public int getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * @param invoiceStatus the invoiceStatus to set
     */
    public void setInvoiceStatus(int invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * @return the invoiceDeleverStatus
     */
    public int getInvoiceDeleverStatus() {
        return invoiceDeleverStatus;
    }

    /**
     * @param invoiceDeleverStatus the invoiceDeleverStatus to set
     */
    public void setInvoiceDeleverStatus(int invoiceDeleverStatus) {
        this.invoiceDeleverStatus = invoiceDeleverStatus;
    }

    /**
     * @return the invoiceTotal
     */
    public BigDecimal getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * @param invoiceTotal the invoiceTotal to set
     */
    public void setInvoiceTotal(BigDecimal invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }
}
