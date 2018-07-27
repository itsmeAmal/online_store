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
public class PaymentHistoryDetail {
    
    private int paymentHistoryDetailId;
    private int paymentHistoryDetailPaymentId;
    private int paymentHistoryDetailLaptopModelId;
    private int paymentHistoryDetailQty;
    private double paymentHistoryDetailSoldPrice;
    private int paymentHistoryDetailStatus;

    /**
     * @return the paymentHistoryDetailId
     */
    public int getPaymentHistoryDetailId() {
        return paymentHistoryDetailId;
    }

    /**
     * @param paymentHistoryDetailId the paymentHistoryDetailId to set
     */
    public void setPaymentHistoryDetailId(int paymentHistoryDetailId) {
        this.paymentHistoryDetailId = paymentHistoryDetailId;
    }

    /**
     * @return the paymentHistoryDetailPaymentId
     */
    public int getPaymentHistoryDetailPaymentId() {
        return paymentHistoryDetailPaymentId;
    }

    /**
     * @param paymentHistoryDetailPaymentId the paymentHistoryDetailPaymentId to set
     */
    public void setPaymentHistoryDetailPaymentId(int paymentHistoryDetailPaymentId) {
        this.paymentHistoryDetailPaymentId = paymentHistoryDetailPaymentId;
    }

    /**
     * @return the paymentHistoryDetailLaptopModelId
     */
    public int getPaymentHistoryDetailLaptopModelId() {
        return paymentHistoryDetailLaptopModelId;
    }

    /**
     * @param paymentHistoryDetailLaptopModelId the paymentHistoryDetailLaptopModelId to set
     */
    public void setPaymentHistoryDetailLaptopModelId(int paymentHistoryDetailLaptopModelId) {
        this.paymentHistoryDetailLaptopModelId = paymentHistoryDetailLaptopModelId;
    }

    /**
     * @return the paymentHistoryDetailQty
     */
    public int getPaymentHistoryDetailQty() {
        return paymentHistoryDetailQty;
    }

    /**
     * @param paymentHistoryDetailQty the paymentHistoryDetailQty to set
     */
    public void setPaymentHistoryDetailQty(int paymentHistoryDetailQty) {
        this.paymentHistoryDetailQty = paymentHistoryDetailQty;
    }

    /**
     * @return the paymentHistoryDetailSoldPrice
     */
    public double getPaymentHistoryDetailSoldPrice() {
        return paymentHistoryDetailSoldPrice;
    }

    /**
     * @param paymentHistoryDetailSoldPrice the paymentHistoryDetailSoldPrice to set
     */
    public void setPaymentHistoryDetailSoldPrice(double paymentHistoryDetailSoldPrice) {
        this.paymentHistoryDetailSoldPrice = paymentHistoryDetailSoldPrice;
    }

    /**
     * @return the paymentHistoryDetailStatus
     */
    public int getPaymentHistoryDetailStatus() {
        return paymentHistoryDetailStatus;
    }

    /**
     * @param paymentHistoryDetailStatus the paymentHistoryDetailStatus to set
     */
    public void setPaymentHistoryDetailStatus(int paymentHistoryDetailStatus) {
        this.paymentHistoryDetailStatus = paymentHistoryDetailStatus;
    }
            
    
    
}
