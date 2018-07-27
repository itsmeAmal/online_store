<%-- 
    Document   : admin_users
    Created on : May 1, 2017, 9:54:34 AM
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
        <title>products</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
    </head>
    <body>
        <div style="position: absolute; left: 0px; width: 100%; height: 100%; top: 0px;">
            <div style="position: absolute; left: 20%; top: 1%; width: 350px; height: 150px; background-image: url('com.official.cazzendra.images.logos/userslogo.png');"></div>

            <hr/>
            <%
               

            %>

            <div  class="table container" style="position: absolute; left: 10%; top: 25%; width: 80%; height: 100%; ">
                <table class="table table-responsive">
                    <tr>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">User ID</th>
                       
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">User Name</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">First Name</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">Last Name</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; ">Password</th>
                      
                    </tr>
                    <%
                    Session ses = conn.connector.getSessionFactory().openSession();
                    Criteria cr = ses.createCriteria(pojos.UserAccount.class);
                    List<pojos.UserAccount> lp = cr.list();
                    
                    if(lp.size() >0){
                        for(pojos.UserAccount bb : lp){
                            
                            
                            %>
                            <tr class="table-condensed">
                                <td><%= bb.getId() %></td>
                                <td><%= bb.getEmail() %></td>
                                <td><%= bb.getFname()%></td>
                                <td><%= bb.getLname() %></td>
                                <td><%= bb.getPassword() %></td>
                                
                                
                                
                                
                            </tr>
                            
                            
                            
                            
                            <%
                            
                            
                        
                        
                        
                        
                        }
                    
                    }
                    
                    
                    
                    
                   
                    
                    
                    %>
                    
                    
                    
                    
                </table>
            </div>


        </div>
    </body>
</html>

