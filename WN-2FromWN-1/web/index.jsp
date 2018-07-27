<%-- 
    Document   : index
    Created on : Dec 24, 2016, 5:59:07 AM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>iFix Computers</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            };
        </script>
        <style type="text/css">
            #header_my_thin_line{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 5px;
                top: 2px;
                background-color: #999999;
            }
            #hotline_contact_price_list{
                position: absolute;
                top: 15px;
                width:100%;
                height: 20px;
                left: 0px;

            }
            #buy_online_or_call{
                position: absolute;
                left: 10%;
                top: 5px;
                width: 300px;
                height: 10px;
                font-family: sans-serif;
                font-weight: 300;
                color: #ffffff;
            }
            #background_design{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 200%;
                top: 0px;
                //background-image: url('images/1.jpg');
                //background-repeat: repeat repeat;
                //  background-position: center;
            }
            #main_big_image{
                position: absolute;
                left: 13%;
                right: 12%;
                width: 1000px;
                height: 398px;
                top: 200px;
                background-image: url("imgs/asus1.png");
            }
            #logo{
                position: absolute;
                left: 60%;
                width: 320px;
                height: 67px;
                top: 5%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
            #cart_logo{
                position: absolute;
                left: 180px;
                width: 70px;
                height: 70px;
                top: 50px;
            }
            #menu_space{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 200px;
                background-color: #000000;
                top: 0px;
            }
            #box_1{
                position: absolute;
                left: 15%;
                height: 100px;
                font-family: monospace;
                color: #cccccc;
                font-size: 30px;
                font-weight: 300;
                top: 630px;
            }
            #box_2{
                position: absolute;
                left: 15%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/1.png");

            }
            #box_3{
                position: absolute;
                left: 25%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/2.png");
            }
            #box_4{
                position: absolute;
                left: 35%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/3.png");
            }
            #box_5{
                position: absolute;
                left: 45%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/4.png");
            }
            #box_6{
                position: absolute;
                left: 55%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/5.png");
            }
            #box_7{
                position: absolute;
                left: 65%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/6.png");
            }
            #box_8{
                position: absolute;
                left: 75%;
                height: 80px;
                width: 126px;
                top: 680px;
                background-image: url("our_brands/7.png");
            }
            #box_break_btm{
                position: absolute;
                left: 15%;
                width: 1000px;
                height: 100px;
                top: 780px;
                font-family: monospace;
                color: #cccccc;
                font-size: 30px;
                font-weight: 300;

            }

            #bot_info_1{
                position: absolute;
                left: 15%;
                width: 325px;
                height: 155px;
                top: 830px;
                background-image: url("bot_img/3.png");
            }
            #bot_info_2{
                position: absolute;
                left: 39%;
                width: 325px;
                height: 155px;
                top: 830px;
                background-image: url("bot_img/2.png");

            }
            #bot_info_3{
                position: absolute;
                left: 63%;
                width: 325px;
                height: 155px;
                top: 830px;
                background-image: url("bot_img/1.png");
            }
            #login_link{
                position: absolute;
                left: 250px;
                width: 150px;
                height: 30px;
                top: 80px;
                background-color: #ffffff;
            }

            #user_logged{
                position: absolute;
                left: 250px;
                top: 65px;
                width: 300px;
                height: 30px;
                /*                background-color: #33ffff;*/
            }

        </style>


        <%
            HttpSession ht = request.getSession();
            if (ht.getAttribute("type") != null) {

                String type = (String) ht.getAttribute("type");

                String uname = (String) ht.getAttribute("uname");


        %>

        <script type="text/javascript">
            //alert("inside if......");

        </script>

        <%            if (type.equals("admin")) {
    
            
            response.sendRedirect("admin_panel.jsp");
            
            
    } else {
    %>
    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;">
        <%@include file="menu_user_logged_in.jsp" %>
    </div>

    <%
        }


    %>

    <%    } else {

    %>
    <script>

    </script>

    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;">
        <%@include file="menu_user_not_logged.jsp" %>
    </div>
    <%           }

    %>
</head>
<body>   
    
  <!--hidden input tag--> 
  <input type="hidden" name="hdd1" value="index"/>

    <div id="background_design"> 

        <div id="menu_space">  </div>
        <div id="cart_logo"> <a href="Cart_bill.jsp" style="position: absolute; background-image: url('images/cart.png'); width: 70px; height: 70px;"></a></div>

        <div id="user_logged"> 
            <%            HttpSession htt = request.getSession();
                String uname2 = (String) htt.getAttribute("uname");

                if (htt.getAttribute("uname") != null) {
            %>

            <p style="color: #ffffff; font-family: monospace; font-size: 18px;"> you logged as :  <%= uname2%> </p>

            <%

                }
            %>

        </div>
        <div id="header_my_thin_line"></div>
        <div id="hotline_contact_price_list">
            <div id="buy_online_or_call">
                Buy Online or Call +9425 56 27 600
            </div>              
        </v>
        <div id="main_big_image">               
        </div> 
        <div id="box_1">OUR BRANDS</div>
        <div id="box_2"> </div>
        <div id="box_3"></div>
        <div  id="box_4"></div>
        <div id="box_5"></div>
        <div id="box_6"></div>
        <div id="box_7"> </div>
        <div id="box_8"> </div>


        <div id="box_break_btm">OTHER SERVICES </div>
        <div id="bot_info_1"></div>
        <div id="bot_info_2"></div>
        <div id="bot_info_3"></div>
    </div>
    <div id="logo">  </div>
</body>
</html>
