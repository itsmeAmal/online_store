<%-- 
    Document   : login
    Created on : Jan 22, 2017, 8:21:35 PM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function () {
                window.location.hash = "no-back-button";
            }
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>
            #background_color{
                position: absolute;
                left: 0px;
                top: 0px;
                width: 100%;
                height: 700px;
            }
            #uname{
                position: absolute;
                left: 35%;
                width: 200px;
                height: 30px;
                top: 30%;

            }
            #pw{
                position: absolute;
                left: 35%;
                top: 37%;
                height: 30px;
                width: 200px;

            }
            #btn{
                position: absolute;
                left: 35%;
                width: 200px;
                height: 30px;
                top: 43%;
            }

        </style>
    </head>
    <body>
        <form action="login" method="post">
            <div id="background_color" style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; background-image: url('images/1.png');">
                <div id="uname"> <input type="text" name="email" class="form-control" placeholder="user name" /> </div>
                <div id="pw"> <input type="text" name="pw" class="form-control" placeholder="password"/>  </div>
                <div id="btn"> <input type="submit" name="btn-1" value="Login" class="btn btn-info" style="width: 200px;"/> </div>
                <div style="position: absolute; left: 35%; width: 200px; height: 30px; top: 50%; alignment-adjust: central;"> <a href="userAdd.jsp">or Create account</a></div>

            </div>
        </form>

    </body>
</html>
