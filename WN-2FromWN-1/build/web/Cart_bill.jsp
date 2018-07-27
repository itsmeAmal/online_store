<%-- 
    Document   : Cart_bill
    Created on : Jan 14, 2017, 11:37:55 PM
    Author     : 4m4l
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="servlets.CartItems"%>
<%@page import="servlets.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Cart</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            }
        </script>
        <style>
            #topblackbox{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 150px;
                top: 0px;
                background-color: #000000;
            }
            #logo{
                position: absolute;
                left: 60%;
                width: 320px;
                height: 67px;
                top: 20%;
                background-image: url("com.official.cazzendra.images.logos/3.png");

            }
            #backtohomelink{
                position: absolute;
                left: 14%;
                width: 300px;
                height: 30px;
                top: 80%;
            }

            #table{
                position: absolute;
                left: 10%;
                width: 60%;
                height: 300px;
                top: 35%;

            }
            #cart_logo{
                position: absolute;
                left: 180px;
                width: 70px;
                height: 70px;
                top: 50px;
                // background-color: #ffffff;
            }
            #invoice_total{
                position: absolute;
                left: 850px;
                width: 300px;
                height: 300px;
                //background-color: #ffffff;
                top: 0px;
                /*                border-style: groove;*/


            }
            #summary{
                position: relative;
                left: 20px;
                width: 100px;
                height: 30px;
                top: 10px;
                font-size: 22px;
                text-align: left;

            }

        </style>

    </head>
    <body>

        <input type="hidden" name="hdd1" value="pay_page"/>





        <div style="position: absolute;   background-repeat: repeat-y; left: 0px; width: 100%; height: 100%; top: 0px; ">
            <div id="topblackbox">
                <div style="position: absolute; left: 10%; top: 10%; width: 200px; height: 5%; color: #ffffff; font-family: serif; font-size: 40px; font-weight: 400; background-color: #ffffff;   ">MyCart</div>
                <!--<div id="cart_logo" ><a href="Cart_bill.jsp" style="position: absolute; background-image: url('images/cart.png'); width: 70px; height: 70px;"></a></div>-->
                <!--<div id="logo"></div>-->
                <div id="logo"></div>
                <!--<div id="backtohomelink"> <a href="index.jsp" style="font-family: inherit; font-size: 24px; font-weight: 300; color: #ffffff; "  >Back To Home</a>  </div>-->

                <div style="position: absolute; left: 16%; top: 35%; width: 100px; "> <a href="index.jsp" style="color:#cccccc; font-size: 20px;"    >Home </a>  </div>
                <div style="position: absolute; left: 21%; top: 35%; width: 100px; "> <a href="view.jsp" style="color:#cccccc; font-size: 20px;"    >Products </a>  </div>



            </div>
            <div id="table" class="container">
                <table class="table table-responsive" >
                    <tr>
                        <th style="width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">Brand</th>
                        <th style="width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Model</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Price</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Quantity</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Total</th>
                        <th style="width: 100px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Remove</th>
                    </tr> 
                    <%
                        HttpSession hs = request.getSession();
                        Cart cr = null;
                        double subtot = 0;

                        if (hs.getAttribute("cart") != null) {
                            cr = (Cart) hs.getAttribute("cart");
                            ArrayList<CartItems> items = cr.getCart();

                            for (CartItems ci : items) {

                                double tot = ci.getQty() * ci.getPrice();
                                subtot += tot;


                    %>
                    <form method="POST" action="RemoveProduct">
                        <tr class="table-condensed">
                            <td> <%= ci.getBrand()%> </td>


                            <td> <%= ci.getModel()%> </td>

                            <td> <%= ci.getPrice()%>  </td>


                            <td> <%= ci.getQty()%> </td>


                            <td> <%= tot%>   </td>
                            <td>                    
                                <input class="btn btn-danger" type="submit" value="remove"/> 
                                <input type="hidden" name="id_h" value="<%=ci.getId()%>"/>


                            </td>
                    </form>
<!--                    <form action="save_product_details">
                        <input type="hidden" name="brand_h" value="<%= ci.getBrand()%>"/>
                        <input type="hidden" name="model_h" value="<%= ci.getModel()%>"/>
                        <input type="hidden" name="qty_h" value="<%= ci.getQty()%>"/>
                        <input type="hidden" name="tot_h" value="<%= ci.getPrice()%>" />


                    </form>-->
                    </tr>

                    <%                            }
                        }
                    %>

                    <div id="invoice_total">

                        <form action="print_bill" method="POST">



                            <div id="summary">Summary</div>
                            <h3 style="position: absolute; left: 20px; height: 30px; top: 30px; width: 200px; font-family: sans-serif; font-size: 15px; color: #000000; text-align: left; " >Total Invoice Value</h3>

                            <h3 style="position: absolute; left: 20px; height: 30px; top: 60px; width: 200px; font-family: sans-serif; font-size: 30px; font-weight: 300; ">
                                <%=subtot%>
                            </h3>


                            <%
                                hs.setAttribute("tot", subtot);

                            %>

                            <input id="sub_tot" type="hidden" value="<%=subtot%>" name="hst">
                            <div style="position: absolute; left: 0px; width: 100%; height: 30px; top: 230px;" >
                                <script>
                                    function click_btn() {
                                        var f = document.getElementById("sub_tot").value;
                                        if (f <= 0) {

                                            window.alert("Update your cart");

                                        }

                                    }

                                </script>

                                <%
                              //  hs.setAttribute(name, value);


                                %>




                                <input onclick="click_btn()" id="btn_pay" type="submit" name="pay_btn" value="PAY" class="btn btn-success" style="position: absolute; width: 40%; " />
                           
                            </div>

                        </form>
                    </div>
                                 
                </table>
            </div>
        </div>
    </body>
</html>
