/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.model;

/**
 *
 * @author Amal
 */
public class Stocks {

    private int stocksId;
    private int modelId;
    private String modelNo;
    private int qty;
    private int status;

    /**
     * @return the stocksId
     */
    public int getStocksId() {
        return stocksId;
    }

    /**
     * @param stocksId the stocksId to set
     */
    public void setStocksId(int stocksId) {
        this.stocksId = stocksId;
    }

    /**
     * @return the modelId
     */
    public int getModelId() {
        return modelId;
    }

    /**
     * @param modelId the modelId to set
     */
    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    /**
     * @return the modelNo
     */
    public String getModelNo() {
        return modelNo;
    }

    /**
     * @param modelNo the modelNo to set
     */
    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
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
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
