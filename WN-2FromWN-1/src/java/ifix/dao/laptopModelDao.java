/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.LaptopModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface laptopModelDao {

    void addLaptopModel(LaptopModel laptopModel) throws SQLException;

    void updateLaptopModel(LaptopModel laptopModel) throws SQLException;

    ResultSet getAllLaptopModels() throws SQLException;

    void deleteLaptopModel(int laptopModel) throws SQLException;  
    
    ResultSet getAllLaptopModelsDistincs()throws SQLException;
    
    LaptopModel getLaptopModelById(String laptopModelId)throws SQLException;
    
    
    
}
