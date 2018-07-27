<%-- 
    Document   : laptopModelAdd
    Created on : Aug 29, 2017, 6:28:30 PM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Laptop Model | ifix</title>
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
        <form action="fileupload" method="POST" enctype="multipart/form-data">
            <div id="outerDiv">
                <div style="position: absolute; left: 20%; top: 5%; width: 60%; height: 90%; background-color: #ffffff;">
                    <div id="logo"></div>
                    <div style="position: absolute; left: 10%; top: 25%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="laptopModelLaptopId" placeholder="Laptop ID" required/></div>
                    <div style="position: absolute; left: 10%; top: 33%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="hardDisk" placeholder="Hard Disk Size" required/></div>
                    <div style="position: absolute; left: 10%; top: 41%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="ram" placeholder="RAM" required/></div>
                    <div style="position: absolute; left: 10%; top: 49%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="vga" placeholder="VGA" required/></div>
                    <div style="position: absolute; left: 10%; top: 57%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="processor" placeholder="Processor" required/></div>
                    <div style="position: absolute; left: 10%; top: 65%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="usbType1" placeholder="USB Type 1" required/></div>
                    <div style="position: absolute; left: 10%; top: 73%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="usbType2" placeholder="USB Type 2" required/></div>
                    <div style="position: absolute; left: 10%; top: 81%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="hdmi" placeholder="HDMI Output" required/></div>
                    <div style="position: absolute; left: 50%; top: 25%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="vgaOp" placeholder="VGA Output" required/></div>
                    <div style="position: absolute; left: 50%; top: 33%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="screenSize" placeholder="Screen Size" required/></div>
                    <div style="position: absolute; left: 50%; top: 41%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="cache" placeholder="Cache Memory" required/></div>
                    <div style="position: absolute; left: 50%; top: 49%; width: 250px; height: 30px;"> <input type="file" name="imagePath" multiple="true" class="form-control"></div>
                    <div style="position: absolute; left: 50%; top: 57%; width: 250px; height: 30px;"> <input type="submit" class="btn btn-info" name="btn" value="Save Laptop Model"/></div>
                </div>
            </div>
        </form>
    </body>
</html>
