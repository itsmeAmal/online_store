/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.laptopModelDao;
import ifix.model.LaptopModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class laptopModelDaoImpl implements laptopModelDao {

    private String selectQuery = "SELECT laptop_model_id, laptop_model_laptop_id, laptop_model_hard_disk, laptop_model_ram, laptop_model_vga, laptop_model_processor, laptop_model_usb_type_1, laptop_model_usb_type_2, laptop_model_hdmi, laptop_model_vga_output, laptop_model_screen_size, laptop_model_cache_memory, laptop_model_status, laptop_model_image_path FROM laptop_model";

    @Override
    public void addLaptopModel(LaptopModel laptopModel) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO laptop_model(laptop_model_id, laptop_model_laptop_id, laptop_model_hard_disk, laptop_model_ram, laptop_model_vga, laptop_model_processor, laptop_model_usb_type_1, laptop_model_usb_type_2, laptop_model_hdmi,laptop_model_status, laptop_model_image_path) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, laptopModel.getLaptopModelId());
        ps.setInt(2, laptopModel.getLaptopModelLaptopId());
        ps.setString(3, laptopModel.getLaptopModelHardDisk());
        ps.setString(4, laptopModel.getLaptopModelRam());
        ps.setString(5, laptopModel.getLaptopModelVga());
        ps.setString(6, laptopModel.getLaptopModelProcessor());
        ps.setString(7, laptopModel.getLaptopModelUsbType1());
        ps.setString(8, laptopModel.getLaptopModelUsbType2());
        ps.setBoolean(9, laptopModel.isLaptopModelHdmi());
        ps.setBoolean(10, laptopModel.isLaptopModelVgaUotput());
        ps.setString(11, laptopModel.getLaptopModelScreenSize());
        ps.setInt(12, laptopModel.getLaotopModelCacheMemory());
        ps.setInt(13, laptopModel.getLaptopModelStatus());
        ps.setString(14, laptopModel.getLaptopImagePath()); 
        ps.executeQuery();
        ps.close();
    }

    @Override
    public void updateLaptopModel(LaptopModel laptopModel) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE laptop_model SET laptop_model_id=?, laptop_model_laptop_id=?, laptop_model_hard_disk=?, laptop_model_ram=?, laptop_model_vga=?, laptop_model_processor=?, laptop_model_usb_type_1=?, laptop_model_usb_type_2=?, laptop_model_hdmi=?, laptop_model_vga_output=?, laptop_model_screen_size=?, laptop_model_cache_memory=?, laptop_model_status=?, laptop_model_image_path=? WHERE laptop_model_id=?");
        ps.setInt(1, laptopModel.getLaptopModelId());
        ps.setInt(2, laptopModel.getLaptopModelLaptopId());
        ps.setString(3, laptopModel.getLaptopModelHardDisk());
        ps.setString(4, laptopModel.getLaptopModelRam());
        ps.setString(5, laptopModel.getLaptopModelVga());
        ps.setString(6, laptopModel.getLaptopModelProcessor());
        ps.setString(7, laptopModel.getLaptopModelUsbType1());
        ps.setString(8, laptopModel.getLaptopModelUsbType2());
        ps.setBoolean(9, laptopModel.isLaptopModelHdmi());
        ps.setBoolean(10, laptopModel.isLaptopModelVgaUotput());
        ps.setString(11, laptopModel.getLaptopModelScreenSize());
        ps.setInt(12, laptopModel.getLaotopModelCacheMemory());
        ps.setInt(13, laptopModel.getLaptopModelStatus());
        ps.setString(14, laptopModel.getLaptopImagePath());
        ps.setInt(15, laptopModel.getLaptopModelId()); 
        ps.executeQuery();
        ps.close();

    }

    @Override
    public ResultSet getAllLaptopModels() throws SQLException {
        commonDaoImpl commonDaoImpl1 = new commonDaoImpl();
        return commonDaoImpl1.getAllRecords(selectQuery);
    }

    @Override
    public void deleteLaptopModel(int laptopModel) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("DELETE FROM laptop_model WHERE laptop_model_id=?");
        ps.setInt(1, laptopModel);
        ps.executeQuery();
        ps.close();
    }

    @Override
    public ResultSet getAllLaptopModelsDistincs() throws SQLException {
        return new commonDaoImpl().getAllRecords("SELECT DISTINCT laptop_model_laptop_id FROM laptop_model");
    }

    @Override
    public LaptopModel getLaptopModelById(String laptopModelId) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
