<%-- 
    Document   : brand_reg
    Created on : Dec 26, 2016, 6:34:34 AM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Brands</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            }
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>
            #brand_name{
                position: absolute;
                left: 45%;
                width: 200px;
                height: 30px;
                top: 30%;
                background-color: #000099;
            }
            #btn{
                position: absolute;
                left: 45%;
                width: 200px;
                height: 30px;
                top: 42%;

            }
            #country_made{
                position: absolute;
                left: 45%;
                width: 200px;
                height: 30px;
                top: 36%;
            }

            #logo{
                position: absolute;
                left: 35%;
                width: 429px;
                height: 89px;
                top: 15%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
            #backtohomelink{
                position: absolute;
                left: 7%;
                width: 300px;
                height: 30px;
                top: 30%;
            }
        </style>
    </head>
    <body>
        <form action="save_brand" method="POST">
            <div style="position: absolute;    background-image: url('images/1.jpg'); left: 0px; width: 100%; height: 100%; top: 0px; left: 0px;"></div>
            <div id="logo"></div>

            <div id="backtohomelink" >
                <a href="index.jsp" style="font-family: inherit; font-size: 24px; " > Back to Home </a>
            </div>

            <div id="brand_name">
                <input type="text" name="tf-1" class="form-control" placeholder="Brand Name " />
            </div>
            <div id="country_made">
                <input type="text" name="tf-2" class="form-control" placeholder="Country" />
            </div>


            <div id="btn">
                <input type="submit" name="btn-1" class="form-control" style="background-color: #0066ff; color: #ffffff;"/>
            </div>
        </form>



    </body>
</html>
