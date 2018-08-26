/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.core.MethodStatus;
import ifix.dao.stocksDao;
import ifix.model.Stocks;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class stocksDaoImpl implements stocksDao {

    private String selectQuery = "select stocks_id, stocks_model_id, stocks_model_no, stocks_qty, stocks_status from stocks";

    @Override
    public MethodStatus addStock(Stocks stocks) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into stocks(stocks_model_id, stocks_model_no, stocks_qty, stocks_status) values (?,?,?,?)");
        ps.setInt(1, 1);
        ps.setString(2, stocks.getModelNo());
        ps.setInt(3, stocks.getQty());
        ps.setInt(4, 1);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    @Override
    public MethodStatus updateStock(Stocks stocks) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update stocks set stocks_qty=? where stocks_model_no=?");
        ps.setInt(1, stocks.getQty());
        ps.setString(2, stocks.getModelNo());
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    @Override
    public ResultSet getAllStocks() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    public Stocks getStockByModelNo(String modelNo) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT stocks_id, stocks_model_id, stocks_model_no, stocks_qty, stocks_status FROM stocks where stocks_model_no=?");
        ps.setString(1, modelNo);
        ResultSet rset = ps.executeQuery();
        Stocks stocks = null;
        while (rset.next()) {
            stocks.setStocksId(rset.getInt("stocks_id"));
            stocks.setModelId(rset.getInt("stocks_model_id"));
            stocks.setModelNo(rset.getString("stocks_model_no"));
            stocks.setQty(rset.getInt("stocks_qty"));
            stocks.setStatus(rset.getInt("stocks_status"));
        }
        return stocks;
    }

    public int getCurrentStockByModelNo(String modelNo) throws SQLException {
        int qty = 0;
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select sum(stocks_qty) as total_stocks from stocks where stocks_model_no=?");
        ps.setString(1, modelNo);
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            qty = rset.getInt("total_stocks");
        }
        return qty;
    }

}
