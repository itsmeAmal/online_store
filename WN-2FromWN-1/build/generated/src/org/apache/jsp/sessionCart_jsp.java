package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.sessionCart.CartItem;
import java.util.List;
import ifix.sessionCart.cart;

public final class sessionCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>~~~ Shopping Cart ~~~</h1>\n");
      out.write("        <form action=\"addProduct\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Product ID</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pid\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Product Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pname\"/></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>Unit Price</td>\n");
      out.write("                    <td><input type=\"text\" name=\"up\"/></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Quantity</td>\n");
      out.write("                    <td><input type=\"text\" name=\"qty\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Add to Cart\"/>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>    \n");
      out.write("        </form>\n");
      out.write("        ");

            HttpSession hs = request.getSession();
            //out.print(hs.getAttribute("myCart") == null);
            if (hs.getAttribute("myCart") != null) {

        
      out.write("\n");
      out.write("        ~~~ View Shopping Cart ~~~\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"600\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Product ID</td>\n");
      out.write("                <td>Product Name</td>\n");
      out.write("                <td>Quantity</td>\n");
      out.write("                <td>Unit Price</td>\n");
      out.write("                <td>Total</td>\n");
      out.write("                <td>Remove</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  cart c = (cart) hs.getAttribute("myCart");
                //cast kara cart item ekakata, mkada methana attribute eka object ekak widiyata ena nisa, cart kiyanne cart type kenek nisa
                List<CartItem> citems = c.getOld_citems();
                // me list variable eke thamai values tika thiyanne
                double tot = 0;

                for (CartItem ci : citems) {
                    //ci.getPid();
                    //ci.getPname();
                    //ci.getQty();
                    //ci.getUprice();
                    //ci.getQty() * ci.getUprice();
                    tot += ci.getQty() * ci.getUprice();


            
      out.write("\n");
      out.write("            ");

            
      out.write("\n");
      out.write("\n");
      out.write("            <form action=\"removeProduct\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(ci.getPid());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ci.getPname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ci.getQty());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ci.getUprice());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(ci.getQty() * ci.getUprice());
      out.write("</td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Remove\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <input type=\"hidden\"  name=\"pid\" value=\"");
      out.print(ci.getPid());
      out.write("\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        Your total balance is : ");
      out.print(tot);
      out.write("\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <h1>\n");
      out.write("        </h1>\n");
      out.write("    </center>\n");
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
