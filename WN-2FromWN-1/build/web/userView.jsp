<%-- 
    Document   : user_account_reg
    Created on : Dec 28, 2016, 6:37:12 PM
    Author     : 4m4l
--%>

<%@page import="ifix.model.User"%>
<%@page import="ifix.controller.userController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account | iFix</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function () {
                window.location.hash = "no-back-button";
            };
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>

            #uname{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 30px;
                top: 27%;
            }
            #address{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 30px;
                top: 35%;
            }
            #contact{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 30px;
                top: 43%;
            }
            #email{
                position: absolute;
                left: 35%;
                width: 250px;
                top: 51%;
                height: 30px;
            }                 


            #pw{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 30px;
                top: 59%;

            }
            #agreement{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 100px;
                top: 67%;

            }
            #btn_2{
                position: absolute;
                left: 35%;
                width: 250px;
                height: 30px;
                top: 60%;
            }

            #backtohomelink{
                position: absolute;
                left: 7%;
                width: 300px;
                height: 30px;
                top: 30%;
            }
            #logo{
                position: absolute;
                left: 35%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }

        </style>
    </head>
    <body style="background-color: #000000;">
        <form action="userViewRedirectToUserEdit" method="post">
            <%
                HttpSession hs = request.getSession();
                String userId = (String) hs.getAttribute("userId");
                User user = userController.getuserByUserId(userId);
                
            %>

            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #ffffff;" />
            <div id="logo"></div>

            <div id="uname">
                <div class="form-control"><%=user.getUserName()%></div>
            </div> 
            <div id="address">
                <div class="form-control"><%=user.getUserAddress()%></div>
            </div>
            <div id="contact">
                <div class="form-control"><%=user.getContact()%></div>
            </div>

            <div id="email">
                <div class="form-control"><%=user.getEmail()%></div>
            </div>

            <div id="btn_2">
                <input type="submit" name="btn-1" class="btn btn-success" style="color: #ffffff; background-color: #0099ff; width: 250px" Value="Edit Profile"/>
            </div>

        </div>

    </form>

</body>
</html>
