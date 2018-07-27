/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.Validations;
import ifix.dao.Impl.invoiceDaoImpl;
import ifix.model.Invoice;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author 4m4l
 */
public class invoiceController {

    public static boolean addInvoice(String invoiceId, String Date, String invoiceUserId, String status, String deliverStatus) throws SQLException, ParseException {
        if (Validations.isNotEmpty(invoiceId) && Validations.isNotEmpty(Date) && Validations.isNotEmpty(invoiceUserId)) {
            invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
            Invoice invoice = new Invoice();
            invoice.setInvoiceId(Validations.getIntOrZeroFromString(invoiceId));
            invoice.setInvoiceDate(Validations.getSqlDateByString(Date));
            invoice.setInvoiceUserId(Validations.getIntOrZeroFromString(invoiceUserId));
            invoice.setInvoiceStatus(Validations.getIntOrZeroFromString(status));
            invoice.setInvoiceDeleverStatus(Validations.getIntOrZeroFromString(deliverStatus));
            return true;

        } else {
            return false;
        }
    }

    public static boolean getAllInvoices(String invoiceId) throws SQLException {
        invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
        invoiDaoImpl.getAllInvoices();
        return true;
    }
    public static boolean  removeInvoice(String invoiceId)throws SQLException{
        invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
        invoiDaoImpl.deleteInvoice(Validations.getIntOrZeroFromString(invoiceId));
        return true;
    }

}
