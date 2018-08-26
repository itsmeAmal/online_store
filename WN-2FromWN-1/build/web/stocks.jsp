<%-- 
    Document   : stocks
    Created on : Aug 19, 2018, 3:18:48 AM
    Author     : Amal
--%>

<%@page import="ifix.controller.imageUploadController"%>
<%@page import="ifix.controller.CartReferenceController"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Stocks</title>
    </head>
    <body>
        <form action="addStock" method="POST">
            <h4>Stocks</h4> 
            <select name="model">
                <%
                    ResultSet rset = imageUploadController.getAllDistinctModels();
                    while (rset.next()) {
                %>            
                <option><%=rset.getString("imageupload_model")%></option> 
                <%            }
                %>
            </select>
            <div>
                <input type="text" name="stockQty"/>
                <input type="submit" value="ADD STOCK" placeholder="Quantity"/>
            </div>
        </form>
    </body>
</html>
