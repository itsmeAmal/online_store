<%-- 
    Document   : laptopModelAll
    Created on : Sep 1, 2017, 5:12:11 AM
    Author     : 4m4l
--%>

<%@page import="ifix.controller.laptopPriceDetailController"%>
<%@page import="ifix.dao.Impl.laptopPriceDetailDaoImpl"%>
<%@page import="ifix.model.laptopPriceDetail"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
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
        <div style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%;">
            <div style="position: absolute; left: 10%; width: 80%; top: 5%; height: 100%;"></div>  
            <div id="logo"></div>
            <%
                SessionFactory sf = ifix.hib.connection.connector.getSessionFactory();
                Session ses = sf.openSession();
                Transaction tr = ses.beginTransaction();
                pojos.LaptopModel laptopModels = new pojos.LaptopModel();
                Criteria cr = ses.createCriteria(pojos.LaptopModel.class);
                List<pojos.LaptopModel> li = cr.list();
                //------------------------------------

                for (pojos.LaptopModel laps : li) {
            %>
            <div style="position: relative; left: 20%; width: 60%; top: 30%; height: 300px; background-color: #ffffff; padding-top: 100px;">
                <div style="position: absolute; left: 5%; width: 250px; height: 250px; top: 10%;"><img src="<%= laps.getLaptopModelImagePath()%>"></div>
                <div style="position: absolute; left: 38%; width: 250px; height: 40px; top: 15%; font-family: inherit; font-weight: 400; font-size: 20px;"><%= laps.getLaptopModelLaptopId()%></div>
                <div style="position: absolute; left: 38%; width: 250px; height: 40px; top: 25%;"><%= laps.getLaptopModelProcessor()%></div>
                <%
                    laptopPriceDetail lapPriceDetail = laptopPriceDetailController.getLaptopPriceDetailByLaptopModelId(String.valueOf(laps.getLaptopModelLaptopId()));
                %>
                <div style="position: absolute; left: 38%; top: 35%; width: 250px; height: 40px;"> <%= lapPriceDetail.getLaptopPriceDetailSellingPrice()%> </div>


                <div style="position: relative; left: 0%; top: 98%; width: 100%; height: 5px; background-color: #000000; padding-bottom: 0px;" ></div>
            </div>
            <%
                }
            %>

        </div>
    </body>
</html>
