/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.core.MethodStatus;
import ifix.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface userDao {

    MethodStatus addUser(User user) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    boolean deleteUser(int user) throws SQLException;

    ResultSet getAllUsers() throws SQLException;

    User getFirstUserFromResultset(ResultSet resultSet) throws SQLException;

    int getNextUserId() throws SQLException;

    ResultSet getUsersByOneAttribute(String attribute, String condition, String value) throws SQLException;

    User getUserByName(String userName) throws SQLException;
}
