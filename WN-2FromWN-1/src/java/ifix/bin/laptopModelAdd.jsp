<%-- 
    Document   : laptopModelAdd
    Created on : Aug 29, 2017, 6:28:30 PM
    Author     : 4m4l
--%>

<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.DataInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Laptop Model | ifix</title>
        <link rel="stylesheet" href="com.official.cazzendra.css.common/bootstrap.min.css">
        <style>
            #logo{
                position: absolute;
                left: 35%;
                width: 322px;
                height: 67px;
                top: 10%;
                background-image: url("com.official.cazzendra.images.logos/3.png");
            }
            #outerDiv{
                position: absolute;
                left: 0px;
                width: 100%;
                height: 100%;
                top: 0px;
                background-color: #000000;
            }
        </style>
    </head>
    <body>
        <form action="laptopModelAdd" method="POST" enctype="multipart/form-data">
            <%
            String saveFile = new String();
            String contentType = request.getContentType();
            if(contentType != null && contentType.indexOf("multipart/form-data") > 0){
                DataInputStream in = new DataInputStream(request.getInputStream());
                int formDataLength = request.getContentLength();
                byte dataByte[] = new byte[formDataLength];
                int byteRead = 0;
                int totalBytesRead = 0;
                
                while (totalBytesRead < formDataLength) {  
                    byteRead = in.read(dataByte, totalBytesRead, formDataLength);
                    totalBytesRead += byteRead;
                        
                    }
                String file = new String(dataByte);
                saveFile = file.substring(file.indexOf("filename=\""+ 10));
                saveFile = saveFile.substring(0, saveFile.indexOf("\n")); 
                saveFile = saveFile.substring(saveFile.lastIndexOf("\\"), saveFile.indexOf("\""));
                
                int lastIndex = contentType.lastIndexOf("=");
                String boundry = contentType.substring(lastIndex + 1 , contentType.length());
                int pos;
                
                pos = file.indexOf("filename=\"");
                
                pos = file.indexOf("\n")+ 1;
                pos = file.indexOf("\n")+ 1;
                pos = file.indexOf("\n")+ 1;
                
                int boundryLocation = file.indexOf(boundry, pos) - 4;
                
                int startPos = ((file.substring(0, pos)).getBytes()).length;
                int endPos = ((file.substring(0, boundryLocation)).getBytes()).length;
                
                saveFile = "C:/fileUploadDir/" + saveFile;
                
                File ff = new File(saveFile);
                try {
                        FileOutputStream fileOutputStream = new FileOutputStream(ff);
                        fileOutputStream.write(dataByte, startPos, (endPos - startPos));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        
                    } catch (Exception e) {
                        out.println(e);
                    }
                
            }
            
            
            %>
            
            
            
            <div id="outerDiv">
                <div style="position: absolute; left: 20%; top: 5%; width: 60%; height: 90%; background-color: #ffffff;">
                    <div id="logo"></div>
                    <div style="position: absolute; left: 10%; top: 25%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="laptopModelLaptopId" placeholder="Laptop ID" required/></div>
                    <div style="position: absolute; left: 10%; top: 33%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="hardDisk" placeholder="Hard Disk Size" required/></div>
                    <div style="position: absolute; left: 10%; top: 41%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="ram" placeholder="RAM" required/></div>
                    <div style="position: absolute; left: 10%; top: 49%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="vga" placeholder="VGA" required/></div>
                    <div style="position: absolute; left: 10%; top: 57%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="processor" placeholder="Processor" required/></div>
                    <div style="position: absolute; left: 10%; top: 65%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="usbType1" placeholder="USB Type 1" required/></div>
                    <div style="position: absolute; left: 10%; top: 73%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="usbType2" placeholder="USB Type 2" required/></div>
                    <div style="position: absolute; left: 10%; top: 81%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="hdmi" placeholder="HDMI Output" required/></div>
                    <div style="position: absolute; left: 50%; top: 25%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="vgaOp" placeholder="VGA Output" required/></div>
                    <div style="position: absolute; left: 50%; top: 33%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="screenSize" placeholder="Screen Size" required/></div>
                    <div style="position: absolute; left: 50%; top: 41%; width: 250px; height: 30px;"> <input type="text" class="form-control" name="cache" placeholder="Cache Memory" required/></div>
                    <div style="position: absolute; left: 50%; top: 49%; width: 250px; height: 30px;"> <input type="file" name="imagePath" multiple="true" class="form-control"></div>
                    <div style="position: absolute; left: 50%; top: 57%; width: 250px; height: 30px;"> <input type="submit" class="btn btn-info" name="btn" value="Save Laptop Model"/></div>
                </div>
            </div>
        </form>
    </body>
</html>
