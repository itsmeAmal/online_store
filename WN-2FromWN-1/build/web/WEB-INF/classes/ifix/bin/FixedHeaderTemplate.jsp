<%-- 
    Document   : laptopModelAllWithFixedHeader
    Created on : Aug 3, 2018, 9:56:24 AM
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <style>
        body{
            margin: 0;
            font-family: Arial;
        }
        .top-container{
            background-color: #999999;
            padding: 30px;
            text-align: center;
        }
        .header{
            padding: 10px 16px;
            background: #555;
            color: #000000;           
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
    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <div class="top-container">
            <h1>Scroll Down</h1>
            <p>
                Scroll down to see sticky effect
            </p>

        </div>
        <div class="header" id="myHeader"><h2>My Header</h2></div>
        <div class="content" >
            <p>
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp<br>
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 <br>
                   sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp<br>
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 <br>
                   sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp<br>
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
                sharp
                singer xseries 
                hp pavilion 6 i5
                samsung i3
                acer ultra book i3 
                apple macbook air 
                acer e5 575 i5 
            </p>
        </div>
        <script type="text/javascript">
            window.onscroll = function () {
                myFunction()};
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
    </body>
</html>
