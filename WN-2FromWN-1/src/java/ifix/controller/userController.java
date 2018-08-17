/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.connection.DatabaseConnection2;
import ifix.core.CommonConstants;
import ifix.core.MethodStatus;
import ifix.core.Validations;
import ifix.dao.Impl.userDaoImpl;
import ifix.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class userController {

    public static MethodStatus addUser(String name, String address, String Contact, String email, String password, int userType) throws SQLException {
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
            user.setSatus(userType);
            userdaDaoImpl.addUser(user);
            status = MethodStatus.SUCCESS;
        }
        return status;
    }

    public static boolean updateUser(String name, String address, String contact, String password, String userId) throws SQLException {
        if (Validations.isNotEmpty(name)) {
            userDaoImpl useDaoImpl = new userDaoImpl();
            User user = getuserByUserEmail(userId);
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

    public static MethodStatus updateUserAccountImage(String fileName, String filePath, String userId) throws SQLException {
        userDaoImpl daoImpl = new userDaoImpl();
        User user = new User();
        user.setImageName(fileName);
        user.setImagePath(filePath);
        user.setUserId(Validations.getIntOrZeroFromString(userId));
        return daoImpl.updateUserImage(user);
    }

    public static boolean removeUser(String userId) throws SQLException {
        userDaoImpl userDaoImpl = new userDaoImpl();
        userDaoImpl.deleteUser(Validations.getIntOrZeroFromString(userId));
        return true;
    }

    public static User getuserByUserEmail(String email) throws SQLException {
        userDaoImpl userDaoImpl1 = new userDaoImpl();
        return userDaoImpl1.getFirstUserFromResultset(userDaoImpl1.getUsersByOneAttribute("user_email", CommonConstants.sql.EQUAL, email));
    }

    public static ResultSet getAllActiveUsers() throws SQLException {
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

    public static MethodStatus isCorrectEmailAndPw(String email, String pw) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select user_id, user_name, "
                + " user_address, user_contact, user_email, user_password, "
                + " user_status from user where user_email=? and user_password=? and user_img_name=1");
        ps.setString(1, email);
        ps.setString(2, pw);
        ResultSet rset = ps.executeQuery();
        MethodStatus status = null;
        if (rset.next()) {
            status = MethodStatus.SUCCESS;
        } else {
            status = MethodStatus.FAILED;
        }
        return status;
    }

    public static int getAllregisteredUsersCount() throws SQLException {
        return new userDaoImpl().getAllregisteredUsersCount();
    }

    public static MethodStatus deactivateUser(int userId) throws SQLException {
        return new userDaoImpl().deactivateUser(userId);
    }

    public static ResultSet getAllActiveAndDeactiveUsersWithoutAdmins() throws SQLException {
        return new userDaoImpl().getAllActiveAndDeactiveUsersWithoutAdmins();
    }

    public static MethodStatus updateUserStatusByEmail(String email, int status) throws SQLException {
        return new userDaoImpl().updateUserStatusByEmail(email, status);
    }

    public static int getActiveUserAccountCount() throws SQLException {
        return new userDaoImpl().getActiveUserAccountCount();
    }

}
