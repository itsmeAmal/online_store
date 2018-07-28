package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.controller.userController;

public final class userAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Create Account | iFix</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.hash = \"no-back-button\";\r\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\r\n");
      out.write("            window.onhashchange = function () {\r\n");
      out.write("                window.location.hash = \"no-back-button\";\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            #uname{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 27%;\r\n");
      out.write("            }\r\n");
      out.write("            #address{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 35%;\r\n");
      out.write("            }\r\n");
      out.write("            #contact{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 43%;\r\n");
      out.write("            }\r\n");
      out.write("            #email{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                top: 51%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("            }                 \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            #pw{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 59%;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #agreement{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                top: 67%;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #btn_2{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 250px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 88%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #backtohomelink{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 7%;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 30%;\r\n");
      out.write("            }\r\n");
      out.write("            #logo{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                width: 322px;\r\n");
      out.write("                height: 67px;\r\n");
      out.write("                top: 10%;\r\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body style=\"background-color: #000000;\">\r\n");
      out.write("        <form action=\"userAdd\" method=\"post\">\r\n");
      out.write("            <div style=\"position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #ffffff;\" />\r\n");
      out.write("            <div id=\"logo\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"uname\">\r\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Name\" class=\"form-control\" required />\r\n");
      out.write("            </div> \r\n");
      out.write("            <div id=\"address\">\r\n");
      out.write("                <input type=\"text\" name=\"address\" placeholder=\"Address\" class=\"form-control\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"contact\">\r\n");
      out.write("                <input type=\"text\" name=\"contact\" placeholder=\"Contact\" class=\"form-control\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"email\">\r\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Email\" class=\"form-control\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"pw\">\r\n");
      out.write("                <input type=\"text\" name=\"password\" placeholder=\"Password\" class=\"form-control\" required />\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"agreement\">\r\n");
      out.write("                <p style=\"color: #000000;\">\r\n");
      out.write("                    By Registering, you agree that you've read and accepted our user agreement,\r\n");
      out.write("                    you're at least 18 years old, and consent to our privacy notice and receiving\r\n");
      out.write("                    marketing communications from us.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"btn_2\">\r\n");
      out.write("                <input type=\"Submit\" value=\"Submit\" class=\"form-control\" style=\"color: #ffffff; background-color: #0099ff; alignment-adjust: middle; \"  />\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
