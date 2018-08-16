/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.MethodStatus;
import ifix.core.Validations;
import ifix.dao.Impl.invoiceDaoImpl;
import ifix.model.Invoice;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author 4m4l
 */
public class invoiceController {

    public static MethodStatus addInvoice(String Date, String invoiceUserId, String status, String deliverStatus,
            BigDecimal total, String address, String city, String country, int itemQty, String customerName) throws SQLException, ParseException {
        if (Validations.isNotEmpty(Date) && Validations.isNotEmpty(invoiceUserId)) {
            invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
            Invoice invoice = new Invoice();
            invoice.setInvoiceDate(Validations.getSqlDateByString(Date));
            invoice.setInvoiceUserId(Validations.getIntOrZeroFromString(invoiceUserId));
            invoice.setInvoiceStatus(Validations.getIntOrZeroFromString(status));
            invoice.setInvoiceDeleverStatus(Validations.getIntOrZeroFromString(deliverStatus));
            invoice.setInvoiceTotal(total);
            invoice.setAddress(address);
            invoice.setCity(city);
            invoice.setCountry(country);
            invoice.setQty(itemQty);
            invoice.setCustName(customerName);
            invoiDaoImpl.addInvoice(invoice);
            return MethodStatus.SUCCESS;
        } else {
            return MethodStatus.FAILED;
        }
    }

    public static boolean getAllInvoices(String invoiceId) throws SQLException {
        invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
        invoiDaoImpl.getAllInvoices();
        return true;
    }

    public static boolean removeInvoice(String invoiceId) throws SQLException {
        invoiceDaoImpl invoiDaoImpl = new invoiceDaoImpl();
        invoiDaoImpl.deleteInvoice(Validations.getIntOrZeroFromString(invoiceId));
        return true;
    }

}
