/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.userDao;
import ifix.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class userDaoImpl implements userDao {

    private String selectQuery = "SELECT user_id, user_name, user_address, user_contact, user_status, user_email, user_password  FROM user";

    @Override
    public boolean addUser(User user) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO user(user_name, user_address, user_contact, user_status, user_email, user_password) VALUES (?,?,?,?,?,?)");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getUserAddress());
        ps.setString(3, user.getContact());
        ps.setInt(4, user.getSatus());
        ps.setString(5, user.getEmail());
        ps.setString(6, user.getPassword());

        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET user_name=?, user_address=?, user_contact=?, user_status=?, user_password=? WHERE user_id=?");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getUserAddress());
        ps.setString(3, user.getContact());
        ps.setInt(4, user.getSatus());
        ps.setString(5, user.getPassword());
        ps.setInt(6, user.getUserId());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean deleteUser(int userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM user WHERE user_id=?");
        ps.setInt(1, userId);
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet getAllUsers() throws SQLException {
        commonDaoImpl commonDaoImpl = new commonDaoImpl();
        return commonDaoImpl.getAllRecords(selectQuery);
    }

    @Override
    public User getFirstUserFromResultset(ResultSet resultSet) throws SQLException {
        User user = null;
        while (resultSet.next()) {
            user = new User();
            user.setUserId(resultSet.getInt("user_id"));
            user.setUserName(resultSet.getString("user_name"));
            user.setUserAddress(resultSet.getString("user_address"));
            user.setContact(resultSet.getString("user_contact"));
            user.setSatus(resultSet.getInt("user_status"));
            user.setEmail(resultSet.getString("user_email"));
            user.setPassword(resultSet.getString("user_password"));
        }
        return user;
    }

    @Override
    public int getNextUserId() throws SQLException {
        int maxuserId = 0;
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT MAX(user_id) FROM user");
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            maxuserId = rset.getInt(1);
        }
        return ++maxuserId;
    }

    @Override
    public ResultSet getUsersByOneAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);

    }

    @Override
    public User getUserByName(String userName) throws SQLException {
        ResultSet rset = getUsersByOneAttribute("user_name", " LIKE ", userName);
        User user = getFirstUserFromResultset(rset);
        return user;
    }
}
