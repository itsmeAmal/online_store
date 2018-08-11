/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.dao.Impl;

import ifix.connection.DatabaseConnection2;
import ifix.core.MethodStatus;
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
            + " cart_references_qty, cart_references_status, cart_references_user_id, "
            + " cart_references_item_price, cart_references_delivery_status from cart_references";

    @Override
    public MethodStatus addReference(CartReferences cartReferences) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into cart_references(cart_references_id, cart_references_item_id,"
                + " cart_references_qty, cart_references_status, cart_references_user_id, cart_references_item_price) values (?,?,?,?,?,?)");
        ps.setInt(1, cartReferences.getId());
        ps.setInt(2, cartReferences.getItemId());
        ps.setInt(3, cartReferences.getQty());
        ps.setInt(4, cartReferences.getStatus());
        ps.setString(5, Integer.toString(cartReferences.getUserId()));
        ps.setBigDecimal(6, cartReferences.getPrice());
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
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

    public MethodStatus updateSessionIdToUserId(String userSessionId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_user_id=? where cart_references_user_id=? ");
        ps.setString(1, userSessionId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public boolean deleteCartRefRecord(int id) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from cart_references where cart_references_user_id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        return true;
    }

    public MethodStatus validateProductForOneLaptop(int laptopId, int userId) throws SQLException {
        MethodStatus status = null;
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select *  from cart_references where cart_references_item_id=? "
                + " and cart_references_user_id=?");
        ps.setInt(1, laptopId);
        ps.setInt(2, userId);
        ResultSet rset = ps.executeQuery();
        if (rset.next()) {
            status = MethodStatus.DUPLICATE_PRIMARY_KEY;
        } else {
            status = MethodStatus.SUCCESS;
        }
        return status;
    }
}
