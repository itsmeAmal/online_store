<%-- 
    Document   : usersAll
    Created on : Aug 29, 2017, 7:14:36 AM
    Author     : 4m4l
--%>

<%@page import="ifix.model.User"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="ifix.controller.userController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Users | iFix</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>

            #logo{
                position: absolute;
                left: 5%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");

            }
            #userDetail{
                position: absolute;
                left: 40%;
                top: 30%;
                width: 50%;
                height: 30px;

            }
            table {
                border-collapse: collapse;
                width: 100%;
                height: auto;
            }

            th, td {
                text-align: left;
                padding: 8px;
            }
            th{
                background-color: #00cccc;
                color: #ffffff;
                font-family: serif;
                font-size: 20px;
                font-weight: 300;

            }

            tr:nth-child(even){background-color: #f2f2f2}


        </style>
    </head>
    <body>
        <form action="userRemove">

            <div style="position: absolute; left: 0px; top: 0px; width: 100%; height: max-content; background-color: #000000;">

                <div id="logo"></div>
                <%
                    userController controller = new userController();
                    ResultSet rset = rset = controller.getAllUsers();
                %>

                <table id="userDetail">
                    <th>User Name</th>
                    <th>Email</th>                    
                    <th>Delete</th>
                        <%  while (rset.next()) {%>
                    <tr class="table-responsive">
                        <td><%= rset.getString(2)%></td>
                        <td><%= rset.getString(6)%></td> 
                    <input type="hidden" name="hiddenId" value="<%=rset.getInt(1)%>" />
                    <td> <input type="submit" name="btn-1" value="DELETE" class="btn btn-danger"/>  </td>

                    </tr>

                    <%  }%>
                </table>
            </div>
        </form>
    </body>
</html>
