package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.controller.imageUploadController;
import ifix.model.ImageUpload;
import ifix.core.Validations;

public final class productDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Details</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial;\n");
      out.write("            }\n");
      out.write("            .top-container{\n");
      out.write("                /*background-color: #999999;*/\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .header{\n");
      out.write("                padding: 10px 16px;\n");
      out.write("                background: #cccccc;\n");
      out.write("                color: #000000; \n");
      out.write("                height: 70px;\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("            .sticky{\n");
      out.write("                position: fixed;\n");
      out.write("                top: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .sticky + .content{\n");
      out.write("                padding-top: 102px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer{\n");
      out.write("                position: fixed;\n");
      out.write("                left: 0px;\n");
      out.write("                bottom: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                background-image: url(web.pos.ee.images/footer.PNG);\n");
      out.write("                height: 50px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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
      out.write("        <div class=\"header\" id=\"myHeader\">\n");
      out.write("            <div style=\"position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\">CATEGORIES</div>\n");
      out.write("            <div style=\"position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\" >HOME</div>\n");
      out.write("            <div style=\"position: relative; left: 54%; top: -120%; width: 20%; height: 40px;\" >\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"search\" placeholder=\"SEARCH\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            ");

                HttpSession ses = request.getSession();
                String ss = (String) ses.getAttribute("laptopId");
                ImageUpload imageUpload = imageUploadController.getLaptopById(ss);
            
      out.write("\n");
      out.write("            <div style=\"position: absolute; left: 25%; top: 30%; width: 500px; height: 500px; background-color: #cccccc;\">              \n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: absolute; left: 25%; top: 30%; width: 78px; height: 69px; background-image: url(web.pos.ee.images/13_off.PNG)\">\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: absolute; left: 55%; top: 30%; width: 20%; height: 100px;\"><h3>");
      out.print( imageUpload.getItemDescription());
      out.write(' ');
      out.print( imageUpload.getModel());
      out.write(' ');
      out.print( imageUpload.getProcesser());
      out.write("</h3></div>\n");
      out.write("            <div style=\"position: absolute; left: 55%; top: 37%; width: 20%; height: 100px;\">\n");
      out.write("                <h4 style=\"color: #009900;\">");
      out.print( imageUpload.getMemory());
      out.write(" / ");
      out.print( imageUpload.getStorage());
      out.write(" / ");
      out.print( imageUpload.getOs());
      out.write(" / ");
      out.print( imageUpload.getMemory());
      out.write(" / ");
      out.print( imageUpload.getGraphics());
      out.write(" / ");
      out.print( imageUpload.getDisplay());
      out.write("</h4>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"position: absolute; left: 55%; top: 42%; width: 300px; height: 100px;\"><h4 style=\"color: #ff0000; font-weight: 600;\">Rs ");
      out.print( imageUpload.getPrice());
      out.write("</h4></div>\n");
      out.write("            <div style=\"position: absolute; left: 55%; top: 52%; width: 150px; height: 50px; background-image: url(web.pos.ee.images/add_to_cart.PNG)\"></div>\n");
      out.write("            <div style=\"position: absolute; left: 63%; top: 52%; width: 145px; height: 48px; background-image: url(web.pos.ee.images/buy_now.PNG)\"></div>\n");
      out.write("            <div style=\"position: absolute; left: 55%; top: 57%; width: 400px; height: 150px; background-image: url(web.pos.ee.images/delivery_info.PNG)\" ></div>        \n");
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
      out.write("        </script>\n");
      out.write("        <div class=\"footer\"></div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
