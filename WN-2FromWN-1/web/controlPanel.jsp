<%-- 
    Document   : controlPanel
    Created on : Aug 4, 2017, 6:41:33 AM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control Panel</title>
        <style>
            #divOuter{               
                position: absolute;
                left: 0px;
                width: 100%;
                height: 100%;
                top: 0px;    
                background-color: #cccccc;
            }
            #divTopBlueLine{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 5%;
                top: 0px;
                background-color: #0066ff;
            }
            #divLeftBlackSpace{
                position: absolute;
                left: 0px;
                width: 15%;
                height: 100%;
                top: 5%;  
                background-color: #333333;
            }
            #divTopWhiteSpece{
                position: absolute;
                left: 15%;
                width: 85%;
                height: 6%;
                top: 5%;
                background-color: #ffffff;
            }
            #divMenuBox1{
                position: absolute;
                left: 17%;
                top: 13%;
                width: 19%;
                height: 9%;
                background-color: #cc66ff;
            }
            #divMenuBox2{
                position: absolute;
                left: 38%;
                top: 13%;
                width: 19%;
                height: 9%;
                background-color: #33ccff;
            }
            #divMenuBox3{
                position: absolute;
                left: 59%;
                top: 13%;
                height: 9%;
                width: 19%;
                background-color: #ff6666;
            }
            #divMenuBox4{
                position: absolute;
                left: 80%;
                width: 19%;
                height: 9%;
                top: 13%;
                background-color: #ffcc00;
            }
            #divTopWhiteSpece_lblDashBoard{
                position: absolute;
                left: 2%;
                top: 10%;
                width: 30%;
                height: 70%;
                font-size: 24px;
                font-weight: 500;
                color: #666666;
            }
            #divMenuBox1_worldIcon{
                position: absolute;
                left: 80%;
                top: 20%;
                width: 48px;
                height: 48px;
                background-image: url('web.pos.ee.images/world.png');               
            }
            #divMenuBox2_mailIcon{
                position: absolute;
                left: 80%;
                top: 20%;
                width: 48px;
                height: 48px;
                background-image: url('web.pos.ee.images/mail.png'); 
            }
            #divMenuBox3_fieldsIcon{
                position: absolute;
                left: 80%;
                top: 20%;
                width: 48px;
                height: 48px;
                background-image: url('web.pos.ee.images/fields.png'); 
            }
            #divMenuBox4_dataBases{
                position: absolute;
                left: 80%;
                top: 20%;
                width: 48px;
                height: 48px;
                background-image: url('web.pos.ee.images/db.png'); 
            }
            #divTopBlueLine_cloudControl{
                position: absolute;
                left: 0px;
                width: 15%;
                height: 5%;
                top: 0px;
                background-color: #003399;
            }
            #divTopBlueLine_cloudControl_comIcon{
                position: absolute;
                left: 5%;
                width: 32px;
                height: 32px;
                top: 0px;
                background-image: url('web.pos.ee.images/cloudcontrol.png');
            }
            #divTopBlueLine_cloudControl_txtCoudControl{
                position: absolute;
                left: 30%;
                width: 60%;
                height: 5%;
                top: 20%; 
                font-size: 20px;
                font-weight: 500;
                color: #ffffff;
            }
            #divLeftBlackSpace_management{
                position: absolute;
                left: 20%;
                top: 10%;
                width: 80%;
                height: 30px;
                color: #ffffff;
                font-size: 24px;
                font-weight: 300;
            }
            #allUsers{
                position: absolute;
                left: 25%;
                width: 80%;
                height: 30px;
                top: 20%;
                color: #ffffff;
                font-weight: 200;
                font-family: serif;
            }
            #addProducts{
                position: absolute;
                left: 25%;
                width: 80%;
                height: 30px;
                top: 45%;
                color: #ffffff;
                font-weight: 200;
                font-family: serif;
            }
            #addUser{
                position: absolute;
                left: 25%;
                width: 80%;
                height: 30px;
                top: 25%;
                color: #ffffff;
                font-weight: 200;
                font-family: serif;
            }
            #addGrn{
                position: absolute;
                left: 25%;
                width: 80%;
                height: 30px;
                top: 50%;
                color: #ffffff;
                font-weight: 200;
                font-family: serif;
            }
            #searchUser{
                position: absolute;
                left: 25%;
                width: 80%;
                height: 30px;
                top: 30%;
                color: #ffffff;
                font-weight: 200;
                font-family: serif;
            }
        </style>
    </head>
    <body>
        <div id="divOuter"> 
            <%--<jsp:include page='buttonGroup.jsp'></jsp:include>--%>
            <div id="divTopBlueLine"></div>
            <div id="divTopBlueLine_cloudControl">
                <div id="divTopBlueLine_cloudControl_comIcon"></div>
                <div id="divTopBlueLine_cloudControl_txtCoudControl">Cloud Control</div>
            </div>
            <div id="divLeftBlackSpace">
                <div id="divLeftBlackSpace_management">Management</div>
                <div id="allUsers"> <a style="color: #ffffff;" href="usersAll.jsp">Users</a></div>
                <div id="addProducts"> <a style="color: #ffffff;" href="laptopImageUpload.jsp">PRODUCT MANAGEMNT</a></div>
                <div id="addUser"> <a style="color: #ffffff;" href="userAdd.jsp">NEW USER</a></div>
                <div id="addGrn"> <a style="color: #ffffff;" href="GRN.jsp">Goods Received Note</a></div>
                <div id="searchUser"> <a style="color: #ffffff;" href="userSearchFromControlPanel.jsp">User Search</a> </div>

            </div>
            <div id="divTopWhiteSpece">
                <div id="divTopWhiteSpece_lblDashBoard">Dashboard   /</div>
            </div>
            <div id="divMenuBox1">
                <div id="divMenuBox1_worldIcon"></div>
            </div>
            <div id="divMenuBox2">
                <div id="divMenuBox2_mailIcon"></div>
            </div>
            <div id="divMenuBox3">
                <div id="divMenuBox3_fieldsIcon"></div>
            </div>
            <div id="divMenuBox4">
                <div id="divMenuBox4_dataBases"></div>
            </div>
        </div>
    </body>
</html>
