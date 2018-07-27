<%-- 
    Document   : GRN
    Created on : Aug 31, 2017, 5:28:22 AM
    Author     : 4m4l
--%>

<%@page import="ifix.dao.Impl.laptopModelDaoImpl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GRN | iFix</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>
            #logo{
                position: absolute;
                left: 35%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
        </style>
    </head>
    <body>
        <form action="laptopPriceDetailAdd">
            <div style="position: absolute; left: 0px; width: 100%; top: 0px; height: 100%; background-color: #000000;">
                <div style="position: absolute; left: 20%; width: 60%; top: 10%; height: 80%; background-color: #ffffff;">
                    <div id="logo"></div>
                    <div style="position: absolute; left: 30%; top: 25%; width: 250px; height: 30px;">Laptop Model ID</div>
                    <%
                        laptopModelDaoImpl lapModelDaoImpl = new laptopModelDaoImpl();
                        ResultSet rset = lapModelDaoImpl.getAllLaptopModelsDistincs();
                    %>

                    <div style="position: absolute; left: 30%; top: 30%; width: 250px; height: 30px;"><select class="form-control" name="model">
                            <%                                while (rset.next()) {
                            %>          
                            <option><%= rset.getString("laptop_model_laptop_id")%></option>>
                                <%
                                    }
                                %>
                        </select></div>

                    <div style="position: absolute; left: 30%; top: 40%; width: 250px; height: 30px;"><input type="text" name="buying_price" placeholder="Buying Price" class="form-control" /></div>
                    <div style="position: absolute; left: 30%; top: 50%; width: 250px; height: 30px;"><input type="text" name="selling_price" placeholder="Selling Price" class="form-control" /></div>
                    <div style="position: absolute; left: 30%; top: 60%; width: 250px; height: 30px;"><input type="text" name="min_selling_price" placeholder="Min Selling Price" class="form-control" /></div>
                    <div style="position: absolute; left: 30%; top: 70%; width: 250px; height: 30px;"><input type="text" name="quantity" placeholder="Quantity" class="form-control" /></div>

                    <div style="position: absolute; left: 30%; top: 80%; width: 250px; height: 30px;"> <input type="submit" class="btn btn-info" name="btn" value="Add GRN" style="width: 250px"/></div>

                </div>
            </div>
        </form>
    </body>
</html>
