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

    private String selectQuery = "select imageUpload_id, imageUpload_path, "
            + " imageUpload_file_name, imageupload_item_desc, imageupload_price, "
            + " imageupload_model, imageupload_processor, imageupload_os, "
            + " imageupload_graphics, imageupload_webcam, imageupload_memory, "
            + " imageupload_storage, imageupload_display from imageupload";

    @Override
    public boolean addItem(ImageUpload imageUpload) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into imageupload("
                + " imageUpload_path, imageUpload_file_name, imageupload_item_desc, "
                + " imageupload_price, imageupload_model, imageupload_processor, "
                + " imageupload_os, imageupload_graphics, imageupload_webcam, "
                + " imageupload_memory, imageupload_storage, imageupload_display) "
                + " values (?,?,?,?,?,?,?,?,?,?,?,?); ");
        ps.setString(1, imageUpload.getImgPath());
        ps.setString(2, imageUpload.getFileName());
        ps.setString(3, imageUpload.getItemDescription());
        ps.setBigDecimal(4, imageUpload.getPrice());
        ps.setString(5, imageUpload.getModel());
        ps.setString(6, imageUpload.getProcesser());
        ps.setString(7, imageUpload.getOs());
        ps.setString(8, imageUpload.getGraphics());
        ps.setString(9, imageUpload.getWebcam());
        ps.setString(10, imageUpload.getMemory());
        ps.setString(11, imageUpload.getStorage());
        ps.setString(12, imageUpload.getDisplay());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public boolean updateItem(ImageUpload imageUpload) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update imageupload set imageUpload_path=?, "
                + " imageUpload_file_name=?, imageupload_item_desc=?, "
                + " imageupload_price=?, imageupload_model=?, imageupload_processor=?, "
                + " imageupload_os=?, imageupload_graphics=?, imageupload_webcam=?, "
                + " imageupload_memory=?, imageupload_storage=?, imageupload_display=? where imageUpload_id=?");
        ps.setString(1, imageUpload.getImgPath());
        ps.setString(2, imageUpload.getFileName());
        ps.setString(3, imageUpload.getItemDescription());
        ps.setBigDecimal(4, imageUpload.getPrice());
        ps.setString(5, imageUpload.getModel());
        ps.setString(6, imageUpload.getProcesser());
        ps.setString(7, imageUpload.getOs());
        ps.setString(8, imageUpload.getGraphics());
        ps.setString(9, imageUpload.getWebcam());
        ps.setString(10, imageUpload.getMemory());
        ps.setString(11, imageUpload.getStorage());
        ps.setString(12, imageUpload.getDisplay());
        ps.setInt(13, imageUpload.getId());
        ps.executeUpdate();
        ps.close();
        return true;

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
