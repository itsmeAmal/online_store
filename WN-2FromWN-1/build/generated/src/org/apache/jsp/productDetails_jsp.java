package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Product Details</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("        <div style=\"position: absolute; left: 0px; width: 100%; height: 50px; top: 20%; background-color: #cccccc;\"></div>\n");
      out.write("        <div style=\"position: absolute; left: 25%; top: 30%; width: 500px; height: 500px; background-color: #cccccc;\">              \n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; left: 25%; top: 30%; width: 78px; height: 69px; background-image: url(web.pos.ee.images/13_off.PNG)\">\n");
      out.write("        </div>\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 30%; width: 20%; height: 100px;\"><h3>LAPTOP MODEL NO AND DETAIL WITH DESCRIPTION </h3></div>\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 37%; width: 20%; height: 100px;\"><h4 style=\"color: #009900;\">DESCRIPTION AS MODEL ID</h4></div>\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 42%; width: 300px; height: 100px;\"><h4 style=\"color: #ff0000; font-weight: 600;\"> RS : 49999.00</h4></div>\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 52%; width: 150px; height: 50px; background-image: url(web.pos.ee.images/add_to_cart.PNG)\"></div>\n");
      out.write("        <div style=\"position: absolute; left: 63%; top: 52%; width: 145px; height: 48px; background-image: url(web.pos.ee.images/buy_now.PNG)\"></div>\n");
      out.write("        <div style=\"position: absolute; left: 55%; top: 57%; width: 400px; height: 150px; background-image: url(web.pos.ee.images/delivery_info.PNG)\" ></div>\n");
      out.write("        <div></div>\n");
      out.write("        <div></div>\n");
      out.write("        <div></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
