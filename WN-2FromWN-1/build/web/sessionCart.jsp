<%-- 
    Document   : index
    Created on : May 24, 2015, 9:01:11 AM
    Author     : AMA Wickramarathna
--%>

<%@page import="ifix.sessionCart.CartItem"%>
<%@page import="java.util.List"%>
<%@page import="ifix.sessionCart.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products | iFix</title>
    </head>
    <body>
        <div style="position: absolute; left: 10%; top: 5%; width: 80%; height: 90%; background-color: #000099;">
            <form action="addProduct">
                <table>
                    <tr>
                        <td>Product ID</td>
                        <td><input type="text" name="pid"/></td>
                    </tr>
                    <tr>

                        <td>Product Name</td>
                        <td><input type="text" name="pname"/></td>

                    </tr>
                    <tr>

                        <td>Unit Price</td>
                        <td><input type="text" name="up"/></td>

                    </tr>
                    <tr>
                        <td>Quantity</td>
                        <td><input type="text" name="qty"/></td>
                    </tr>

                    <tr>
                        <td>
                            <input type="submit" value="Add to Cart"/>
                        </td>
                    </tr>

                </table>    
            </form>       
        </div>
    </body>
</html>
