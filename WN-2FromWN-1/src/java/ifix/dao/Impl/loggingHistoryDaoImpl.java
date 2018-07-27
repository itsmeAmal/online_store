/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.loggingHistoryDao;
import ifix.model.LoggingHistory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class loggingHistoryDaoImpl implements loggingHistoryDao {

    private String selectQuery = "SELECT logging_history_id, logging_history_user_id, logging_history_time, logging_history_date FROM user_logging_history";
       
    @Override
    public void addLoggingHistory(LoggingHistory loggingHistory) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO user_logging_history(logging_history_id, logging_history_user_id, logging_history_time, logging_history_date) VALUES (?,?,?,?)");
        ps.setInt(1, loggingHistory.getLoggingHistoryId());
        ps.setInt(2, loggingHistory.getLoggingHistoryUserId());
        ps.setTime(3, loggingHistory.getLoggingHistoryTime());
        ps.setDate(4, loggingHistory.getLoggingHistoryDate());
        ps.executeQuery();
        ps.close();
    }

    @Override
    public void removeLoggingHistory(int logHistoryId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM user_logging_history WHERE logging_history_id=?");
        ps.setInt(1, logHistoryId);
        ps.executeQuery();
        ps.close();
    }

    @Override
    public ResultSet getAllLoggingHistory() throws SQLException {
        commonDaoImpl commonDaoImpl = new commonDaoImpl();
      return   commonDaoImpl.getAllRecords(selectQuery);
  }

}
