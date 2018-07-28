<%-- 
    Document   : menu_admin
    Created on : Dec 24, 2016, 8:10:08 PM
    Author     : 4m4l
--%>

<%@page import="java.util.List"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="org.hibernate.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            }
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/style.css" type="text/css" media="all">
    </head>
    <body>
        <div class="example">
            <ul id="nav">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="#">Account</a>
                    <div>

                        <ul>

                            <li><a href="userAdd.jsp">Create Account</a></li>


                        </ul>
                    </div>
                </li>
<!--                <li><a href="#">Brands</a>
                    <div>
                        <ul>
                            <li><a href="acer.jsp">Acer</a></li>
                            <li><a href="dell.jsp">Dell</a></li>
                            <li><a href="Apple.jsp">Apple</a></li>
                            
                        </ul>
                    </div>
                </li>-->
                 <li><a href="#">Login</a>
                    <div>
                        <ul>
                            <li><a href="login.jsp">Login</a></li>
                            
                            
                        </ul>
                    </div>
                </li>
                <li><a href="our_services.jsp">Our Services</a>
<!--                    <div>
                        <ul>
                            <li><a href="#">Printers</a></li>
                            <li><a href="#">Scanners</a></li>
                            <li><a href="#">Routers</a></li>

                        </ul>
                    </div>-->
                </li>
<!--                <li><a href="login.jsp">Login</a></li>-->
                <li><a href="view.jsp">All Products</a></li>
                <li class="pad"></li>
            </ul>
        </div>
    </body>
</html>
