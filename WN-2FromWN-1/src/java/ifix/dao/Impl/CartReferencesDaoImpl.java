/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.dao.CartReferencesDao;
import ifix.model.CartReferences;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Amal
 */
public class CartReferencesDaoImpl implements CartReferencesDao {

    private String selectQuery = "select cart_references_id, cart_references_item_id, "
            + "cart_references_qty, cart_references_status, cart_references_user_id from cart_references";

    @Override

    public boolean addReference(CartReferences cartReferences) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into cart_references(cart_references_id, cart_references_item_id,"
                + " cart_references_qty, cart_references_status, cart_references_user_id) values (?,?,?,?,?)");
        ps.setInt(1, cartReferences.getId());
        ps.setInt(2, cartReferences.getItemId());
        ps.setInt(3, cartReferences.getQty());
        ps.setInt(4, cartReferences.getStatus());
        ps.setInt(5, cartReferences.getUserId());
        ps.executeUpdate();
        ps.close();
        return true;
    }

    @Override
    public ResultSet getAllCartReferences() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public boolean updateCartReferences(CartReferences cartReferences) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getCartReferencesByAttribute(String attribute, String condition, String value) throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    public boolean updateAsDoneCartReferenceRecord(int userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_status=? "
                + " where cart_references_user_id=?");
        ps.setInt(1, 1);
        ps.setInt(2, userId);
        ps.executeUpdate();
        ps.close();
        return true;
    }

    public boolean deleteCartRefRecord(int id) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from cart_references where cart_references_id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        return true;
    }

}
