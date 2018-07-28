/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

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

    public static boolean addItem(String fileName, String filePath, String itemDescription, String price) throws SQLException {
        boolean status = false;
        if (fileName != null && filePath != null) {
            ImageUpload imageUpload = new ImageUpload();
            imageUpload.setFileName(fileName);
            imageUpload.setImgPath(filePath);
            imageUpload.setItemDescription(itemDescription);
            imageUpload.setPrice(Validations.getBigDecimalOrZeroFromString(price));
            imageUploadDaoImpl daoImpl = new imageUploadDaoImpl();
            daoImpl.addItem(imageUpload);
            status = true;
        }
        return status;
    }

    public static ResultSet getAllProducts() throws SQLException {
        return new imageUploadDaoImpl().getAllItems();
    }
}
