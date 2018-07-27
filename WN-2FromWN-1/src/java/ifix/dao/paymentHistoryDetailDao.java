/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.PaymentHistoryDetail;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface paymentHistoryDetailDao {
    
    void addPaymentHistoryDetail(PaymentHistoryDetail paymentHistoryDetail)throws SQLException;
    
    void updatePaymentHistoryDetail(PaymentHistoryDetail paymentHistoryDetail)throws SQLException;
    
    void deletePaymentHistoryDetail(int paymentHistoryId) throws SQLException;
    
    ResultSet getAllPaymentHistoryDetails() throws SQLException;
    
}
