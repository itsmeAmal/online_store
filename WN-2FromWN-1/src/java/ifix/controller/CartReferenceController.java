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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class CartReferenceController {

    public static MethodStatus addcartReference(String itemId, String userId) throws SQLException {
        CartReferences cartReferences = new CartReferences();
        cartReferences.setItemId(Validations.getIntOrZeroFromString(itemId));
        cartReferences.setQty(1);
        cartReferences.setStatus(0);
        cartReferences.setUserId(Validations.getIntOrZeroFromString(userId));
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

}
