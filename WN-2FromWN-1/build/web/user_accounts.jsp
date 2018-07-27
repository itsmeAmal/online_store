<%-- 
    Document   : delivery_info
    Created on : Feb 12, 2017, 6:24:26 PM
    Author     : 4m4l
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delivery Info</title>


        <script type="text/javascript">
            window.location.hash = "no-back-button";
            window.location.hash = "Again-No-back-button";//again because google chrome don't insert first hash into history
            window.onhashchange = function () {
                window.location.hash = "no-back-button";
            }
        </script>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">




        <script type="text/javascript">
            //alert("inside if......");

        </script>


    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 0%;">

    </div>

    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 0%;">

    </div>


    <script>
        // alert("inside else...!!!!!!!");


    </script>

    <div style="position: absolute; left: 8%; width: 800px; height: 100px; top: 0%;">

    </div>

</head>
<body>
    <div style="position: absolute; left: 0px; top: 0px; width: 100%; height: 100%;">
        <div  class="table container" style="position: absolute; left: 10%; top: 20%; width: 80%; height: 100%; ">
            <table class="table table-responsive" >
                <tr>

                    <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Phone or Email</th>
                    <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >First Name</th>
                    <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Last name</th>
                    <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >Password</th>
                    <th style="background-color: #99ccff;  width: 200px; height: 30px; color: #000000; font-size: 18px; font-weight: 300; " >State</th>


                </tr>




                <form method="POST" action="delete_user" >
                    <tr class="table-condensed">


                        <td>
                            <input class="btn btn-danger"  type="submit" name="btn-33" value="Remove"/>
                            <input type="hidden" name="btn3" value=""/>
                        </td>

                    </tr>

            </table>
        </div>

    </div>
</body>
</html>
