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
        <h4>Stocks</h4> 
        <%
            ResultSet rset = imageUploadController.getAllDistinctModels();
            while (rset.next()) {


        %>

        <select>
            <option></option>
        </select>
        <%            }
        %>

        <div>
            <input type="text" name="stockQty" />
        </div>
    </body>
</html>
