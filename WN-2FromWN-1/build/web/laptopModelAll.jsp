<%-- 
    Document   : laptopModelAll
    Created on : Sep 1, 2017, 5:12:11 AM
    Author     : 4m4l
--%>

<%@page import="ifix.controller.imageUploadController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ifix.controller.laptopPriceDetailController"%>
<%@page import="ifix.dao.Impl.laptopPriceDetailDaoImpl"%>
<%@page import="ifix.model.laptopPriceDetail"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Models | iFix</title>
        <style>
            #logo{
                position: absolute;
                left: 65%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
        </style>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
    </head>
    <body style="background-color: #000000;">
        <div style="position: absolute; left: 0px; top: 0px; width: 100%; height: max-content; background-color: #000000; color: #ffffff;">

                <div id="logo"></div>
                <%
                   
                    ResultSet rset = imageUploadController.getAllProducts();
                %>

                <table id="userDetail">
                    <th>Item Description</th>
                    <th>Email</th>                    
                        <%  while (rset.next()) {%>
                    <tr class="table-responsive">
                        <td><%= rset.getString("imageupload_item_desc")%></td>
                        <td><%= rset.getString("imageupload_price")%></td> 
                    <input type="hidden" name="hiddenId" value="<%=rset.getInt(1)%>" />
                    </tr>
                    <%  }%>
                </table>
            </div>
    </body>
</html>
