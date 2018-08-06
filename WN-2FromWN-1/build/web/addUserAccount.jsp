<%-- 
    Document   : laptopModelAllWithFixedHeader
    Created on : Aug 3, 2018, 9:56:24 AM
    Author     : Amal
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
            left: 30%; 
            top: 30%; 
            width: 40%; 
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
    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create an account</title>
    </head>
    <body>
        <div style="position: relative; left: 0px; width: 100%; height: 30px; top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333;">               
            Working Hours : Monday - Friday : 8.30 am - 5.30 pm / Saturday : 8.30 am - 1.30 pm
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
            <div style="position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;">CATEGORIES</div>
            <div style="position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;" >HOME</div>
            <div style="position: relative; left: 54%; top: -120%; width: 20%; height: 40px;" >
                <input type="text" class="form-control" id="search" placeholder="SEARCH" />
            </div>
        </div>
        <!--add detail -->
        <div class="sidenav" >

            <div style="position: relative; left: 30px; width: 80%; top: 10px; height: 20px; color: #999999; ">Create an account</div>

            <div style="position: relative; left: 30px; width: 80%; top: 10%; height: 20px; color: #999999; ">EMAIL</div>
            <div style="position: relative; left: 30px; width: 80%; top: 13%; height: 20px; color: #999999; ">
                <input type="text" class="form-control" placeholder="john@demo.com" style=" width: 210px;"/><br>
            </div>
            <div style="position: relative; left: 30px; width: 80%; top: 20%; height: 20px; color: #999999; ">NAME</div>
            <div style="position: relative; left: 30px; width: 80%; top: 23%; height: 20px; color: #999999; ">
                <input type="text" class="form-control" placeholder="john" style=" width: 210px;"/><br>
            </div>
            <div style="position: relative; left: 30px; width: 80%; top: 30%; height: 20px; color: #999999; ">PASSWORD</div>
            <div style="position: relative; left: 30px; width: 80%; top: 33%; height: 20px; color: #999999; ">
                <input type="password" class="form-control" placeholder="*******" style=" width: 210px;"/><br>
            </div>
            <div style="position: relative; left: 30px; width: 80%; top: 50%; height: 20px; color: #999999; ">
               <input type="submit" class="btn btn-success" value="CREATE ACCOUNT" style="width: 210px;"/><br>
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
