package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class laptopImageUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add Item</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            #logo{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                width: 322px;\n");
      out.write("                height: 67px;\n");
      out.write("                top: 10%;\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\n");
      out.write("            }\n");
      out.write("            #outerDiv{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                top: 0px;\n");
      out.write("                background-color: #000000;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form  action=\"fileUploadServlet\" method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"outerDiv\">\n");
      out.write("                <div style=\"position: absolute; left: 20%; top: 5%; width: 60%; height: 90%; background-color: #ffffff;\">\n");
      out.write("                    <div id=\"logo\"></div>\n");
      out.write("                    <div style=\"position: absolute; left: 40%; top: 33%; width: 250px; height: 30px;\"> <input type=\"text\" class=\"form-control\" name=\"description\" placeholder=\"Description\" required/></div>\n");
      out.write("                    <div style=\"position: absolute; left: 40%; top: 41%; width: 250px; height: 30px;\"> <input type=\"text\" class=\"form-control\" name=\"price\" placeholder=\"Price\" required/></div>\n");
      out.write("                    <input style=\"position: absolute; left: 40%; top: 49%; width: 250px; height: 30px;\" type=\"file\" name=\"file\"/>\n");
      out.write("                    <input style=\"position: absolute; left: 40%; top: 57%; width: 250px; height: 30px;\" type=\"submit\" value=\"submit\"/> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
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
