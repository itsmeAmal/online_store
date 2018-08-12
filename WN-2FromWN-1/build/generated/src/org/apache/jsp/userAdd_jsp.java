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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Create Account | iFix</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function () {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            #uname{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 27%;\n");
      out.write("            }\n");
      out.write("            #address{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 35%;\n");
      out.write("            }\n");
      out.write("            #contact{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 43%;\n");
      out.write("            }\n");
      out.write("            #email{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                top: 51%;\n");
      out.write("                height: 30px;\n");
      out.write("            }                 \n");
      out.write("\n");
      out.write("\n");
      out.write("            #pw{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 59%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #agreement{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 100px;\n");
      out.write("                top: 67%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #btn_2{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 250px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 88%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #backtohomelink{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 7%;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 30%;\n");
      out.write("            }\n");
      out.write("            #logo{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 322px;\n");
      out.write("                height: 67px;\n");
      out.write("                top: 10%;\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #000000;\">\n");
      out.write("        <form action=\"userAdd\" method=\"post\">\n");
      out.write("            <div style=\"position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #ffffff;\" />\n");
      out.write("            <div id=\"logo\"></div>\n");
      out.write("\n");
      out.write("            <div id=\"uname\">\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Name\" class=\"form-control\" required />\n");
      out.write("            </div> \n");
      out.write("            <div id=\"address\">\n");
      out.write("                <input type=\"text\" name=\"address\" placeholder=\"Address\" class=\"form-control\" required />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"contact\">\n");
      out.write("                <input type=\"text\" name=\"contact\" placeholder=\"Contact\" class=\"form-control\" required />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"email\">\n");
      out.write("                <input type=\"text\" name=\"email\" placeholder=\"Email\" class=\"form-control\" required />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pw\">\n");
      out.write("                <input type=\"text\" name=\"password\" placeholder=\"Password\" class=\"form-control\" required />\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"agreement\">\n");
      out.write("                <p style=\"color: #000000;\">\n");
      out.write("                    By Registering, you agree that you've read and accepted our user agreement,\n");
      out.write("                    you're at least 18 years old, and consent to our privacy notice and receiving\n");
      out.write("                    marketing communications from us.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"btn_2\">\n");
      out.write("                <input type=\"Submit\" value=\"Submit\" class=\"form-control\" style=\"color: #ffffff; background-color: #0099ff; alignment-adjust: middle; \"  />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</body>\n");
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
