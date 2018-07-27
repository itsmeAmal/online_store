<%-- 
    Document   : home
    Created on : Jan 17, 2016, 6:28:01 PM
    Author     : 4m4l
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>laptops.lk | Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style type="text/css">

            #background{
                position: relative;
                left: 0px;
                top: 0px;
                width: 80%;
                height: 1000px;
            }

            #heading{
                position: relative;
                left: 200px;
                top: 0px;
                width: 960px;
                height: 250px;
                font-size: 80px;
                font-family: fantasy;
                font-weight: 800;
                /*background-image: url("images_1/w4_mf.png");*/
            }

            #btn-1{
                position: absolute;
                left: 680px;
                top: 100px;
                width: 200px;

            }
            #btn-2{
                position: absolute;
                left: 800px;
                top: 100px;

            }
            #btn-3{
                position: absolute;
                left: 920px;
                top: 100px;

            }
            #btn-4{
                position: absolute;
                left: 1040px;
                top: 100px;

            }
            #combo-1{
                position: relative;
                left: 20px;
                top: -250px;
                width: 100px;
                height: 40px;
                color: #ffffff;
                font-family: sans-serif;
                font-size: 25px;
                font-weight: 100;

            }

            #slider-new-1{
                position: relative;
                left: 200px;
                top: -110px;
                width: 500px;
                height: 400px;
            }

            #bottom{
                position: relative;
                left: 250px;
                top: -380px;
                width: 960px;
                height: 150px;

            }

            #create-profile{
                position: absolute;
                left: 200px;
                top: 200px;
                width: 200px;
                height: 50px;
            }
            #air-new-zealand{
                position: absolute;
                left: 200px;
                top: 30px;
                width: 900px;
                height: 100px;
                font-family: inherit;
                font-size: 60px;
                font-weight: 300;
            }
            #logo{
                position: absolute;
                top: 0px;
                left: 1000px;
                width: 100px;
                height: 100px;
                background-image: url("com.official.cazzendra.images.icon/Air-New-Zealand-logo.png");
            }
            #line{
                position: absolute;
                top: 80px;
                left: 720px;
                width: 400px;
                height: 1px;
                background-color: #000000;
            }

            #hotline{
                position: absolute;
                top: 50px;
                left: 750px;
                width: 400px;
                height: 200px;
                font-family: cursive;
                font-weight: 100;
                font-size: 20px;
            }
            #bottom-base{
                position: absolute;
                top: 590px;
                left: 200px;
                width: 960px;
                height: 500px;
                background-color: #ffffff;
            }
            #login_1{
                position: absolute;
                top: 100px;
                left: 200px;
                width: 200px;
                height: 50px;
            }
            #box-1{
                position: absolute;
                top: 0px;
                left: -35px;
                width: 220px;
                height: 176px;
                background-image: url("com.official.cazzendra.images.background/3.jpg");
            }

            #box-2{
                position: absolute;
                top: 0px;
                left: 200px;
                width: 220px;
                height: 176px;
                background-image: url("com.official.cazzendra.images.background/4.jpg");

            }

            #box-3{
                position: absolute;
                top: 0px;
                left: 435px;
                width: 220px;
                height:176px;
                background-image: url("com.official.cazzendra.images.background/1.jpg");

            }
            #box-4{
                position: absolute;
                top: 0px;
                left: 670px;
                width: 220px;
                height:176px;
                background-image: url("com.official.cazzendra.images.background/2.jpg");
            }
            #btn-link-1{
                position: absolute;
                left: 350px;
                width: 100px;
                height: 50px;
                top: 760px;
            }
            #btn-link-2{
                position: absolute;
                left: 585px;
                width: 100px;
                height: 50px;
                top: 760px;
            }
            #btn-link-3{
                position: absolute;
                left: 820px;
                width: 100px;
                height: 50px;
                top: 760px;
            }
            #btn-link-4{
                position: absolute;
                left: 1055px;
                width: 100px;
                height: 50px;
                top: 760px;
            }
            #info_area{
                position: absolute;
                left: 200px;
                top: 810px;
                width: 220px;
                height: 280px;
                background-color: #cccccc;

            }
            #name_anz{
                position: relative;
                left: 30px;
                top: 100px;
                width: 200px;
                height: 50px;
                color: #ffffff;
                font-family: inherit;
                font-weight: 100;
                font-size: 18px;
            }
            #user_login{
                position: relative;
                left: 700px;
                top: 200px;
                width: 100px;
                height: 100px;
                color:  #006600;


            }

            #fl-infomation-1{
                position: relative;
                left: 450px;
                top: -400px;
                width: 150px;
                height: 50px;

            }
            #fl-top-black-line{
                position: absolute;
                left: 450px;
                top: 820px;
                width: 692px;
                height: 5px;
                color: #000000;
                background-color: #000000;

            }

        </style>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">
        <%-- javascript image slider--%>
        <link href="themes/3/js-image-slider.css" rel="stylesheet" type="text/css" />
        <script src="themes/3/js-image-slider.js" type="text/javascript"></script>
        <link href="generic.css" rel="stylesheet" type="text/css" />
        <style type="text/css">
            .cap  {width:190px;height:240px;display:inline-block;background:white url(com.official.cazzendra.images.background/caption1.png) no-repeat 0 0;border-radius:4px;}
            .cap2 {background-image:url(com.official.cazzendra.images.background/caption2.png)}
            .cap3 {background-image:url(com.official.cazzendra.images.background/caption3.png)}
            .cap4 {background-image:url(com.official.cazzendra.images.background/caption4.png)}
        </style>

        <%--end of - javascript image slider--%>

    </head>
    <body style="position: absolute; width: ">
        <div id="background">
            <div id="heading">
            </div>
            <div id="air-new-zealand">
                iFix Computers
            </div>
            <div id="logo">
            </div>
            <div id="login_1">
                <a href="controlPanel.jsp" style="font-family: inherit; font-size: 18px; font-weight: 100; text-align: center" >Administrator Login</a>
            </div>
            <div id="hotline">
                Hot Line - +(0)94 71 1023 694
            </div>
            <div id="line">
            </div>
            <div id="create-profile">
            </div>
            <div id="btn-1">
                <a href="#" class="btn btn-info" style="width: 110px;">LAPTOPS   </a>
            </div>
            <!--            <button id="btn-1" type="button" class="btn btn-warning">Flight Booking</button>-->
            <div id="btn-2">
                <a href="#" class="btn btn-info" style="width: 110px;">SERVICES   </a>
            </div>
            <!--            <button id="btn-2" type="button" class="btn btn-warning">Hotel Services</button>-->
            <div id="btn-3">
                <a href="#" class="btn btn-info" style="width: 110px;">ABOUT    </a>
            </div>
            <!--            <button id="btn-3" type="button" class="btn btn-warning">Flights & Hotels</button>-->
            <div id="btn-4">
                <a href="#" class="btn btn-info" style="width: 110px;">HELP     </a>
            </div>
            <div id="slider-new-1">
                <div id="sliderFrame">
                    <div id="slider">
                        <a href="#"><img src="com.official.cazzendra.images.background/slider-1.jpg" alt="#htmlcaption1" /></a>
                        <a class="lazyImage" href="com.official.cazzendra.images.background/slider-2.jpg" title="#htmlcaption2">slide 2</a>
                        <a href="#">
                            <b data-src="com.official.cazzendra.images.background/slider-3.jpg" data-alt="#htmlcaption3">Image Slider</b>
                        </a>
                        <a class="lazyImage" href="com.official.cazzendra.images.background/slider-4.jpg" title="#htmlcaption4">slide 4</a>
                    </div>
                    <!--thumbnails-->
                    <div id="thumbs">
                        <div class="thumb"><img src="com.official.cazzendra.images.background/thumb.png" /></div>
                        <div class="thumb"><img src="com.official.cazzendra.images.background/thumb.png" /></div>
                        <div class="thumb"><img src="com.official.cazzendra.images.background/thumb.png" /></div>
                        <div class="thumb"><img src="com.official.cazzendra.images.background/thumb.png" /></div>
                    </div>
                    <!--captions-->
                    <div style="display: none;">
                        <div id="htmlcaption1">
                            <div class="cap"></div>
                        </div>
                        <div id="htmlcaption2">
                            <div class="cap cap2"></div>
                        </div>
                        <div id="htmlcaption3">
                            <div class="cap cap3"></div>
                        </div>
                        <div id="htmlcaption4">
                            <div class="cap cap4"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%-- image slider source code --%>
        <div id="bottom-base">       
        </div>
        <div id="bottom">

            <div id="box-1">

            </div>
            <div id="box-2">
            </div>
            <div id="box-3"></div>
            <div id="box-4">
            </div>
        </div>
        <div id="btn-link-1">
            <a href="create-profile.jsp" class="btn btn-info" style="border-radius: 24px;">See more</a>
        </div>
        <div id="btn-link-2">
            <a href="#" class="btn btn-info" style="border-radius: 24px;">See more</a>
        </div>
        <div id="btn-link-3">
            <a href="#" class="btn btn-info" style="border-radius: 24px;">See more</a>
        </div>
        <div id="btn-link-4">
            <a href="#" class="btn btn-info" style="border-radius: 24px;">See more</a>
        </div>
        <div id="user_login">
        </div>
        <div id="info_area">
            <div class="container">
                <h1></h1>
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">- Quick Links -
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">Baggage</a></li>
                        <li><a href="#">Special Assistance</a></li>
                        <li><a href="#">Where We Fly</a></li>
                        <li><a href="#">Company Information</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div id="fl-top-black-line">
        </div>
        <div id="fl-infomation-1">
            <p style="font-family: sans-serif; font-size: 14px; font-weight: 800;"> Flight Information</p>
            <a href="#" style="font-family: sans-serif; font-size: 12px;" >Arrivals and Departures</a>
            <h6></h6>
            <a href="#" style="font-family: sans-serif; font-size: 12px;"> Flight Schedules</a>
            <h6></h6>
            <a href="#" style="font-family: sans-serif; font-size: 12px;"> Route Maps</a>
            <h6></h6>
            <a href="#" style="font-family: sans-serif; font-size: 12px;"> Travel Alert Information</a>
            <h6></h6>
            <a href="#" style="font-family: sans-serif; font-size: 12px;"> Flight Schedules</a>
        </div>
    </body>
</html>
