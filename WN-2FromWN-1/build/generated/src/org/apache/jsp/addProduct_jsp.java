package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.controller.imageUploadController;
import java.sql.ResultSet;
import ifix.controller.laptopPriceDetailController;
import ifix.dao.Impl.laptopPriceDetailDaoImpl;
import ifix.model.laptopPriceDetail;
import java.util.List;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            font-family: Arial;\n");
      out.write("        }\n");
      out.write("        .top-container{\n");
      out.write("            /*background-color: #999999;*/\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .header{\n");
      out.write("            padding: 10px 16px;\n");
      out.write("            background: #cccccc;\n");
      out.write("            color: #000000; \n");
      out.write("            height: 70px;\n");
      out.write("        }\n");
      out.write("        .content{\n");
      out.write("            padding: 16px;\n");
      out.write("        }\n");
      out.write("        .sticky{\n");
      out.write("            position: fixed;\n");
      out.write("            top: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("        .sticky + .content{\n");
      out.write("            padding-top: 102px;\n");
      out.write("        }\n");
      out.write("        .sidenav{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 20%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 12%; \n");
      out.write("            height: 50%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav-2{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 33%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 12%; \n");
      out.write("            height: 50%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav-3{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 46%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 12%; \n");
      out.write("            height: 50%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav-4{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 59%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 12%; \n");
      out.write("            height: 50%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav-5{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 72%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 12%; \n");
      out.write("            height: 50%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;\n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .sidenav a{\n");
      out.write("            padding: 6px 8px 6px 16px;\n");
      out.write("            display: block; \n");
      out.write("        }\n");
      out.write("        .sidenav a:hover{\n");
      out.write("            color: #009999;\n");
      out.write("        }\n");
      out.write("        @media screen and (max-height:450px){\n");
      out.write("            .sidenav{padding-top: 100px;}\n");
      out.write("            .sidenav a{font-size: 18px;}\n");
      out.write("        }\n");
      out.write("        .footer{\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0px;\n");
      out.write("            bottom: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("            background-image: url(web.pos.ee.images/footer.PNG);\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Management</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"position: relative; left: 0px; width: 100%; height: 30px; top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333;\">               \n");
      out.write("            Working Hours : Monday - Friday : 8.30 am - 5.30 pm / Saturday : 8.30 am - 1.30 pm\n");
      out.write("        </div>\n");
      out.write("        <div class=\"top-container\">          \n");
      out.write("            <h1>iFix Laptops.com</h1>\n");
      out.write("            <p>\n");
      out.write("                Something Different\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\" >\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\" id=\"myHeader\">\n");
      out.write("            <div style=\"position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\">CATEGORIES</div>\n");
      out.write("            <div style=\"position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\" >HOME</div>\n");
      out.write("            <div style=\"position: relative; left: 54%; top: -120%; width: 20%; height: 40px;\" >\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"search\" placeholder=\"SEARCH\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--add detail -->\n");
      out.write("        <div class=\"sidenav\" >\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">DETAIL</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 10px; height: 20px; color: #999999; \">BRAND</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 5%; height: 50px;\">\n");
      out.write("                <select class=\"form-control\" style=\"width: 210px;;\">\n");
      out.write("                    <option>APPLE</option>\n");
      out.write("                    <option>DELL</option>\n");
      out.write("                    <option>LENOVO</option>\n");
      out.write("                    <option>HP</option>\n");
      out.write("                    <option>SAMSUNG</option>\n");
      out.write("                    <option>ACER</option>\n");
      out.write("                    <option>SINGER</option>\n");
      out.write("                    <option>PANASONIC</option>\n");
      out.write("                    <option>COMPAQ</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 10%; height: 20px; color: #999999; \">MODEL</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 12%; height: 20px; color: #999999; \">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"MODEL\" style=\" width: 210px;\"/><br>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 22%; height: 20px; color: #999999; \">PRICE</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 24%; height: 20px; color: #999999; \">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"PRICE\" style=\" width: 210px;\"/><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-2\">\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">RAM</div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 5%; width: 30%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"ram\" value=\"2 GB\" checked=\"checked\" >2 GB <br>\n");
      out.write("                <input type=\"radio\" name=\"ram\" value=\"4 GB\" >4 GB <br>\n");
      out.write("                <input type=\"radio\" name=\"ram\" value=\"6 GB\" >6 GB <br>\n");
      out.write("                <input type=\"radio\" name=\"ram\" value=\"8 GB\" >8 GB <br>\n");
      out.write("                <input type=\"radio\" name=\"ram\" value=\"16 GB\" >16 GB <br>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; top: 30%; width: 100%; border-bottom:  groove;height: 50px; border-width: \n");
      out.write("                 thin; border-top: groove; border-top-width: thin; text-align: center; padding-top: 7px; color: #999999; font-weight: 700; font-family: Arial; \">\n");
      out.write("                INTERNAL STORAGE\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 35%; width: 50%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"500 GB\" checked=\"checked\" >500 GB <br>\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"1 TB\" >1 TB <br>\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"2 TB\" >2 TB <br>\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"128 GB SSD\" >128 GB SSD <br>\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"256 GB SSD\" >256 GB SSD <br>\n");
      out.write("                <input type=\"radio\" name=\"storage\" value=\"512 GB SSD\" >512 GB SSD <br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-3\">\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">PROCESSOR</div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 5%; width: 50%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"CELERON\" checked=\"checked\" >CELERON <br>\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"PENTIUM\" >PENTIUM <br>\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"DUAL CORE\" >DUAL CORE <br>\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"CORE i3\" >CORE i3<br>\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"CORE i5\" >CORE i5<br>\n");
      out.write("                <input type=\"radio\" name=\"processor\" value=\"CORE i7\" >CORE i7<br>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; top: 30%; width: 100%; border-bottom:  groove;height: 50px; border-width: \n");
      out.write("                 thin; border-top: groove; border-top-width: thin; text-align: center; padding-top: 7px; color: #999999; font-weight: 700; font-family: Arial; \">\n");
      out.write("                OPERATING SYSTEM\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 35%; width: 50%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"WINDOWS 7\" checked=\"checked\" >WINDOWS 7 <br>\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"WINDOWS 8\" >WINDOWS 8 <br>\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"WINDOWS 8.1\" >WINDOWS 8.1 <br>\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"WINDOWS 10\" >WINDOWS 10 <br>\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"UBUNTU\" >UBUNTU <br>\n");
      out.write("                <input type=\"radio\" name=\"OS\" value=\"NONE\" >NONE <br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-4\">\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">GRAPHICS</div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 5%; width: 70%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"graphics\" value=\"INTEL HD \" checked=\"checked\" >INTEL HD <br>\n");
      out.write("                <input type=\"radio\" name=\"graphics\" value=\"AMD REDEON\" >AMD REDEON <br>\n");
      out.write("                <input type=\"radio\" name=\"graphics\" value=\"NVIDIA GEFORCE\" >NVIDIA GEFORCE <br>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; top: 30%; width: 100%; border-bottom:  groove;height: 50px; border-width: \n");
      out.write("                 thin; border-top: groove; border-top-width: thin; text-align: center; padding-top: 7px; color: #999999; font-weight: 700; font-family: Arial; \">\n");
      out.write("                DISPLAY SIZE\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative;left: 10%; top: 35%; width: 50%; height: 20px; font-family: Arial;\">\n");
      out.write("                <input type=\"radio\" name=\"display\" value=\"11.6'\" checked=\"checked\" >11.6' <br>\n");
      out.write("                <input type=\"radio\" name=\"display\" value=\"13.3'\" >13.3' <br>\n");
      out.write("                <input type=\"radio\" name=\"display\" value=\"15.6'\" >15.6' <br>\n");
      out.write("                <input type=\"radio\" name=\"display\" value=\"17'\" >17' <br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-5\">\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">IMAGE UPLOAD AND SAVE</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 10px; height: 20px; color: #999999; \">IMAGE</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 5%; height: 50px;\">\n");
      out.write("                <input class=\"form-control\" style=\" width: 210px;\" type=\"file\" name=\"file\"/>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 10%; height: 20px; color: #999999; \">SAVE PRODUCT DETAILS</div>\n");
      out.write("            <div style=\"position: relative; left: 5px; width: 80%; top: 12%; height: 20px; color: #999999; \">\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"SAVE PRODUCT\" style=\" width: 210px;\"/><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.onscroll = function () {\n");
      out.write("                myFunction()\n");
      out.write("            };\n");
      out.write("            var header = document.getElementById(\"myHeader\");\n");
      out.write("            var sticky = header.offsetTop;\n");
      out.write("            function myFunction() {\n");
      out.write("                if (window.pageYOffset > sticky) {\n");
      out.write("                    header.classList.add(\"sticky\");\n");
      out.write("                } else {\n");
      out.write("                    header.classList.remove(\"sticky\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <div class=\"footer\"></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}