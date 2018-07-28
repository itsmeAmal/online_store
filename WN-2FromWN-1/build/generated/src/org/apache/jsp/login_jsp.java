package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function () {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            #background_color{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0px;\n");
      out.write("                top: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 700px;\n");
      out.write("            }\n");
      out.write("            #uname{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 30%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #pw{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                top: 37%;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #btn{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 43%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"login\" method=\"post\">\n");
      out.write("            <div id=\"background_color\" style=\"position: absolute; left: 0px; top: 0px; width: 100%; height: 100%; background-image: url('images/1.png');\">\n");
      out.write("                <div id=\"uname\"> <input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"user name\" /> </div>\n");
      out.write("                <div id=\"pw\"> <input type=\"text\" name=\"pw\" class=\"form-control\" placeholder=\"password\"/>  </div>\n");
      out.write("                <div id=\"btn\"> <input type=\"submit\" name=\"btn-1\" value=\"Login\" class=\"btn btn-info\" style=\"width: 200px;\"/> </div>\n");
      out.write("                <div style=\"position: absolute; left: 35%; width: 200px; height: 30px; top: 50%; alignment-adjust: central;\"> <a href=\"userAdd.jsp\">or Create account</a></div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
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
