/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.model;

/**
 *
 * @author 4m4l
 */
public class PaymentHistory {
    private int paymentHistoryId;
    private double paymentHistoryAmount;
    private String paymentHistoryCardType;
    private String paymentHistoryCardNo;
    private int paymentHistoryInvoiceId;
    private int paymentHistoryStatus;   

    /**
     * @return the paymentHistoryId
     */
    public int getPaymentHistoryId() {
        return paymentHistoryId;
    }

    /**
     * @param paymentHistoryId the paymentHistoryId to set
     */
    public void setPaymentHistoryId(int paymentHistoryId) {
        this.paymentHistoryId = paymentHistoryId;
    }

    /**
     * @return the paymentHistoryAmount
     */
    public double getPaymentHistoryAmount() {
        return paymentHistoryAmount;
    }

    /**
     * @param paymentHistoryAmount the paymentHistoryAmount to set
     */
    public void setPaymentHistoryAmount(double paymentHistoryAmount) {
        this.paymentHistoryAmount = paymentHistoryAmount;
    }

    /**
     * @return the paymentHistoryCardType
     */
    public String getPaymentHistoryCardType() {
        return paymentHistoryCardType;
    }

    /**
     * @param paymentHistoryCardType the paymentHistoryCardType to set
     */
    public void setPaymentHistoryCardType(String paymentHistoryCardType) {
        this.paymentHistoryCardType = paymentHistoryCardType;
    }

    /**
     * @return the paymentHistoryCardNo
     */
    public String getPaymentHistoryCardNo() {
        return paymentHistoryCardNo;
    }

    /**
     * @param paymentHistoryCardNo the paymentHistoryCardNo to set
     */
    public void setPaymentHistoryCardNo(String paymentHistoryCardNo) {
        this.paymentHistoryCardNo = paymentHistoryCardNo;
    }

    /**
     * @return the paymentHistoryInvoiceId
     */
    public int getPaymentHistoryInvoiceId() {
        return paymentHistoryInvoiceId;
    }

    /**
     * @param paymentHistoryInvoiceId the paymentHistoryInvoiceId to set
     */
    public void setPaymentHistoryInvoiceId(int paymentHistoryInvoiceId) {
        this.paymentHistoryInvoiceId = paymentHistoryInvoiceId;
    }

    /**
     * @return the paymentHistoryStatus
     */
    public int getPaymentHistoryStatus() {
        return paymentHistoryStatus;
    }

    /**
     * @param paymentHistoryStatus the paymentHistoryStatus to set
     */
    public void setPaymentHistoryStatus(int paymentHistoryStatus) {
        this.paymentHistoryStatus = paymentHistoryStatus;
    }
}
