/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author 4m4l
 */
public class LoggingHistory {
    private int loggingHistoryId;
    private int loggingHistoryUserId;
    private Time loggingHistoryTime;
    private Date loggingHistoryDate;

    /**
     * @return the loggingHistoryId
     */
    public int getLoggingHistoryId() {
        return loggingHistoryId;
    }

    /**
     * @param loggingHistoryId the loggingHistoryId to set
     */
    public void setLoggingHistoryId(int loggingHistoryId) {
        this.loggingHistoryId = loggingHistoryId;
    }

    /**
     * @return the loggingHistoryUserId
     */
    public int getLoggingHistoryUserId() {
        return loggingHistoryUserId;
    }

    /**
     * @param loggingHistoryUserId the loggingHistoryUserId to set
     */
    public void setLoggingHistoryUserId(int loggingHistoryUserId) {
        this.loggingHistoryUserId = loggingHistoryUserId;
    }

    /**
     * @return the loggingHistoryTime
     */
    public Time getLoggingHistoryTime() {
        return loggingHistoryTime;
    }

    /**
     * @param loggingHistoryTime the loggingHistoryTime to set
     */
    public void setLoggingHistoryTime(Time loggingHistoryTime) {
        this.loggingHistoryTime = loggingHistoryTime;
    }

    /**
     * @return the loggingHistoryDate
     */
    public Date getLoggingHistoryDate() {
        return loggingHistoryDate;
    }

    /**
     * @param loggingHistoryDate the loggingHistoryDate to set
     */
    public void setLoggingHistoryDate(Date loggingHistoryDate) {
        this.loggingHistoryDate = loggingHistoryDate;
    }
    
}
