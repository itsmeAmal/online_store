/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.LoggingHistory;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface loggingHistoryDao {
    
    void addLoggingHistory(LoggingHistory loggingHistory)throws SQLException;
    
    void removeLoggingHistory(int logHistoryId) throws SQLException;
    
    ResultSet getAllLoggingHistory() throws SQLException;
}
