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
        <form action="addProduct">
            <div id="logo"></div>
            <%
                ResultSet rset = imageUploadController.getAllProducts();
            %>
            <div class="container" style="position: absolute; left: 10%; top: 20%; width: 80%; height: max-content; background-color: #ffffff;">
                <table class="table table-striped">
                    <th>Product Image</th>
                    <th style="text-align: center;" >Item Description</th>
                    <th>Price</th>   
                    <th></th>   
                    
                        <%  while (rset.next()) {%>
                    <tr class="table-responsive">                        
                        <td style="width: 200px; height: 200px;"><image src="uploadedImages/<%= rset.getString("imageUpload_file_name")%>"></td>
                        <td style="position:  relative; font-size: large; font-weight: 800; text-align: center; top: 30%;"  ><%= rset.getString("imageupload_item_desc")%>                         
                        </td>
                        <td style="font-size: large; font-weight: 800; color: #0000cc;" ><%= rset.getString("imageupload_price")%></td> 
                        <td>  <input class="btn btn-success" type="submit" value="Add to Cart"/> </td>
                        
                    <input type="hidden" name="pid" value="<%=rset.getInt("imageUpload_id")%>"/>
                    <input type="hidden" name="pname" value="<%=rset.getString("imageupload_item_desc")%>"/>
                    <input type="hidden" name="up" value="<%=rset.getBigDecimal("imageupload_price")%>"/>
                    <input type="hidden" name="qty" value="1"/>
                    </tr>
                    <%  }%>
                </table>
            </div>
        </form>
    </body>
</html>
