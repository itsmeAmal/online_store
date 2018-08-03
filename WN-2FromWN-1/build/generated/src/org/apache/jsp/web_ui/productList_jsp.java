package org.apache.jsp.web_ui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.controller.imageUploadController;
import java.sql.ResultSet;
import ifix.controller.laptopPriceDetailController;
import ifix.dao.Impl.laptopPriceDetailDaoImpl;
import ifix.model.laptopPriceDetail;
import java.util.List;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            background-color: #999999;\n");
      out.write("            padding: 30px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .header{\n");
      out.write("            padding: 10px 16px;\n");
      out.write("            background: #555;\n");
      out.write("            color: #000000;           \n");
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
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Products</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"top-container\">\n");
      out.write("            <h1>Scroll Down</h1>\n");
      out.write("            <p>\n");
      out.write("                Scroll down to see sticky effect\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header\" id=\"myHeader\"><h2>My Header</h2></div>\n");
      out.write("        <div class=\"content\" >\n");
      out.write("               <form action=\"CartReferences\">\n");
      out.write("            <div id=\"logo\"></div>\n");
      out.write("            ");

                ResultSet rset = imageUploadController.getAllProducts();
            
      out.write("\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 20%; top: 30%; width: 60%; height: max-content; background-color: #ffffff;\">\n");
      out.write("                <table class=\"table table-striped\">                  \n");
      out.write("                        ");
  while (rset.next()) {
                                HttpSession hs = request.getSession();
                                hs.setAttribute("laptopId", rset.getString("imageUpload_id"));
                        
      out.write("\n");
      out.write("                    <tr class=\"table-responsive\">  \n");
      out.write("                       \n");
      out.write("                        <td style=\"width: 200px; height: 200px;\"> <image src='uploadedImages/");
      out.print( rset.getString("imageUpload_file_name"));
      out.write("'>\n");
      out.write("                            \n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"position:  relative; font-size: large; font-weight: 800; text-align: center; top: 30%;\"  >");
      out.print( rset.getString("imageupload_item_desc"));
      out.write("                         \n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"font-size: large; font-weight: 800; color: #0000cc;\" >");
      out.print( rset.getString("imageupload_price"));
      out.write("</td>\n");
      out.write("                    <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print(rset.getString("imageUpload_id"));
      out.write("\"/>                    \n");
      out.write("                    <td>  <input class=\"btn btn-success\" type=\"submit\" value=\"Add to Cart\"/> </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
  }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.onscroll = function () {\n");
      out.write("                myFunction()};\n");
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
