/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.controller;

import ifix.core.CommonConstants;
import ifix.core.MethodStatus;
import ifix.core.Validations;
import ifix.dao.Impl.CartReferencesDaoImpl;
import ifix.model.CartReferences;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class CartReferenceController {

    public static MethodStatus addcartReference(String itemId, String userId, BigDecimal price, String modelBrand) throws SQLException {
        CartReferences cartReferences = new CartReferences();
        cartReferences.setItemId(Validations.getIntOrZeroFromString(itemId));
        cartReferences.setQty(1);
        cartReferences.setStatus(1);
        cartReferences.setUserId(userId);
        cartReferences.setPrice(price);
        cartReferences.setModelBrand(modelBrand);
        cartReferences.setDate(CommonController.getCurrentJavaSqlDate());
        return new CartReferencesDaoImpl().addReference(cartReferences);
    }

    public static ResultSet getCartReferenceByAttribute(String userId) throws SQLException {
        return new CartReferencesDaoImpl().getCartReferencesByAttribute("cart_references_user_id", CommonConstants.sql.EQUAL, userId);
    }

    public static boolean removeCartReferenceByUserId(String userId) throws SQLException {
        return new CartReferencesDaoImpl().deleteCartRefRecord(Validations.getIntOrZeroFromString(userId));
    }

    public static MethodStatus validateProductForOneLaptop(String LaptopId, String userId) throws SQLException {
        return new CartReferencesDaoImpl().validateProductForOneLaptop(Validations.getIntOrZeroFromString(LaptopId),
                Validations.getIntOrZeroFromString(userId));
    }

    public static MethodStatus updateSessionIdToUserId(String userSessionId, String userId) throws SQLException {
        return new CartReferencesDaoImpl().updateSessionIdToUserId(userSessionId, userId);
    }

    public static ResultSet getCartProductsByUserId(String userId) throws SQLException {
        return new CartReferencesDaoImpl().getCartProductsByUserId(userId);
    }

    public static MethodStatus removeCartProductByDateAndItemId(int itemId, Date date) throws SQLException {
        return new CartReferencesDaoImpl().removeCartProductByDateAndItemId(itemId, date);
    }

    public static BigDecimal getTotalByUserId(String userId) throws SQLException {
        return new CartReferencesDaoImpl().getTotalByUserId(userId);
    }

    public static MethodStatus setProductAsDelivered(String userId) throws SQLException {
        return new CartReferencesDaoImpl().setProductAsDelivered(userId);
    }

    public static MethodStatus setProductsAsInvoiced(String userId) throws SQLException {
        return new CartReferencesDaoImpl().setProductsAsInvoiced(userId);
    }

    public static MethodStatus removeCartProductByItemId(int itemId) throws SQLException {
        return new CartReferencesDaoImpl().removeCartProductByItemId(itemId);
    }

    public static ResultSet getAllCashOnDeliveryItems() throws SQLException {
        return new CartReferencesDaoImpl().getAllCashOnDeliveryItems();
    }

    public static MethodStatus setProductsAsInvoicedByItemId(String itemId) throws SQLException {
        return new CartReferencesDaoImpl().setProductsAsInvoicedByItemId(itemId);
    }

    public static MethodStatus setProductsAsCashOnDeliveryItemByItemId(String itemId) throws SQLException {
        return new CartReferencesDaoImpl().setProductsAsCashOnDeliveryItemByItemId(itemId);
    }

    public static ResultSet getAllCartPendingItems() throws SQLException {
        return new CartReferencesDaoImpl().getAllCartPendingItems();
    }

    public static ResultSet getAllInvoicedItems() throws SQLException {
        return new CartReferencesDaoImpl().getAllInvoicedItems();
    }

    public static int getCartItemCountBySessionId(String sessionOrUserId) throws SQLException {
        return new CartReferencesDaoImpl().getCartItemCountBySessionId(sessionOrUserId);
    }

    public static ResultSet getCartReferencesHistoryByUserId(int userId) throws SQLException {
        return new CartReferencesDaoImpl().getCartReferencesHistoryByUserId(userId);
    }

    public static MethodStatus updateDeliveryStatus(int deliveryStatus, int itemid, int userId) throws SQLException {
        return new CartReferencesDaoImpl().updateDeliveryStatus(deliveryStatus, itemid, userId);
    }

    public static MethodStatus updateCustomerDeliveryNotification(int notifyStatus, int itemId, int userId) throws SQLException {
        return new CartReferencesDaoImpl().updateCustomerDeliveryNotification(notifyStatus, itemId, userId);
    }

}
