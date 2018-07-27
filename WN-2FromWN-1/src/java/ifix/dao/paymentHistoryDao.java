/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.PaymentHistory;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface paymentHistoryDao {
    void addPaymentRecord(PaymentHistory paymentHistory)throws SQLException;
    
    void updatePaymentRecord(PaymentHistory paymentHistory)throws SQLException;
    
    void deletePaymentRecord(int paymentId) throws SQLException;
    
}
