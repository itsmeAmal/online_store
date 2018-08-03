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
            background-color: #999999;
            padding: 30px;
            text-align: center;
        }
        .header{
            padding: 10px 16px;
            background: #555;
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
    </style>
    <head>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <div class="top-container">
            <h1>iFix Laptops</h1>
            <p>
                Something Different
            </p>

        </div>
        <div class="header" id="myHeader">
            <div style="position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;">CATEGORIES</div>
            <div style="position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;
                 color: #ffffff; font-weight: 500;" >HOME</div>
            <div style="position: relative; left: 50%; top: -120%; width: 20%; height: 40px;" >
                <input type="text" class="form-control" id="search" />
            </div>
        </div>
        <div class="content" >
            <form action="CartReferences">
                <%
                    ResultSet rset = imageUploadController.getAllProducts();
                %>
                <div class="container" style="position: absolute; left: 20%; top: 30%; width: 60%; height: max-content; background-color: #ffffff;">
                    <table class="table table-striped">                  
                        <%  while (rset.next()) {
                                HttpSession hs = request.getSession();
                                hs.setAttribute("laptopId", rset.getString("imageUpload_id"));
                        %>
                        <tr class="table-responsive">  
                            <td style="width: 200px; height: 200px;"><image src="uploadedImages/<%= rset.getString("imageUpload_file_name")%>">
                                <div style="position: absolute; left: -40px; width: 80px; height: 60px; top: 0px; background-image: url(web.pos.ee.images/13_off.PNG);"></div>
                            </td>
                            <td style="position:  relative; font-size: large; font-weight: 800; text-align: center; top: 30%;"  ><%= rset.getString("imageupload_item_desc")%>                         
                            </td>
                            <td style="font-size: large; font-weight: 800; color: #0000cc;" ><%= rset.getString("imageupload_price")%>
                            </td>
                        <input type="hidden" name="itemId" value="<%=rset.getString("imageUpload_id")%>"/>                    
                        <td>
                            <div style="position: relative; left: 0px; top: 10px; width: 100%; height: 50px;">
                                <input class="btn btn-success" type="submit" value="Add to Cart" style="width: 100px; background-color: #990099;"/>
                            </div>
                            <div style="position: relative; left: 0px; width: 100%; height: 50px; top: 15px;">
                                <input class="btn btn-info" type="submit" value="Buy Now" style="width: 100px; background-color: #00cc33; "/>
                            </div>


                        </td>
                        </tr>
                        <%  }
                        %>
                    </table>
                </div>
            </form>                  
        </div>
                    <!--filter area-->
                    <div style="position: absolute; left: 5%; top: 40%; width: 15%; height: 40%; background-color: #0066cc;">
                        
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
    </body>
</html>
