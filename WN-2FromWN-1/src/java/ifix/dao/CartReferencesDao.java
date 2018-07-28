/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao;

import ifix.core.MethodStatus;
import ifix.model.CartReferences;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public interface CartReferencesDao {

    MethodStatus addReference(CartReferences cartReferences) throws SQLException;

    ResultSet getAllCartReferences() throws SQLException;

    boolean updateCartReferences(CartReferences cartReferences) throws SQLException;

    ResultSet getCartReferencesByAttribute(String attribute, String condition, String value) throws SQLException;

}
