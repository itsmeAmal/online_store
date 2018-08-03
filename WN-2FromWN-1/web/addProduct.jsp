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
            left: 20%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-2{
            position: fixed; 
            left: 33%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-3{
            position: fixed; 
            left: 46%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav-4{
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
        <title>Product Management</title>
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
            <div style="position: relative; left: 0px; width: 100%; top: 0px; height: 40px;
                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;">DETAIL</div>
            <div style="position: relative; left: 5px; width: 80%; top: 10px; height: 20px; color: #999999; ">BRAND</div>
            <div style="position: relative; left: 5px; width: 80%; top: 5%; height: 50px;">
                <select class="form-control" style="width: 210px;;">
                    <option>APPLE</option>
                    <option>DELL</option>
                    <option>LENOVO</option>
                    <option>HP</option>
                    <option>SAMSUNG</option>
                    <option>ACER</option>
                    <option>SINGER</option>
                    <option>PANASONIC</option>
                    <option>COMPAQ</option>
                </select>
            </div>
            <div style="position: relative; left: 5px; width: 80%; top: 10%; height: 20px; color: #999999; ">MODEL</div>
            <div style="position: relative; left: 5px; width: 80%; top: 12%; height: 20px; color: #999999; ">
                <input type="text" class="form-control" placeholder="MODEL" style=" width: 210px;"/><br>
            </div>
            <div style="position: relative; left: 5px; width: 80%; top: 22%; height: 20px; color: #999999; ">PRICE</div>
            <div style="position: relative; left: 5px; width: 80%; top: 24%; height: 20px; color: #999999; ">
                <input type="text" class="form-control" placeholder="PRICE" style=" width: 210px;"/><br>
            </div>
        </div>
        <div class="sidenav-2">
            <div style="position: relative; left: 0px; width: 100%; top: 0px; height: 40px;
                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;">RAM</div>
            <div style="position: relative;left: 10%; top: 5%; width: 30%; height: 20px; font-family: Arial;">
                <input type="radio" name="ram" value="2 GB" checked="checked" >2 GB <br>
                <input type="radio" name="ram" value="4 GB" >4 GB <br>
                <input type="radio" name="ram" value="6 GB" >6 GB <br>
                <input type="radio" name="ram" value="8 GB" >8 GB <br>
                <input type="radio" name="ram" value="16 GB" >16 GB <br>
            </div>
            <div style="position: relative; top: 30%; width: 100%; border-bottom:  groove;height: 50px; border-width: 
                 thin; border-top: groove; border-top-width: thin; text-align: center; padding-top: 7px; color: #999999; font-weight: 700; font-family: Arial; ">
                INTERNAL STORAGE
            </div>
            <div style="position: relative;left: 10%; top: 35%; width: 50%; height: 20px; font-family: Arial;">
                <input type="radio" name="storage" value="500 GB" checked="checked" >500 GB <br>
                <input type="radio" name="storage" value="1 TB" >1 TB <br>
                <input type="radio" name="storage" value="2 TB" >2 TB <br>
                <input type="radio" name="storage" value="128 GB SSD" >128 GB SSD <br>
                <input type="radio" name="storage" value="256 GB SSD" >256 GB SSD <br>
                <input type="radio" name="storage" value="512 GB SSD" >512 GB SSD <br>
            </div>
        </div>
        <div class="sidenav-3">
            <div style="position: relative; left: 0px; width: 100%; top: 0px; height: 40px;
                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;">PROCESSOR</div>
            <div style="position: relative;left: 10%; top: 5%; width: 50%; height: 20px; font-family: Arial;">
                <input type="radio" name="processor" value="CELERON" checked="checked" >CELERON <br>
                <input type="radio" name="processor" value="PENTIUM" >PENTIUM <br>
                <input type="radio" name="processor" value="DUAL CORE" >DUAL CORE <br>
                <input type="radio" name="processor" value="CORE i3" >CORE i3<br>
                <input type="radio" name="processor" value="CORE i5" >CORE i5<br>
                <input type="radio" name="processor" value="CORE i7" >CORE i7<br>
            </div>
            <div style="position: relative; top: 30%; width: 100%; border-bottom:  groove;height: 50px; border-width: 
                 thin; border-top: groove; border-top-width: thin; text-align: center; padding-top: 7px; color: #999999; font-weight: 700; font-family: Arial; ">
                OPERATING SYSTEM
            </div>
            <div style="position: relative;left: 10%; top: 35%; width: 50%; height: 20px; font-family: Arial;">
                <input type="radio" name="OS" value="WINDOWS 7" checked="checked" >WINDOWS 7 <br>
                <input type="radio" name="OS" value="WINDOWS 8" >WINDOWS 8 <br>
                <input type="radio" name="OS" value="WINDOWS 8.1" >WINDOWS 8.1 <br>
                <input type="radio" name="OS" value="WINDOWS 10" >WINDOWS 10 <br>
                <input type="radio" name="OS" value="UBUNTU" >UBUNTU <br>
                <input type="radio" name="OS" value="NONE" >NONE <br>
            </div>

        </div>
        <div class="sidenav-4">
            
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
