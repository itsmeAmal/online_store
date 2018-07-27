/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.Validations;
import ifix.dao.Impl.paymentHistoryDetailDaoImpl;
import ifix.model.PaymentHistoryDetail;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class paymentHistoryDetailController {

    public static boolean addPaymentHistoryDetail(String paymentHistoryId, String paymentId, String laptopModelId, String qty, String soldPrice, String status) throws SQLException {
        if (Validations.isNotEmpty(paymentHistoryId) && Validations.isNotEmpty(paymentId) && Validations.isNotEmpty(qty) && Validations.isNotEmpty(soldPrice)) {
            paymentHistoryDetailDaoImpl paymenthistoryDetailDaoImpl = new paymentHistoryDetailDaoImpl();
            PaymentHistoryDetail paymentHistoryDetail = new PaymentHistoryDetail();
            paymentHistoryDetail.setPaymentHistoryDetailId(Validations.getIntOrZeroFromString(paymentHistoryId));
            paymentHistoryDetail.setPaymentHistoryDetailPaymentId(Validations.getIntOrZeroFromString(paymentId));
            paymentHistoryDetail.setPaymentHistoryDetailLaptopModelId(Validations.getIntOrZeroFromString(laptopModelId));
            paymentHistoryDetail.setPaymentHistoryDetailQty(Validations.getIntOrZeroFromString(qty));
            paymentHistoryDetail.setPaymentHistoryDetailSoldPrice(Validations.getIntOrZeroFromString(soldPrice));
            paymentHistoryDetail.setPaymentHistoryDetailStatus(Validations.getIntOrZeroFromString(status));
            paymenthistoryDetailDaoImpl.addPaymentHistoryDetail(paymentHistoryDetail);
            return true;
        } else {
            return false;
        }
    }

    public static boolean removePaymentHistoryDetail(String paymentHistoryDetailId) throws SQLException {
        paymentHistoryDetailDaoImpl historyDetailDaoImpl = new paymentHistoryDetailDaoImpl();
        historyDetailDaoImpl.deletePaymentHistoryDetail(Validations.getIntOrZeroFromString(paymentHistoryDetailId));
        return true;
    }

    public static boolean getAllPaymentHistorydetails() throws SQLException {
        paymentHistoryDetailDaoImpl paymHistoryDetailDaoImpl = new paymentHistoryDetailDaoImpl();
        paymHistoryDetailDaoImpl.getAllPaymentHistoryDetails();
        return true;
    }
    
    

}
