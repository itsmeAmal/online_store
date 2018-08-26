/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.MethodStatus;
import ifix.dao.Impl.stocksDaoImpl;
import ifix.model.Stocks;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class stocksController {

    public static MethodStatus addStock(int modelId, String modelNo, int qty) throws SQLException {
        Stocks stocks = new Stocks();
        stocks.setModelNo(modelNo);
        stocks.setModelId(modelId);
        stocks.setQty(qty);
        stocks.setStatus(1);
        return new stocksDaoImpl().addStock(stocks);
    }

    public static MethodStatus updateStock(int qty, String modelNo) throws SQLException {
        Stocks stocks = new Stocks();
        stocks.setModelNo(modelNo);
        stocks.setQty(qty);
        return new stocksDaoImpl().updateStock(stocks);
    }

    public static ResultSet getAllStocks() throws SQLException {
        return new stocksDaoImpl().getAllStocks();
    }

    public static Stocks getStockByModelNo(String modelNo) throws SQLException {
        return new stocksDaoImpl().getStockByModelNo(modelNo);
    }

    public static int getCurrentStockByModelNo(String modelNo) throws SQLException {
        return new stocksDaoImpl().getCurrentStockByModelNo(modelNo);
    }

}
