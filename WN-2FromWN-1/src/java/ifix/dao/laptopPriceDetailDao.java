/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.model.laptopPriceDetail;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public interface laptopPriceDetailDao {

    void addLaptopPriceDetail(laptopPriceDetail lapPriceDetail) throws SQLException;

    void deleteLaptopPriceDetail(int laptopPriceDetailId) throws SQLException;

    ResultSet getAllLaptopPriceDetail() throws SQLException;

    ResultSet getLaptopPriceDetailByOneAttribute(String attribute, String condition, String value) throws SQLException;
    
    int getLaptopQtyById(String laptopModelNo)throws SQLException;
    
    laptopPriceDetail getLaptopPriceDetailByModelId(String laptopModelId)throws SQLException;
    
    laptopPriceDetail getFirstLaptopPriceDetail(ResultSet rset)throws SQLException;

}
