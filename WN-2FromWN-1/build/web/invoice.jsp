<%-- 
    Document   : invoice
    Created on : Jan 23, 2017, 10:29:58 AM
    Author     : 4m4l
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invoice</title>

        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css"/>      
    </head>
    <body>
        
        <a href="index.jsp" style="position: absolute; left: 10%; top: 10%; width: 100px; "  >Home</a>
        
        <div style="position: absolute; left: 20%; width: 60%; top: 10%; height: 500px; border-style: groove; ">
            <div style="position: absolute; left: 20px; top: 10px; width: 320px; height: 67px; background-image: url('com.official.cazzendra.images.logos/3.png');"></div>
            <div style="position: absolute; left: 10%; top: 130px; width: 400px; height: 50px; font-family: serif; font-size: 16px;">** This is an automatically generated invoice</div>
            <div style="position: absolute; left: 0%; top: 110px; width: 100%; height: 1px; background-color: #000000;"></div>
            <!--<div style="position: absolute; left: 0%; top: 560px; width: 100%; height: 5px; background-color: #999999;"></div>-->

            <%
                HttpSession hs = request.getSession();

            %>

            <div style="position: absolute; left: 10%; top: 170px; width: 60%; height: 30px;">Name : </div> <div style="position: absolute; left: 30%; top: 170px; width: 60%; height: 30px;" ><%= hs.getAttribute("cust_name")%></div>
            <div style="position: absolute; left: 10%; top: 200px; width: 60%; height: 30px;" >Address :  </div> <div style="position: absolute; left: 30%; top: 200px; width: 60%; height: 30px;"  ><%= hs.getAttribute("add_1")%></div>
            <div style="position: absolute; left: 30%; top: 230px; width: 60%; height: 30px;"  > <%= hs.getAttribute("add_2")%>  </div> 
            <div style="position: absolute; left: 10%; top: 260px; width: 60%; height: 30px;"  >Invoice Total :    </div> <div style="position: absolute; left: 30%; top: 260px; width: 60%; height: 30px;" ><%= hs.getAttribute("tot")%></div>
            <div style="position: absolute; left: 10%; top: 290px; width: 60%; height: 30px;" >Paid Through : </div> <div style="position: absolute; left: 30%; top: 290px; width: 60%; height: 30px;"  ><%= hs.getAttribute("card_no")%></div>
            <div style="position: absolute; left: 10%; top: 390px; width: 60%; height: 30px;" >Thank you..... </div>

            <div style="position: absolute; left: 10%; top: 420px; width: 600px; height: 30px; ">After receiving the product please confirm the delivery via : amalwickramarathna@icloud.com </div>
        </div>
    </body>
</html>
