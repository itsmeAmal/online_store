<%-- 
    Document   : laptopImageUpload
    Created on : Jul 28, 2018, 1:05:46 PM
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item</title>
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
            #outerDiv{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 100%;
                top: 0px;
                background-color: #000000;
            }
        </style>
    </head>
    <body>
        <form  action="fileUploadServlet" method="POST" enctype="multipart/form-data">


            <div id="outerDiv">
                <div style="position: absolute; left: 20%; top: 5%; width: 60%; height: 90%; background-color: #ffffff;">
                    <div id="logo"></div>
                    <div style="position: absolute; left: 40%; top: 33%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="description" placeholder="Description" required/></div>
                    <div style="position: absolute; left: 40%; top: 41%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="price" placeholder="Price" required/></div>
                    <input style="position: absolute; left: 40%; top: 49%; width: 250px; height: 30px;" type="file" name="file"/>
                    <input style="position: absolute; left: 40%; top: 57%; width: 250px; height: 30px;" type="submit" value="submit"/> 
                </div>
            </div>

        </form>
    </body>
</html>
