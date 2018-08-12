<%-- 
    Document   : pay_online
    Created on : Jan 22, 2017, 2:20:11 PM
    Author     : 4m4l
--%>

<%@page import="ifix.model.User"%>
<%@page import="ifix.controller.userController"%>
<%@page import="ifix.controller.userController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pay Online</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function () {
                window.location.hash = "no-back-button";
            };
        </script>
        <style>

            #back_box{
                position: absolute;
                alignment-adjust: central;
                left: 20%;
                width: 600px;
                height: 550px;
                top: 10%;
                border-style: groove;

            }
            #payment_type_d{
                position: absolute;
                left: 30px;
                width: 200px;
                height: 30px;
                top: 20px;

            }
            #cart_images{
                position: absolute;
                left: 250px;
                width: 187px;
                height: 40px;
                top: 50px;
                background-image: url("com.official.cazzendra.images.paymentgateway/1.png");
            }
            #name_on_card{
                position: absolute;
                left: 30px;
                width: 400px;
                height: 30px;
                top: 100px;

            }
            #address_l1{
                position: absolute;
                left: 30px;
                width: 200px;
                height: 30px;
                top: 145px;
            }
            #address_l2{
                position: absolute;
                left: 30px;
                width: 200px;
                height: 30px;
                top: 190px;
            }
            #city{
                position: absolute;
                left: 30px;
                width: 200px;
                height: 30px;
                top: 235px;

            }
            #credit_card_no{
                position: absolute;
                left: 30px;
                width: 200px;
                height: 30px;
                top: 280px;
            }
            #exp_month{
                position: absolute;
                left: 30px;
                width: 150px;
                height: 30px;
                top: 345px;
            }
            #exp_year{
                position: absolute;
                left: 190px;
                width: 150px;
                height: 30px;
                top: 370px;

            }
            #statement{
                position: absolute;
                left: 30px;
                width: 350px;
                height: 100px;
                top: 420px;
            }
            #confirm_payment{
                position: absolute;
                left: 30px;
                width: 100px;
                height: 30px;
                top: 490px;

            }
            #cancel_payment{
                position: absolute;
                left: 210px;
                top: 490px;
                width: 100px;
                height: 30px;
            }
        </style>
    </head>
    <body>    
        <%
            HttpSession hs = request.getSession();
            String email = (String) hs.getAttribute("loggedIn");
            if (hs.getAttribute("loggedIn") != null) {
                User user = userController.getuserByUserEmail(email);


        %>

        <div id="back_box">
            <div id="payment_type_d">
                <h5>Credit Card Type</h5>
                <select class="form-control" name="card_type">
                    <option>Master</option>
                    <option>Visa </option>
                    <option>AMEX </option>
                </select>
            </div>

            <div id="cart_images"></div>
            <div id="name_on_card"> <input type="text" name="tf-1" placeholder="Name on credit card"  class="form-control" value="<%=user.getUserName() %>"/> </div>
            <div id="address_l1"> <input type="text" name="tf-2" placeholder="Address Line 1" class="form-control" value="<%=user.getUserAddress() %>" /> </div>
            <div id="address_l2" > <input type="text" name="tf-3" placeholder="Address Line 2" class="form-control" />  </div>
            <div id="city"> <input type="text" name="tf-4" placeholder="City" class="form-control" />   </div>
            <div id="credit_card_no"> <input type="text" name="tf-5" placeholder="Credit Card No" class="form-control" />   </div>
            <div id="exp_month"> 
                <h5>Expiration Date</h5>
                <select class="form-control" name="exp_mnth2">
                    <option>January</option>
                    <option>February</option>
                    <option>March</option>
                    <option>April</option>
                    <option>May</option>
                    <option>June</option>
                    <option>July</option>
                    <option>August</option>
                    <option>September</option>
                    <option>October</option>
                    <option>November</option>
                    <option>December</option>
                </select>
            </div>
            <div id="exp_year">
                <h5></h5>
                <select class="form-control" name="exp_year2">
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                    <option>2019</option>
                    <option>2020</option>
                    <option>2021</option>
                    <option>2022</option>
                    <option>2023</option>
                    <option>2024</option>
                    <option>2025</option>
                    <option>2026</option>
                </select>
            </div>
            <div id="statement">
                <p>
                    For on-time posting on the payment to your account please allow three business days 
                    prior to the due date for processing
                </p>
            </div>               
            <form action="invoiceServlet" method="post"> 
                <div id="confirm_payment"><input type="submit" name="payment" value="PAY" class="btn btn-success" style="position: absolute; width: 150px;"  /> </div>
            </form>
            <div id="cancel_payment"> <a href="userProfile.jsp"  class="btn btn-success" style="position: absolute; width: 150px;" >Cancel</a>  </div>
        </div>
        <%
            }
        %>
    </body>
</html>
