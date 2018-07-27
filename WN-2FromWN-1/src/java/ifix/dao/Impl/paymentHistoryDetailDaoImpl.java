/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.paymentHistoryDetailDao;
import ifix.model.PaymentHistoryDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class paymentHistoryDetailDaoImpl implements paymentHistoryDetailDao {

    private String selectQuery = "SELECT payment_history_detail_id, payment_history_detail_payment_id, payment_history_detail_laptop_model_id, payment_history_detail_qty, payment_history_detail_sold_price, payment_history_detail_status FROM payment_history_detail";

    @Override
    public void addPaymentHistoryDetail(PaymentHistoryDetail paymentHistoryDetail) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO payment_history_detail(payment_history_detail_id, payment_history_detail_payment_id, payment_history_detail_laptop_model_id, payment_history_detail_qty, payment_history_detail_sold_price, payment_history_detail_status) VALUES (?,?,?,?,?,?)");
        ps.setInt(1, paymentHistoryDetail.getPaymentHistoryDetailId());
        ps.setInt(2, paymentHistoryDetail.getPaymentHistoryDetailPaymentId());
        ps.setInt(3, paymentHistoryDetail.getPaymentHistoryDetailLaptopModelId());
        ps.setInt(4, paymentHistoryDetail.getPaymentHistoryDetailQty());
        ps.setDouble(5, paymentHistoryDetail.getPaymentHistoryDetailSoldPrice());
        ps.setInt(6, paymentHistoryDetail.getPaymentHistoryDetailStatus());
        ps.executeQuery();
        ps.close();
    }

    @Override
    public void updatePaymentHistoryDetail(PaymentHistoryDetail paymentHistoryDetail) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE payment_history_detail SET payment_history_detail_id=?, payment_history_detail_payment_id=?, payment_history_detail_laptop_model_id=?, payment_history_detail_qty=?, payment_history_detail_sold_price=?, payment_history_detail_status=? WHERE payment_history_detail_id=?");
        ps.setInt(1, paymentHistoryDetail.getPaymentHistoryDetailId());
        ps.setInt(2, paymentHistoryDetail.getPaymentHistoryDetailPaymentId());
        ps.setInt(3, paymentHistoryDetail.getPaymentHistoryDetailLaptopModelId());
        ps.setInt(4, paymentHistoryDetail.getPaymentHistoryDetailQty());
        ps.setDouble(5, paymentHistoryDetail.getPaymentHistoryDetailSoldPrice());
        ps.setInt(6, paymentHistoryDetail.getPaymentHistoryDetailStatus());
        ps.setInt(7, paymentHistoryDetail.getPaymentHistoryDetailId());
        ps.executeQuery();
        ps.close();

    }

    @Override
    public void deletePaymentHistoryDetail(int paymentHistoryId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM payment_history_detail WHERE payment_history_detail_id=?");
        ps.setInt(1, paymentHistoryId);
        ps.executeQuery();
        ps.close();

    }

    @Override
    public ResultSet getAllPaymentHistoryDetails() throws SQLException {
        commonDaoImpl commDaoImpl = new commonDaoImpl();
        return commDaoImpl.getAllRecords(selectQuery);
    }

}
