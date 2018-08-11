<%-- 
    Document   : cartItemList
    Created on : Jul 28, 2018, 7:39:51 PM
    Author     : Amal
--%>

<%@page import="ifix.model.ImageUpload"%>
<%@page import="ifix.controller.imageUploadController"%>
<%@page import="ifix.model.User"%>
<%@page import="ifix.controller.userController"%>
<%@page import="ifix.controller.CartReferenceController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.List"%>
<%@page import="ifix.sessionCart.CartItem"%>
<%@page import="ifix.sessionCart.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Cart | iFix</title>
    </head>
    <body style="background-color: #000000;">
        <div style="position: absolute; left: 10%; top: 5%; width: 80%; height: 90%; background-color: #ffffff;">
            <%
                HttpSession hs = request.getSession();
                String email = (String) hs.getAttribute("loggedIn");
                if (hs.getAttribute("loggedIn") != null) {
                    
                    User user = userController.getuserByUserEmail(email);
            %>
            <div><%=user.getUserName()%></div>
            <div><%=user.getEmail()%></div>

            <%

                        ResultSet rset = CartReferenceController.getCartReferenceByAttribute(Integer.toString(user.getUserId())); 
                        int itemId = 0; 
                                while (rset.next()) {    
                                    itemId = rset.getInt("cart_references_item_id");            
                                    }
                                

                    }
                }

                ImageUpload imageUpload = imageUploadController.getLaptopById(laptopId); 

            %>

            <table>



                <th>Item image</th>                
                <th>Item Description</th>
                <tr>

                    <td style="width: 200px; height: 200px;"><image src="uploadedImages/<%=    %>"></td>

                    <td></td>

                </tr>

            </table>
        </div>           
    </body>
</html>
