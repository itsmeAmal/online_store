<%-- 
    Document   : delivery_info
    Created on : Feb 12, 2017, 6:24:26 PM
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
        <title>Delivery Info</title>


        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function() {
                window.location.hash = "no-back-button";
            }
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        

    </head>
    <body>
        <div style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%;">
            <div style="position: absolute; left: 10%; top: 5px; width: 200px; height: 50px; ">
                <a href="admin_panel.jsp" style="font-family: serif; font-size: 24px;"><<  Control Panel</a> 
            </div>
            
            <div  class="table container" style="position: absolute; left: 10%; top: 10%; width: 80%; height: 100%; ">
                <table class="table table-responsive" >
                    <tr>

                        
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Name</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Address L1</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Address L2</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >City</th>
              
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Amount</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Status</th>
                        <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >---</th>

                    </tr>




                    <form method="POST" action="update_dlvr" >
                        <tr class="table-condensed">
                            
                          
                            <td>
                                <input class="btn btn-danger"  type="submit" name="btn-33" value="Deliver"/>
                                <input type="hidden" name="btn3" value=""/>
                           </td>
                           
                           
                           
                            
                        </tr>
                    </form>
                  

                </table>
            </div>
         
        </div>
    </body>
</html>
