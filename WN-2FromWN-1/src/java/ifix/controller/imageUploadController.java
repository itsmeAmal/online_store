/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.CommonConstants;
import ifix.core.Validations;
import ifix.dao.Impl.imageUploadDaoImpl;
import ifix.model.ImageUpload;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class imageUploadController {

    public static boolean addItem(String fileName, String filePath, String itemDescription, String price,
            String model, String processor, String os, String graphics, String webcam, String memory,
            String storage, String display) throws SQLException {
        boolean status = false;
//        if (fileName != null && filePath != null) {
        ImageUpload imageUpload = new ImageUpload();
        imageUpload.setFileName(fileName);
        imageUpload.setImgPath(filePath);
        imageUpload.setItemDescription(itemDescription);
        imageUpload.setPrice(Validations.getBigDecimalOrZeroFromString(price));
        imageUpload.setModel(model);
        imageUpload.setProcesser(processor);
        imageUpload.setOs(os);
        imageUpload.setGraphics(graphics);
        imageUpload.setWebcam(webcam);
        imageUpload.setMemory(memory);
        imageUpload.setStorage(storage);
        imageUpload.setDisplay(display);
        imageUploadDaoImpl daoImpl = new imageUploadDaoImpl();
        daoImpl.addItem(imageUpload);
        status = true;
//        }
        return status;
    }

    public static ResultSet getAllProducts() throws SQLException {
        return new imageUploadDaoImpl().getAllItems();
    }

    public static ImageUpload getLaptopById(String laptopId) throws SQLException {
        ResultSet rset = new imageUploadDaoImpl().getItemByAttributes("imageUpload_id", CommonConstants.sql.EQUAL, laptopId);
        ImageUpload imageUpload = null;
        while (rset.next()) {
            imageUpload = new ImageUpload();
            imageUpload.setId(rset.getInt("imageUpload_id"));
            imageUpload.setFileName(rset.getString("imageUpload_file_name"));
            imageUpload.setImgPath(rset.getString("imageUpload_path"));
            imageUpload.setPrice(rset.getBigDecimal("imageupload_price"));
            imageUpload.setItemDescription(rset.getString("imageupload_item_desc"));
            imageUpload.setModel(rset.getString("imageupload_model"));
            imageUpload.setProcesser(rset.getString("imageupload_processor"));
            imageUpload.setOs(rset.getString("imageupload_os"));
            imageUpload.setGraphics(rset.getString("imageupload_graphics"));
            imageUpload.setWebcam(rset.getString("imageupload_webcam"));
            imageUpload.setMemory(rset.getString("imageupload_memory"));
            imageUpload.setStorage(rset.getString("imageupload_storage"));
            imageUpload.setDisplay(rset.getString("imageupload_display"));
        }
        return imageUpload;
    }

    public static ResultSet getAllDistinctRbandNames() throws SQLException {
        return new imageUploadDaoImpl().getAllDistinctBrandNames();
    }

    public static ResultSet getProductsByBrand(String value) throws SQLException {
        return new imageUploadDaoImpl().getItemByAttributes("imageupload_item_desc", CommonConstants.sql.EQUAL, value);
    }

    public static ResultSet getProductsByPriceRange(String lowerPrice, String highestPrice) throws SQLException {
        return new imageUploadDaoImpl().getProductsByPriceRange(lowerPrice, highestPrice);
    }

}
