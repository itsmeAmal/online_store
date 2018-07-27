<%-- 
    Document   : commonPageTemplate
    Created on : Sep 2, 2017, 9:37:36 AM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Search User | iFix</title>

        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>
            #logo{
                position: absolute;
                left: 65%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
        </style>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">

    </head>
    <body>
        <form action="userSearchFromControlPanel">
            <div id="logo"></div>
            <div style="position: absolute; left: 33%; width: 250px; top: 44%; height: 30px;"><input class="form-control" type="text" name="uname" placeholder="Search by user's Name"/>  </div>
            <div style="position: absolute; left: 52%; width: 150px; top: 44%; height: 30px;"><input type="submit" name="btn-1" value="Search" class="btn btn-info" style="width: 100px;"/> </div>
        </form> 
    </body>
</html>
