package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.model.User;
import java.util.List;
import java.sql.ResultSet;
import ifix.controller.userController;

public final class usersAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>All Users | iFix</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            #logo{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 5%;\r\n");
      out.write("                width: 322px;\r\n");
      out.write("                height: 67px;\r\n");
      out.write("                top: 10%;\r\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #userDetail{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 40%;\r\n");
      out.write("                top: 30%;\r\n");
      out.write("                width: 50%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            table {\r\n");
      out.write("                border-collapse: collapse;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: auto;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            th, td {\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 8px;\r\n");
      out.write("            }\r\n");
      out.write("            th{\r\n");
      out.write("                background-color: #00cccc;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            tr:nth-child(even){background-color: #f2f2f2}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"userRemove\">\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 0px; top: 0px; width: 100%; height: max-content; background-color: #000000;\">\r\n");
      out.write("\r\n");
      out.write("                <div id=\"logo\"></div>\r\n");
      out.write("                ");

                    userController controller = new userController();
                    ResultSet rset = rset = controller.getAllUsers();
                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <table id=\"userDetail\">\r\n");
      out.write("                    <th>User Name</th>\r\n");
      out.write("                    <th>Email</th>                    \r\n");
      out.write("                    <th>Delete</th>\r\n");
      out.write("                        ");
  while (rset.next()) {
      out.write("\r\n");
      out.write("                    <tr class=\"table-responsive\">\r\n");
      out.write("                        <td>");
      out.print( rset.getString(2));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( rset.getString(6));
      out.write("</td> \r\n");
      out.write("                    <input type=\"hidden\" name=\"hiddenId\" value=\"");
      out.print(rset.getInt(1));
      out.write("\" />\r\n");
      out.write("                    <td> <input type=\"submit\" name=\"btn-1\" value=\"DELETE\" class=\"btn btn-danger\"/>  </td>\r\n");
      out.write("\r\n");
      out.write("                    </tr>\r\n");
      out.write("\r\n");
      out.write("                    ");
  }
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
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
