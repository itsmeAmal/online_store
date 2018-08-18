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
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
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
            + " cart_references_item_price, cart_references_delivery_status, cart_references_model_brand, cart_references_date from cart_references";

    @Override
    public MethodStatus addReference(CartReferences cartReferences) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into cart_references(cart_references_id, cart_references_item_id,"
                + " cart_references_qty, cart_references_status, cart_references_user_id, cart_references_item_price, "
                + " cart_references_model_brand, cart_references_date) "
                + " values (?,?,?,?,?,?,?,?)");
        ps.setInt(1, cartReferences.getId());
        ps.setInt(2, cartReferences.getItemId());
        ps.setInt(3, cartReferences.getQty());
        ps.setInt(4, cartReferences.getStatus());
        ps.setString(5, cartReferences.getUserId());
        ps.setBigDecimal(6, cartReferences.getPrice());
        ps.setString(7, cartReferences.getModelBrand());
        ps.setDate(8, cartReferences.getDate());
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

    public MethodStatus updateSessionIdToUserId(String userSessionId, String userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_user_id=? where cart_references_user_id=? ");
        ps.setString(1, userId);
        ps.setString(2, userSessionId);
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

    public ResultSet getCartProductsByUserId(String userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select cart_references_id, cart_references_item_id, "
                + " cart_references_qty, cart_references_status, cart_references_user_id, "
                + " cart_references_item_price, cart_references_delivery_status, cart_references_model_brand,"
                + " cart_references_date from cart_references where cart_references_user_id=? and cart_references_status=1");
        ps.setString(1, userId);
        return ps.executeQuery();
    }

    public MethodStatus removeCartProductByDateAndItemId(int itemId, Date date) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from cart_references where cart_references_item_id=? and cart_references_date=?");
        ps.setInt(1, itemId);
        ps.setDate(2, date);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public BigDecimal getTotalByUserId(String userId) throws SQLException {
        BigDecimal total = BigDecimal.ZERO;
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select sum(cart_references_item_price) as total_sum "
                + " from cart_references where cart_references_user_id=? and cart_references_status=?");
        ps.setString(1, userId);
        ps.setInt(2, 1);
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            total = rset.getBigDecimal("total_sum");
        }
        System.out.println(total);
        return total;
    }

    public MethodStatus setProductAsDelivered(String userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_delivery_status=? where cart_references_user_id=?");
        ps.setInt(1, 2);
        ps.setString(2, userId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public MethodStatus setProductsAsInvoiced(String userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_status=? where cart_references_user_id=?");
        ps.setInt(1, 2);
        ps.setString(2, userId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public MethodStatus removeCartProductByItemId(int itemId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from cart_references where cart_references_item_id=?");
        ps.setInt(1, itemId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public ResultSet getAllCashOnDeliveryItems() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select cart_references_id, cart_references_item_id,"
                + " user_id, user_name, user_address, user_contact, user_email, user_password, user_status,"
                + " user_img_path, user_img_name "
                + " cart_references_qty, cart_references_status, cart_references_user_id, "
                + " cart_references_item_price, cart_references_delivery_status, "
                + " cart_references_model_brand, cart_references_date from cart_references join user on cart_references_user_id= user_id where cart_references_status=?");
        ps.setInt(1, 3);
        return ps.executeQuery();
    }

    public ResultSet getAllCartPendingItems() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select cart_references_id, cart_references_item_id,"
                + " user_id, user_name, user_address, user_contact, user_email, user_password, user_status,"
                + " user_img_path, user_img_name, "
                + " cart_references_qty, cart_references_status, cart_references_user_id, "
                + " cart_references_item_price, cart_references_delivery_status, "
                + " cart_references_model_brand, cart_references_date from cart_references join user on cart_references_user_id= user_id where cart_references_status=?");
        ps.setInt(1, 1);
        return ps.executeQuery();
    }

    public ResultSet getAllInvoicedItems() throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select cart_references_id, cart_references_item_id,"
                + " user_id, user_name, user_address, user_contact, user_email, user_password, user_status,"
                + " user_img_path, user_img_name "
                + " cart_references_qty, cart_references_status, cart_references_user_id, "
                + " cart_references_item_price, cart_references_delivery_status, "
                + " cart_references_model_brand, cart_references_date from cart_references left join user on cart_references_user_id= user_id where cart_references_status=?");
        ps.setInt(1, 2);
        return ps.executeQuery();
    }

    public MethodStatus setProductsAsInvoicedByItemId(String itemId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_status=? where cart_references_item_id=?");
        ps.setInt(1, 2);
        ps.setString(2, itemId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public MethodStatus setProductsAsCashOnDeliveryItemByItemId(String itemId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update cart_references set cart_references_status=? where cart_references_item_id=?");
        ps.setInt(1, 3);
        ps.setString(2, itemId);
        ps.executeUpdate();
        ps.close();
        return MethodStatus.SUCCESS;
    }

    public int getCartItemCountBySessionId(String sessionOrUserId) throws SQLException {
        int count = 0;
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("select count(cart_references_id) as cart_count from cart_references where cart_references_user_id=? and cart_references_status=1");
        ps.setString(1, sessionOrUserId);
        ResultSet rset = ps.executeQuery();
        while (rset.next()) {
            count = rset.getInt("cart_count");
        }
        return count;
    }

    public ResultSet getCartReferencesHistoryByUserId(int userId) throws SQLException {
        Connection con = DatabaseConnection2.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("SELECT * FROM cart_references where cart_references_status =? and cart_references_user_id =?");
        ps.setInt(1, 2);
        ps.setInt(2, userId);
        return ps.executeQuery();
    }

}
