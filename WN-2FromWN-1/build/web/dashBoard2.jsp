<%-- 
    Document   : laptopModelAllWithFixedHeader
    Created on : Aug 3, 2018, 9:56:24 AM
    Author     : Amal
--%>

<%@page import="ifix.core.Validations"%>
<%@page import="ifix.controller.CartReferenceController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ifix.model.ImageUpload"%>
<%@page import="ifix.controller.imageUploadController"%>
<%@page import="ifix.model.User"%>
<%@page import="ifix.controller.userController"%>
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
            padding: 5px;
            text-align: left;
            padding-left: 20px;
            padding-top: 10px;
            height: 50px;
            background-color: #ff3300;
            color: #cccccc;
            font-weight: 300;
            font-size: 20px;

        }
        .header{
            padding: 5px 5px;
            background: #999999;
            color: #000000; 
            height: 40px;
        }
        .content{
            padding: 1px;
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
            left: 2%; 
            top: 20%; 
            width: 23%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-2{
            position: fixed; 
            left: 83%; 
            top: 13%; 
            width: 16%; 
            height: 81%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
            background-color: #333333;
        }
        .sidenav-3{
            position: fixed; 
            left: 28%; 
            top: 20%; 
            width: 50%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
            background-color: #cccccc;
        }
        .sidenav-4{
            position: fixed; 
            left: 74%; 
            top: 20%; 
            width: 23%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-5{
            position: fixed; 
            left: 59%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-7{
            position: fixed; 
            left: 72%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
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
        a:link, a:visited {
            background-color: #ff3300;
            color: white;
            padding: 5px 15px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }


        a:hover, a:active {
            background-color: red;
        }

    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard / </title>
    </head>
    <body>
        <%
            HttpSession hs = request.getSession();
            String email = (String) hs.getAttribute("loggedIn");

            if (hs.getAttribute("loggedIn") != null) {
                User user = userController.getuserByUserEmail(email);
        %>
        <div style="position: relative; left: 0px; width: 100%; height: 30px;
             top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333; padding-top: 5px; font-weight: 600;">               
            iFix Computers (pvt) Ltd | Administrator Dashboard 
        </div>
        <div class="top-container">          
            <p>
                DASHBOARD /    <a href="userProfile.jsp"><%= user.getUserName()%></a>  
                <a href="invalidateSession" style="position: relative; left: 1500px; top: 1%; width: 100px; height: 40px;">Logout</a>
            </p>
        </div>
        <div class="content" >

        </div>
        <!--header-->
        <div class="header" id="myHeader">
            <div style="position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;"></div>
            <div style="position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;" ></div>
            <div style="position: relative; left: 54%; top: -120%; width: 20%; height: 40px;" >
                <!--                    <input type="text" class="form-control" id="search" placeholder="SEARCH" />-->
            </div>
        </div>
        <div class="sidenav" >
            <%
                ResultSet rset = imageUploadController.getAllProducts();
            %>
            <div class="container" style="position: absolute; left: 0px; top: 10%; width: 300px; height: max-content; background-color: #ffffff;">
                <H4> PRODUCTS</H4>
                <table class="table table-condensed" style="position: relative;  width: 100%;">   
                    <th>BRAND AND MODEL</th>
                    <th style="padding-left: 50px;">ACTION</th>                                          
                        <%  while (rset.next()) {
                        %>
                    <tr>  
                        <td style="width: 200px; height: 50px; font-size: small; text-align: left; font-weight: 100; "> 
                            <div style="position: relative; top: 10px; width: 200px; left: 10%; height: 50px;">
                                <%= rset.getString("imageupload_item_desc")%><%= rset.getString("imageupload_model")%>  
                            </div>                        
                        </td>
                        <td style="position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 100;">
                            <form action="changeStatusImgUpload" method="post">
                                <div style="position: relative; top: 10px; width: 200px; left: 0px; height: 50px;">
                                    <%
                                        int value = rset.getInt("imageupload_webcam");
                                        String activeState = "";
                                        if (value == 1) {
                                            activeState = "DEACTIVATE";
                                        } else {
                                            activeState = "ACTIVATE";
                                        }
                                    %>                                    
                                    <input type="submit" name="changeStatusImgUpload" value="<%=activeState%>" class="btn btn-info" style="width: 130px; ">
                                    <input type="hidden" name="laptopModel" value="<%=rset.getString("imageupload_model")%>">
                                    <input type="hidden" name="laptopBrand" value="<%=rset.getString("imageupload_item_desc")%>">
                                    <input type="hidden" name="statusId" value="<%=rset.getString("imageupload_webcam")%>">
                                </div>   
                            </form>
                        </td>                             
                    </tr>
                    <%  }
                    %>
                </table>
            </div>
        </div>
        <div class="sidenav-2">
            <a style="position: relative; top: 10px; width: 270px; background-color: #6666ff; text-align: left;"   href="addAdminUserAccount.jsp">REGISTER ADMIN USER ACCOUNT</a><br>
            <a style="position: relative; top: 20px; width: 270px; background-color: #6666ff; text-align: left;"  href="addProduct.jsp">REGISTER LAPTOP</a><br>
            <a style="position: relative; top: 30px; width: 270px; background-color: #6666ff; text-align: left;"  href="userAdd.jsp">REGISTER USER ACCOUNT</a><br>
            <a style="position: relative; top: 40px; width: 270px; background-color: #6666ff; text-align: left;"  href="invoicedItems.jsp">INVOICED ITEMS</a><br>
            <a style="position: relative; top: 50px; width: 270px; background-color: #6666ff; text-align: left;"  href="dashBoard.jsp">MANAGE USERS</a><br>
            <a style="position: relative; top: 60px; width: 270px; background-color: #6666ff; text-align: left;"  href="dashBoard2.jsp">MANAGE LAPTOPS</a><br>
            <a style="position: relative; top: 70px; width: 270px; background-color: #6666ff; text-align: left;"  href="dashBoard.jsp">MANAGE INVOICES</a><br>
            <a style="position: relative; top: 80px; width: 270px; background-color: #6666ff; text-align: left;"  href="dashBoard.jsp">DELIVERY STATUS</a><br>
        </div>
        <div class="sidenav-3">
            <%
                int totalItems = imageUploadController.getAllProductCount();
            %>
            <h3 style="padding-left: 20%; font-family: ubuntu; color: #009900;"> REGISTERED PRODUCT COUNT :</h3> <br>
            <h1 style=" padding-left: 30%; background-color: #ccccff; "><%=totalItems%> PRODUCTS </h1>

            <h3 style="padding-left: 20%; font-family: ubuntu; color: #009900;">ON SALE  :</h3> <br>
            <%
                int itemsOnBoard = imageUploadController.getAllActiveProductCount();
            %>
            <h1 style=" padding-left: 30%; background-color: #ccccff; "><%=itemsOnBoard%> LAPTOPS ARE SELLING IN SITE </h1>
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
        <%
            }
        %>
    </body>
</html>
