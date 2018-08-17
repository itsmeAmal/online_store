<%-- 
    Document   : user_account_reg
    Created on : Dec 28, 2016, 6:37:12 PM
    Author     : 4m4l
--%>

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
                top: 88%;
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
        <form action="userAdd" method="post">
            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #ffffff;">
            <div id="logo"></div>
            <a href="productList.jsp" style="position: absolute; left: 100px; top: 150px;"><h4>HOME</h4></a>

            <div id="uname">
                <input type="text" name="uname" placeholder="Name" class="form-control" required />
            </div> 
            <div id="address">
                <input type="text" name="address" placeholder="Address" class="form-control" required />
            </div>
            <div id="contact">
                <input type="text" name="contact" placeholder="Contact" class="form-control" required />
            </div>

            <div id="email">
                <input type="text" name="email" placeholder="Email" class="form-control" required />
            </div>
            <div id="pw">
                <input type="text" name="password" placeholder="Password" class="form-control" required />
            </div>

            <div id="agreement">
                <p style="color: #000000;">
                    By Registering, you agree that you've read and accepted our user agreement,
                    you're at least 18 years old, and consent to our privacy notice and receiving
                    marketing communications from us.
                </p>
            </div>
            <div id="btn_2">
                <input type="Submit" value="Submit" class="form-control" style="color: #ffffff; background-color: #0099ff; alignment-adjust: middle; "  />
            </div>
        </div>

    </form>

</body>
</html>
