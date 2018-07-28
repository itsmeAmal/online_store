<%-- 
    Document   : laptopImageUpload
    Created on : Jul 28, 2018, 1:05:46 PM
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Item</title>
    </head>
    <body>
        <form  action="fileUploadServlet" method="POST" enctype="multipart/form-data">
            <input type="file" name="file"/>
            <input type="submit" value="submit"/> 
            
        </form>
    </body>
</html>
