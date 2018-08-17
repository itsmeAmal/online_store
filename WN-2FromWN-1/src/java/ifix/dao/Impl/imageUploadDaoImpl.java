/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.core.MethodStatus;
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

    private String selectQueryExtended = "select imageUpload_id, imageUpload_path, "
            + " imageUpload_file_name, imageupload_item_desc, imageupload_price, "
            + " imageupload_model, imageupload_processor, imageupload_os, "
            + " imageupload_graphics, imageupload_webcam, imageupload_memory, "
            + " imageupload_storage, imageupload_display from imageupload where imageupload_webcam=1";

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

    public ResultSet getAllActiveItems() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQueryExtended);
    }

    @Override
    public ResultSet getItemByAttributes(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    public ResultSet getAllDistinctBrandNames() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select distinct imageupload_item_desc from imageUpload");
        return ps.executeQuery();
    }

    public ResultSet getProductsByPriceRange(String lowerPrice, String highestPrice) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT imageUpload_id, imageUpload_path, imageUpload_file_name,"
                + " imageupload_item_desc, imageupload_price, imageupload_model, imageupload_processor,"
                + " imageupload_os, imageupload_graphics, imageupload_webcam, imageupload_memory,"
                + " imageupload_storage, imageupload_display FROM imageupload where imageupload_price between ? and ?");
        ps.setString(1, lowerPrice);
        ps.setString(2, highestPrice);
        return ps.executeQuery();
    }

    public int getAllProductCount() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select count(imageupload_webcam) as imageupload_webcam from imageupload");
        int itemCount = 0;
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            itemCount = rset.getInt("imageupload_webcam");
        }
        return itemCount;
    }

    public int getAllActiveProductCount() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select count(imageupload_webcam) as imageupload_webcam from imageupload where imageupload_webcam=1");
        int itemCount = 0;
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            itemCount = rset.getInt("imageupload_webcam");
        }
        return itemCount;
    }

    public MethodStatus changeActiveState(String brand, String model, int parameter) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update imageupload set imageupload_webcam=? where imageupload_item_desc=? and imageupload_model=?");
        ps.setInt(1, parameter);
        ps.setString(2, brand);
        ps.setString(3, model);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

}
