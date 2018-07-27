
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Transaction"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 

        <title>All Laptops</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            };
        </script>
        <style type="text/css">
            #background_box_2{
                position: relative;
                left: 10%;
                width: 70%;
                height: 400px;

                top: 0px;
                padding-top: 0px;

            }
            #menu_space{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 200px;
                background-color: #000000;
                top: 0px;
            }
            #solution1{
                position: absolute;
                left: 0px;
                top: 300px;
                width: 100%;
                height: 100%;    

            }
            #buynow{
                position: absolute;
                left: 50px;
                top: 120px;
                width: 200px;
                height: 100px;
                background-image: url("com.official.cazzendra.images.logos/buy.png");
            }
            #qty_1{
                position: absolute;
                left: 60px;
                top: 200px;
                width: 200px;
                height: 100px;
            }
            #logo{
                position: absolute;
                left: 60%;
                width: 320px;
                height: 67px;
                top: 60%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
            #backtohomelink{
                position: absolute;
                left: 14%;
                width: 300px;
                height: 30px;
                top: 80%;

            }
            #cart_logo{
                position: absolute;
                left: 180px;
                width: 70px;
                height: 70px;
                top: 50px;

            }

        </style>
        <script>
            function preventBack() {
                window.history.forward();
            }
            setTimeout("preventBack()", 0);
            window.onunload = function() {
                null;
            };
        </script>
        
        <script>
            function okmsg(){
                window.alert("Added to cart");
                
            }
        </script>
        
        
        
        
    <div id="menu_space">
        <div id="cart_logo" ><a href="Cart_bill.jsp" style="position: absolute; background-image: url('images/cart.png'); width: 70px; height: 70px;"></a></div>
        <div id="logo"></div>
<!--        <div id="backtohomelink"> <a href="index.jsp" style="font-family: inherit; font-size: 24px; font-weight: 300; color: #ffffff; "  >Back To Home</a>  </div>-->
    </div>
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
        %>
    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;">
        <%@include file="menu_admin.jsp" %>
    </div>
    <%
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
   

    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;">
        <%@include file="menu_user_not_logged.jsp" %>
    </div>
    <%           }

    %>

</head>
<body>
    <div style="position: absolute; left: 60%; width: 30%;  height: 100px; color: #000000; top: 35%; font-family: serif; font-size: 40px; font-weight: 600;">Dell Products</div>
    
    <div id="solution1">

        <%
            //SessionFactory sf = controller.connection.getSessionFactory();
            SessionFactory sf = conn.connector.getSessionFactory();
            Session s = sf.openSession();
            Transaction tr = s.beginTransaction();

            //src.Qqq st = (src.Qqq) s.load(src.Qqq.class, 3);
            pojos.Laptops lpt = (pojos.Laptops) s.load(pojos.Laptops.class, 3);
            Criteria c = s.createCriteria(pojos.Laptops.class);
            c.add(Restrictions.eq("brand", "Dell"));
            List<pojos.Laptops> lis = c.list();
     
            for (pojos.Laptops pr : lis) {

                String modelname = pr.getModel();
                String ram = pr.getRam();
                String vga = pr.getVga();
                String img = pr.getLaptopimg();
                Integer id = pr.getId();
                String brand = pr.getBrand();
                String processor = pr.getProcessor();
                String Screen = pr.getScreensize();
                Integer price = pr.getPriceLap();
                String hard = pr.getHarddisk();
        %>
        <div id="background_box_2">
            <div style="position: relative; color: #000000; font-family: serif; font-size: 30px; padding-left: 20px; padding-top: 0px; width: 300px; height: 50px; font-weight: 400; " > <%= brand%>  <%= modelname%>   </div>
            <div style="color: #000000; font-family: serif; font-size: 20px; padding-left: 50px; padding-top: 10px; width: 250px;  height: 250px;  " > <img src="<%= img%>"> </div>  
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -250px; width: 300px; height: 30px;"   > RAM  : <%= ram%>  </div>
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -245px; width: 250px; "  > Graphics : <%= vga%>  </div>          
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -232px; width: 250px; "  >Processor :  <%= processor%>  </div>
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -220px; width: 250px; "  >Screen : <%= Screen%>  </div>
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -208px; width: 250px; " >Hard Disk : <%= hard%>  </div>
            <div style="position: relative;    color: #000000; font-family: serif; font-size: 16px; padding-left: 300px; top: -196px; width: 250px; " > <%= price%> /-  </div>
            <!--<div style="position: relative; background-color: #999999; padding-left: 10px; width: 100%; height: 5px; top: -134px;   ">  </div>-->
            <form action="SaveCartItem" method="GET">
                <input type="hidden" name="id_h" value=" <%= pr.getId()%> " />

                <input type="text" name="brand_h" value=" <%= pr.getBrand()%>  " hidden/>
                <input type="hidden" name="model_h" value=" <%= pr.getModel()%> " />
                <input type="hidden" name="price_h" value=" <%= pr.getPriceLap()%> " />      
                
                <!--this is the tag which rederect page is decided   -->
                <input type="hidden" name="page_name" value="dell"/>
              

                <div style="position: relative; left: 480px; width: 300px; height: 300px; top: -470px; ">
                   
                    <div id="qty_1"> <input type="number" name="qty_h" class="form-control" placeholder="Quantity" style="width: 170px; height: 30px; font-family: serif; font-size: 24px;  " /> </div>
                    <div style=" position: absolute; width: 170px; height: 50px; top: 250px; left: 20%; ">  <input type="submit" onclick="okmsg()"   name="btn-4" class="btn btn-sm"  value="Add to Cart" style="width: 100px;  height: 30px;  font-size: 14px; "/>  </div>
                </div>
         
               
            
            
            </form>

        </div>
        <%
            }
        %>

    </div>
</body>
</html>
