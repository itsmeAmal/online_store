/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.imageUploadDao;
import ifix.model.ImageUpload;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class imageUploadDaoImpl implements imageUploadDao {

    private String selectQuery = "select imageUpload_id, imageUpload_path, imageUpload_file_name, "
            + " imageupload_item_desc, imageupload_price from imageupload";

    @Override
    public boolean addItem(ImageUpload imageUpload) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into imageupload(imageUpload_path,"
                + " imageUpload_file_name) values (?,?); ");
        ps.setString(1, imageUpload.getImgPath());
        ps.setString(2, imageUpload.getFileName());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean updateItem(ImageUpload imageUpload) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeItem(int id) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from imageupload where imageUpload_id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        return true;

    }

    @Override
    public ResultSet getAllItems() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getItemByAttributes(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

}
