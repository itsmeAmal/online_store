/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.ImageUpload;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public interface imageUploadDao {

    boolean addItem(ImageUpload imageUpload) throws SQLException;

    boolean updateItem(ImageUpload imageUpload) throws SQLException;

    boolean removeItem(int id) throws SQLException;

    ResultSet getAllItems() throws SQLException;

    ResultSet getItemByAttributes(String attribute, String condition, String value) throws SQLException;

}
