/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.core.MethodStatus;
import ifix.model.Invoice;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface invoiceDao {

    MethodStatus addInvoice(Invoice invoice) throws SQLException;

    void deleteInvoice(int invoice) throws SQLException;

    ResultSet getAllInvoices() throws SQLException;

    ResultSet getInvoiceByOneAttribute(String attribute, String condition, String value) throws SQLException;
}
