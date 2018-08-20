/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.core.MethodStatus;
import ifix.model.Stocks;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public interface stocksDao {

    public MethodStatus addStock(Stocks stocks) throws SQLException;

    public MethodStatus updateStock(Stocks stocks) throws SQLException;

    public ResultSet getAllStocks() throws SQLException;

}
