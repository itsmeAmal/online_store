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
        <form action="userUpdate" method="post">
            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #ffffff;" />
            <div id="logo"></div>
            <%
                HttpSession hs = request.getSession();
                String userId = (String) hs.getAttribute("userId");
                User user = userController.getuserByUserId(userId);

            %>



            <div id="uname">
                <input type="text" name="uname" placeholder="Name" class="form-control" value="<%= user.getUserName()%>" required />
            </div> 
            <div id="address">
                <input type="text" name="address" placeholder="Address" class="form-control" value="<%= user.getUserAddress()%>" required />
            </div>
            <div id="contact">
                <input type="text" name="contact" placeholder="Contact" class="form-control" value="<%= user.getContact()%>" required />
            </div>

            <div id="email">
                <div class="form-control"> <%= user.getEmail()%></div> 
                <input type="hidden" name="email" value="<%= user.getEmail()%>" />
            </div>
            <div id="pw">
                <input type="text" name="password" placeholder="Password" class="form-control" value="<%= user.getPassword()%>" required />
            </div>

            <div id="agreement">
                <p style="color: #000000;">
                    The details you entered will be updated to your profile.
                </p>
            </div>
            <div id="btn_2">
                <input type="Submit" value="Update" class="form-control" style="color: #ffffff; background-color: #0099ff; alignment-adjust: middle; "  />
            </div>



        </div>

    </form>

</body>
</html>
