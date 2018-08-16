/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.core.MethodStatus;
import ifix.dao.invoiceDao;
import ifix.model.Invoice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class invoiceDaoImpl implements invoiceDao {

    private String selectQuery = "SELECT invoice_id, invoice_date, invoice_time, invoice_user_id, "
            + " invoice_status, invoice_delever_status, invoice_total, invoice_address, invoice_city, "
            + " invoice_country, invoice_items_qty, invoice_name FROM invoice;";

    @Override
    public MethodStatus addInvoice(Invoice invoice) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO invoice(invoice_date, invoice_time, invoice_user_id, "
                + " invoice_status, invoice_delever_status, invoice_total, invoice_address, invoice_city, invoice_country, "
                + " invoice_items_qty, invoice_name) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?)");
        ps.setDate(1, invoice.getInvoiceDate());
        ps.setTime(2, invoice.getInvoiceTime());
        ps.setInt(3, invoice.getInvoiceUserId());
        ps.setInt(4, invoice.getInvoiceStatus());
        ps.setInt(5, invoice.getInvoiceDeleverStatus());
        ps.setBigDecimal(6, invoice.getInvoiceTotal());
        ps.setString(7, invoice.getAddress());
        ps.setString(8, invoice.getCity());
        ps.setString(9, invoice.getCountry());
        ps.setInt(10, invoice.getQty());
        ps.setString(11, invoice.getCustName());
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    @Override
    public void deleteInvoice(int invoice) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM invoice WHERE invoice_id=?");
        ps.setInt(1, invoice);
        ps.executeUpdate();
        ps.close();
    }

    @Override
    public ResultSet getAllInvoices() throws SQLException {
        commonDaoImpl commDaoImpl = new commonDaoImpl();
        return commDaoImpl.getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getInvoiceByOneAttribute(String attribute, String condition, String value) throws SQLException {
        commonDaoImpl commonDaoImpl = new commonDaoImpl();
        return commonDaoImpl.getResultByAttribute(selectQuery, attribute, condition, value);
    }
}
