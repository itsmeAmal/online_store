<%-- 
    Document   : laptopModelAllWithFixedHeader
    Created on : Aug 3, 2018, 9:56:24 AM
    Author     : Amal
--%>

<%@page import="ifix.model.ImageUpload"%>
<%@page import="ifix.controller.CartReferenceController"%>
<%@page import="ifix.controller.userController"%>
<%@page import="ifix.model.User"%>
<%@page import="ifix.controller.imageUploadController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ifix.controller.laptopPriceDetailController"%>
<%@page import="ifix.dao.Impl.laptopPriceDetailDaoImpl"%>
<%@page import="ifix.model.laptopPriceDetail"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <style>
        body{
            margin: 0;
            font-family: Arial;
        }
        .top-container{
            /*background-color: #999999;*/
            padding: 10px;
            text-align: center;
        }
        .header{
            padding: 10px 16px;
            background: #cccccc;
            color: #000000; 
            height: 70px;
        }
        .content{
            padding: 16px;
        }
        .sticky{
            position: fixed;
            top: 0px;
            width: 100%;
        }
        .sticky + .content{
            padding-top: 102px;
        }
        .sidenav{
            position: fixed; 
            left: 20%; 
            top: 30%; 
            width: 16%; 
            height: 60%; 
            border: groove;
            padding: 8px 0;   
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-6{
            position: fixed; 
            left: 20%; 
            top: 30%; 
            width: 60%; 
            height: 60%; 
            border: groove;
            padding: 8px 0;   
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav a{
            padding: 6px 8px 6px 16px;
            display: block; 
        }
        .sidenav a:hover{
            color: #009999;
        }
        @media screen and (max-height:450px){
            .sidenav{padding-top: 100px;}
            .sidenav a{font-size: 18px;}
        }
        .footer{
            position: fixed;
            left: 0px;
            bottom: 0px;
            width: 100%;
            background-image: url(web.pos.ee.images/footer.PNG);
            height: 50px;
        }
    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Brand</title>
    </head>
    <body>
        <div style="position: relative; left: 0px; width: 100%; height: 30px; top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333;">               
            <div> Working Hours : Monday - Friday : 8.30 am - 5.30 pm / Saturday : 8.30 am - 1.30 pm </div> 

        </div>
        <div class="top-container">          
            <h1>iFix Laptops.com</h1>
            <p>
                Something Different
            </p>
        </div>

        <div class="content" >

        </div>
        <!--header-->
        <div class="header" id="myHeader">
            <div style="position: relative; left: 20%; top: 10%; width: 300px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;">INVOICED ITEMS</div>
<!--            <div style="position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;" >HOME</div>-->
            <div style="position: relative; left: 70%; top: -120%; width: 20%; height: 40px;" >
                
            </div>
        </div>
        <!--add detail -->
        <div class="sidenav-6">
            <%
                
                
                ResultSet rset = imageUploadController.getProductsByBrand("");
            %>
            <div class="container" style="position: absolute; left: 5%; top: 3%; width: 90%; height: max-content; background-color: #ffffff;">
                <table class="table table-responsive">   
                    <th>PRODUCT</th>
                    <th>QUANTITY</th>                   
                    <th>PRICE</th>
<!--                    <th>ACTION</th>-->
                    <%  while (rset.next()) {
                    %>
                    <tr>                       
                        <td style="width: 300px; height: 100px; font-size: medium; text-align: left; top: 30%; font-weight: 100; "><%=rset.getString("cart_references_model_brand")%> 
                            <div style="position: relative; top: 10px; width: 200px; left: 10%; height: 50px;">
                                Location : <%= rset.getString("user_address").toString()%> 
                                Customer Name : <%= rset.getString("user_name").toString()%> 
                            </div>
                                
                        </td>
                        <td style="position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 100;">
                            1 Pcs                      
                        </td> 
                        <td style="position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 600; color: #ff0000;">
                            Rs <%=rset.getBigDecimal("cart_references_item_price")%>
                        </td>
<!--                        <td>
                            <form action="setAsInvoiceCashOnDeliveryItem" method="post">
                                <div style="position: relative; left: 10%; top: 10px; width: 100%; height: 30px;">
                                    <input type="hidden" name="hdnItemId" value="<%=Integer.toString(rset.getInt("cart_references_item_id")) %>"> 
                                    <input class="btn btn-success" type="submit" value="INVOICE ITEM" style="width: 150px; background-color: #990099;"/>
                                </div>
                            </form>  

                        </td>-->
                    </tr>
                    <%  }
                    %>
                </table>
            </div>
        </div>

        <script type="text/javascript">
            window.onscroll = function () {
                myFunction()
            };
            var header = document.getElementById("myHeader");
            var sticky = header.offsetTop;
            function myFunction() {
                if (window.pageYOffset > sticky) {
                    header.classList.add("sticky");
                } else {
                    header.classList.remove("sticky");
                }
            }
        </script>
        <div class="footer"></div>
    </body>
</html>
