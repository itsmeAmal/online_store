/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.Validations;
import ifix.dao.Impl.laptopPriceDetailDaoImpl;
import ifix.model.laptopPriceDetail;
import java.sql.SQLException;

/**
 *
 * @author 4m4l
 */
public class laptopPriceDetailController {

    public static boolean addLaptopPrice(String laptopPriceLaptopId, String buyingPrice, String sellingPrice, String minSellingPrice, String qty) throws SQLException {
        if (Validations.isNotEmpty(laptopPriceLaptopId) && Validations.isNotEmpty(buyingPrice) && Validations.isNotEmpty(sellingPrice)) {
            laptopPriceDetailDaoImpl laptopPriceDetailDaoImpl = new laptopPriceDetailDaoImpl();
            laptopPriceDetail obj = new laptopPriceDetail();
            obj.setLaptopPricedetailModelId(laptopPriceLaptopId);
            obj.setLaptopPriceDetailBuyingPrice(Validations.getBigDecimalOrZeroFromString(buyingPrice));
            obj.setLaptopPriceDetailSellingPrice(Validations.getBigDecimalOrZeroFromString(sellingPrice));
            obj.setLaptopPriceDetailMinSellingPrice(Validations.getBigDecimalOrZeroFromString(minSellingPrice));
            obj.setLaptopPriceDetailQty(Validations.getIntOrZeroFromString(qty));
            laptopPriceDetailDaoImpl.addLaptopPriceDetail(obj);
            return true;
        } else {
            return false;
        }
    }

    public static boolean updateLaptopPrice(String buyingPrice, String sellingPrice, String minSellingPrice, String status, String qty) throws SQLException {
        if (Validations.isNotEmpty(buyingPrice) && Validations.isNotEmpty(sellingPrice) && Validations.isNotEmpty(minSellingPrice) && Validations.isNotEmpty(status)) {
            laptopPriceDetailDaoImpl laptopPriceDetailDaoImpl = new laptopPriceDetailDaoImpl();
            laptopPriceDetail laptopPriceDetail = new laptopPriceDetail();
            laptopPriceDetail.setLaptopPriceDetailSellingPrice(Validations.getBigDecimalOrZeroFromString(sellingPrice));
            laptopPriceDetail.setLaptopPriceDetailBuyingPrice(Validations.getBigDecimalOrZeroFromString(buyingPrice));
            laptopPriceDetail.setLaptopPriceDetailMinSellingPrice(Validations.getBigDecimalOrZeroFromString(minSellingPrice));
            laptopPriceDetail.setLaptopPriceDetailStatus(Validations.getIntOrZeroFromString(status));
            laptopPriceDetail.setLaptopPriceDetailQty(Validations.getIntOrZeroFromString(qty));
            return true;
        } else {
            return false;
        }
    }

    public static boolean removelaptopPrice(String laptopPriceId) throws SQLException {
        if (Validations.isNotEmpty(laptopPriceId)) {
            laptopPriceDetailDaoImpl laptopPriceDetailDaoImpl = new laptopPriceDetailDaoImpl();
            laptopPriceDetailDaoImpl.deleteLaptopPriceDetail(Validations.getIntOrZeroFromString(laptopPriceId));
            return true;
        } else {
            return false;
        }
    }

    public static boolean getAlllaptopPriceDetails() throws SQLException {
        laptopPriceDetailDaoImpl lapDetailDaoImpl = new laptopPriceDetailDaoImpl();
        lapDetailDaoImpl.getAllLaptopPriceDetail();
        return true;
    }

    public static int getLaptopQtyByLaptopModelId(String laptopModelNo) throws SQLException {
        laptopPriceDetailDaoImpl laptopPriceDetailDaoImpl = new laptopPriceDetailDaoImpl();
        return laptopPriceDetailDaoImpl.getLaptopQtyById(laptopModelNo);
    }
    
    public static laptopPriceDetail getLaptopPriceDetailByLaptopModelId(String laptopModelId)throws SQLException{
    laptopPriceDetailDaoImpl lapDetailDaoImpl = new laptopPriceDetailDaoImpl();
    laptopPriceDetail lapPriceDetail = lapDetailDaoImpl.getLaptopPriceDetailByModelId(laptopModelId);
    return lapPriceDetail;
    }
    

}
