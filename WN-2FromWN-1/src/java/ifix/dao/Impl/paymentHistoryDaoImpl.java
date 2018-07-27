/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.paymentHistoryDao;
import ifix.model.PaymentHistory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class paymentHistoryDaoImpl implements paymentHistoryDao {

    @Override
    public void addPaymentRecord(PaymentHistory paymentHistory) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO payment_history(payment_history_id, payment_history_amount, payment_history_card_type, payment_history_card-no, payment_history_invoice_id, payment_history_status) VALUES (?,?,?,?,?,?)");
        ps.setInt(1, paymentHistory.getPaymentHistoryId());
        ps.setDouble(2, paymentHistory.getPaymentHistoryAmount());
        ps.setString(3, paymentHistory.getPaymentHistoryCardType());
        ps.setString(4, paymentHistory.getPaymentHistoryCardNo());
        ps.setInt(5, paymentHistory.getPaymentHistoryInvoiceId());
        ps.setInt(6, paymentHistory.getPaymentHistoryStatus());
        ps.executeQuery();
        ps.close();
    }

    @Override
    public void updatePaymentRecord(PaymentHistory paymentHistory) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE payment_history SET payment_history_id=?, payment_history_amount=?, payment_history_card_type=?, payment_history_card-no=?, payment_history_invoice_id=?, payment_history_status=?WHERE payment_history_id=?");
        ps.setInt(1, paymentHistory.getPaymentHistoryId());
        ps.setDouble(2, paymentHistory.getPaymentHistoryAmount());
        ps.setString(3, paymentHistory.getPaymentHistoryCardType());
        ps.setString(4, paymentHistory.getPaymentHistoryCardNo());
        ps.setInt(5, paymentHistory.getPaymentHistoryInvoiceId());
        ps.setInt(6, paymentHistory.getPaymentHistoryStatus());
        ps.setInt(7, paymentHistory.getPaymentHistoryId());
        ps.executeQuery();
        ps.close();
    }

    @Override
    public void deletePaymentRecord(int paymentId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM payment_history WHERE payment_history_id=?");
        ps.setInt(1, paymentId);
        ps.executeQuery();
        ps.close();
    }
}
