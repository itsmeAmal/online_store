/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.CommonConstants;
import ifix.core.MethodStatus;
import ifix.core.Validations;
import ifix.dao.Impl.userDaoImpl;
import ifix.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class userController {

    public static MethodStatus addUser(String name, String address, String Contact, String email, String password) throws SQLException {
        userDaoImpl userdaDaoImpl = new userDaoImpl();
        MethodStatus status = null;
        if (isExistingEmail(email) && name != null && email != null && password != null) {
            status = MethodStatus.DUPLICATE_PRIMARY_KEY;
        } else {
            User user = new User();
            user.setUserName(name);
            user.setUserAddress(address);
            user.setContact(Contact);
            user.setEmail(email);
            user.setPassword(password);
            user.setSatus(1);
            userdaDaoImpl.addUser(user);
            status = MethodStatus.SUCCESS;
        }
        return status;
    }

    public static boolean updateUser(String name, String address, String contact, String password, String userId) throws SQLException {
        if (Validations.isNotEmpty(name)) {
            userDaoImpl useDaoImpl = new userDaoImpl();
            User user = getuserByUserId(userId);
            user.setUserName(name);
            user.setUserAddress(address);
            user.setContact(contact);
            user.setPassword(password);
            useDaoImpl.updateUser(user);
            return true;
        } else {
            return false;
        }
    }

    public static boolean removeUser(String userId) throws SQLException {
        userDaoImpl userDaoImpl = new userDaoImpl();
        userDaoImpl.deleteUser(Validations.getIntOrZeroFromString(userId));
        return true;
    }

    public static User getuserByUserId(String userId) throws SQLException {
        userDaoImpl userDaoImpl1 = new userDaoImpl();
        return userDaoImpl1.getFirstUserFromResultset(userDaoImpl1.getUsersByOneAttribute("user_id", CommonConstants.sql.EQUAL, userId));
    }

    public static ResultSet getAllUsers() throws SQLException {
        userDaoImpl useDaoImpl = new userDaoImpl();
        return useDaoImpl.getAllUsers();
    }

    public static User getFirstUserByName(String userName) throws SQLException {
        userDaoImpl userImpl = new userDaoImpl();
        User user = userImpl.getUserByName(userName);
        return user;
    }

    public static boolean isExistingEmail(String email) throws SQLException {
        boolean status = false;
        ResultSet rset = new userDaoImpl().getUsersByOneAttribute("user_email", CommonConstants.sql.EQUAL, email);
        if (rset.next()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}
