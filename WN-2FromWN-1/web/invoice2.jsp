<%-- 
    Document   : invoice2
    Created on : Feb 6, 2017, 6:05:09 PM
    Author     : 4m4l
--%>

<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.ArrayList"%>
<%@page import="servlets.CartItems"%>
<%@page import="servlets.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invoice</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
    </head>
    <body>
        <div style="position: absolute; left: 20%; top: 10%; width: 60%; height: 80%; border-style: ridge;">
            
            <div style="position: absolute; left: 10%; top: 10%; width: 107px; height: 15px; background-image: url('com.official.cazzendra.images.logos/4.png')"  ></div>
            <div style="position: absolute; left: 10%; top: 15%; width: 107px; height: 15px;">Date :</div>
            <div style="position: absolute; left: 80%; top: 20%; width: 107px; height: 15px;">Invoice # :</div>    
            <%
            Session ses = conn.connector.getSessionFactory().openSession();
            Transaction tr = ses.beginTransaction();
            // pojos.PaymentHistory ph = (pojos.PaymentHistory)ses.load(pojos.PaymentHistory.class);
            pojos.PaymentHistory ph = (pojos.PaymentHistory)ses.load(pojos.PaymentHistory.class, 1);
            
            
            
            %>
 
            <div style="position: absolute; left: 80%; top: 15%; width: 200px; height: 60px; font-family: monospace; font-size: 20px;  "> Invoice   </div>
            
            <div style="position: absolute; left: 10%; top: 25%; width: 75%; height: 60%; ">
                   <table class="table table-responsive" >
                    <tr>
                        <th style="width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">Brand</th>
                        <th style="width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Model</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Price</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Quantity</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Total</th>
                      
                    </tr> 
                    <%
                        HttpSession hs = request.getSession();
                        Cart cr = null;
                        double subtot = 0;

                        if (hs.getAttribute("cart") != null) {
                            cr = (Cart) hs.getAttribute("cart");
                            ArrayList<CartItems> items = cr.getCart();

                            for (CartItems ci : items) {

                                double tot = ci.getQty() * ci.getPrice();
                                subtot += tot;
                    %>
                    <form method="POST" action="RemoveProduct">
                        <tr class="table-condensed">
                            <td> <%= ci.getBrand()%> </td>
                            <td> <%= ci.getModel()%> </td>
                            <td> <%= ci.getPrice()%> </td>
                            <td> <%= ci.getQty()%> </td>
                            <td> <%= tot%>   </td>
                            
                    </form>

                    </tr>

                    <%
                            }
                        }
                    %>

                 
                </table>
                
                
                
                
                
            </div>
            <div></div>
            <div></div>
            <div></div>
            <div></div>
        </div>



    </body>
</html>
