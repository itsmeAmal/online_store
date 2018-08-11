<%-- 
    Document   : laptopModelAllWithFixedHeader
    Created on : Aug 3, 2018, 9:56:24 AM
    Author     : Amal
--%>

<%@page import="ifix.controller.imageUploadController"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ifix.controller.laptopPriceDetailController"%>
<%@page import="ifix.dao.Impl.laptopPriceDetailDaoImpl"%>
<%@page import="ifix.model.laptopPriceDetail"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <style>
        body{
            margin: 0;
            font-family: Arial;
        }
        .top-container{
            /*background-color: #999999;*/
            padding: 10px;
            text-align: center;
            height: 120px;
        }
        .header{
            padding: 10px 16px;
            background: #cccccc;
            color: #000000; 
            height: 70px;
        }
        .content{
            padding: 16px;
        }
        .sticky{
            position: fixed;
            top: 0px;
            width: 100%;
        }
        .sticky + .content{
            padding-top: 102px;
        }
        .sidenav{
            position: fixed; 
            left: 20%; 
            top: 30%; 
            width: 12%; 
            height: 50%; 
            border: groove;
            padding: 8px 0;
            z-index: 1;
            overflow-x: hidden;
            border-width: thin;
        }
        .sidenav a{
            padding: 6px 8px 6px 16px;
            display: block; 
        }
        .sidenav a:hover{
            color: #009999;
        }
        @media screen and (max-height:450px){
            .sidenav{padding-top: 100px;}
            .sidenav a{font-size: 18px;}
        }
        .footer{
            position: fixed;
            left: 0px;
            bottom: 0px;
            width: 100%;
            background-image: url(web.pos.ee.images/footer.PNG);
            height: 50px;
        }
    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <div style="position: relative; left: 0px; width: 100%; height: 30px; top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333;">               
            Working Hours : Monday - Friday : 8.30 am - 5.30 pm / Saturday : 8.30 am - 1.30 pm
        </div>
        <div class="top-container"> 
            <div style="position: relative; left: 25%; width: 20%; height: 40px; top: 10%; text-align: left;">Hi <a href="userProfile.jsp">Amal</a></div>
            <h1>iFix Laptops.com</h1>
            <p>
                Something Different 
            </p>
        </div>
        <div class="content">
            <%
                
                ResultSet rset = imageUploadController.getProductsByAttribute("APPLE");
               
            %>
            <div class="container" style="position: absolute; left: 35%; top: 30%; width: 40%; height: max-content; background-color: #ffffff;">
                <table class="table">                  
                    <%  while (rset.next()) {
                    %>
                    <tr>  
                        <td style="width: 200px; height: 200px;"><image src="uploadedImages/<%= rset.getString("imageUpload_file_name")%>">
                            <div style="position: absolute; left: -40px; width: 80px; height: 60px; top: 0px; background-image: url(web.pos.ee.images/13_off.PNG);"></div>
                        </td>
                        <td style="position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 600;"><%= rset.getString("imageupload_item_desc")%> <%= rset.getString("imageupload_model")%> 
                            <p id="refCode" style="position:  relative; font-size: x-small; text-align: left; top: 30%; left: 8%; font-weight: 100;">Reference Code : <%= rset.getString("imageUpload_id")%></p>                             

                            <div style="position: absolute; left: 10%; top: 20%; font-weight: 200; font-size: smaller;"> <%= rset.getString("imageupload_processor")%> / <%= rset.getString("imageupload_memory")%> / 
                                <%= rset.getString("imageupload_storage")%> </div>
                            <div style="position: absolute; left: 10%; top: 60%; width: 325px; height: 25px; background-image: url(web.pos.ee.images/cash_on_delivery.PNG)">            
                            </div>
                            <div style="position: absolute; left: 10%; top: 75%; width: 30%; height: 20px; font-size: large; font-weight: 600; color: #ff0000; font-family: Arial;"><%= rset.getString("imageupload_price")%></div>
                        </td>                         
                    <input type="hidden" name="itemId" value="<%=rset.getString("imageUpload_id")%>"/>                    
                    <td>
                        <form action="CartReferences">
                            <div style="position: relative; left: 40%; top: 90px; width: 100%; height: 50px;">
                                <input class="btn btn-success" type="submit" value="Add to Cart" style="width: 100px; background-color: #990099;"/>
                            </div>
                        </form>  
                        <div style="position: relative; left: 40%; width: 100%; height: 50px; top: 85px;">
                            <form action="redirectToProductDetail" method="post">
                                <input type="hidden" id="laptopId" name="laptopId" value="<%=rset.getString("imageUpload_id")%>">
                                <input class="btn btn-info" type="submit" value="More" style="width: 100px; background-color: #00cc33; "/>
                            </form>
                        </div>
                    </td>
                    </tr>
                    <%  }
                    %>
                </table>
            </div>
        </div>
        <!--header-->
        <div class="header" id="myHeader">
            <div style="position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;">CATEGORIES</div>
            <div style="position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;" >HOME</div>
            <div style="position: relative; left: 54%; top: -120%; width: 20%; height: 40px;" >
                <input type="text" class="form-control" id="search" placeholder="SEARCH" />
            </div>
        </div>
        <!--filter area-->
        <div class="sidenav">
            <div style="position: relative; left: 0px; width: 100%; top: 0px; height: 40px;
                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;">FILTER SELECTION</div>
            <div style="position: relative; left: 5px; width: 80%; top: 10px; height: 20px; color: #999999; ">BRANDS</div>
            <div style="position: relative; left: 5px; width: 80%; top: 10px; height: 20px;">
                <%
                    ResultSet set = imageUploadController.getAllDistinctRbandNames();
                %>
                <select class="form-control" name="brand" style="width: 210px;">
                    <option>ALL BRANDS</option>
                    <%while (set.next()) {%>
                    <option><%=set.getString("imageupload_item_desc")%></option> 
                    <%}%>
                </select>
            </div>
            <div style="position: relative; left: 5px; width: 80%; top: 10%; height: 20px;"> 
                <form action="redirectItemFilterByBrand" method="post">
                     <input type="submit" class="btn btn-default" value="BRAND FILTER" style="width: 210px;"/>
                </form>               
            </div>
            <div style="position: relative; left: 5px; width: 80%; top: 20%; height: 20px; color: #999999; ">PRICE</div>
            <div style="position: relative; left: 5px; width: 80%; top: 20%; height: 20px; color: #999999; ">
                <input type="text" class="form-control" placeholder="Lower Price" style=" width: 210px;"/><br>
                <input type="text" class="form-control" placeholder="Highest Price" style=" width: 210px;"/><br>
                <input type="submit" class="btn btn-default" value="PRICE FILTER" style="width: 210px;"/>
            </div>
        </div>
        <script type="text/javascript">
            window.onscroll = function () {
                myFunction()
            };
            var header = document.getElementById("myHeader");
            var sticky = header.offsetTop;
            function myFunction() {
                if (window.pageYOffset > sticky) {
                    header.classList.add("sticky");
                } else {
                    header.classList.remove("sticky");
                }
            }
        </script>
        <div class="footer"></div>
    </body>
</html>
