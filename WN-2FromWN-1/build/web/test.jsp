<%-- 
    Document   : test
    Created on : Aug 18, 2018, 3:56:28 PM
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
    <script>
        var xmlHttp = new XMLHttpRequest();

            function getData() {

                var send = {
                    uname : "aad",
                    upass : "123"
                };
                xmlHttp.onreadystatechange = function () {
                    if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                           var data = xmlHttp.responseText;
                           console.log(data);
                    }
                };
                xmlHttp.open("POST","A",true);
                xmlHttp.setRequestHeader("Content-type","application/x-www-form-urlencoded");
                xmlHttp.send(send);
            }
            
            getData();
    </script>
</html>
