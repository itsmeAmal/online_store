package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu_user_logged_in.jsp");
    _jspx_dependants.add("/menu_user_not_logged.jsp");
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>iFix Computers</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.hash = \"no-back-button\";\r\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\r\n");
      out.write("            window.onhashchange = function() {\r\n");
      out.write("                window.location.hash = \"no-back-button\";\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            #header_my_thin_line{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 5px;\r\n");
      out.write("                top: 2px;\r\n");
      out.write("                background-color: #999999;\r\n");
      out.write("            }\r\n");
      out.write("            #hotline_contact_price_list{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                top: 15px;\r\n");
      out.write("                width:100%;\r\n");
      out.write("                height: 20px;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #buy_online_or_call{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 10%;\r\n");
      out.write("                top: 5px;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 10px;\r\n");
      out.write("                font-family: sans-serif;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            #background_design{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 200%;\r\n");
      out.write("            }\r\n");
      out.write("            #main_big_image{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 13%;\r\n");
      out.write("                right: 12%;\r\n");
      out.write("                width: 1000px;\r\n");
      out.write("                height: 398px;\r\n");
      out.write("                top: 200px;\r\n");
      out.write("                background-image: url(\"imgs/asus1.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #logo{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 60%;\r\n");
      out.write("                width: 320px;\r\n");
      out.write("                height: 67px;\r\n");
      out.write("                top: 5%;\r\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #cart_logo{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 180px;\r\n");
      out.write("                width: 70px;\r\n");
      out.write("                height: 70px;\r\n");
      out.write("                top: 50px;\r\n");
      out.write("            }\r\n");
      out.write("            #menu_space{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 200px;\r\n");
      out.write("                background-color: #000000;\r\n");
      out.write("                top: 0px;\r\n");
      out.write("            }\r\n");
      out.write("            #box_1{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 15%;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                font-family: monospace;\r\n");
      out.write("                color: #cccccc;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("                top: 630px;\r\n");
      out.write("            }\r\n");
      out.write("            #box_2{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 15%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/1.png\");\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #box_3{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 25%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/2.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_4{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 35%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/3.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_5{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 45%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/4.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_6{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 55%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/5.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_7{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 65%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/6.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_8{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 75%;\r\n");
      out.write("                height: 80px;\r\n");
      out.write("                width: 126px;\r\n");
      out.write("                top: 680px;\r\n");
      out.write("                background-image: url(\"our_brands/7.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #box_break_btm{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 15%;\r\n");
      out.write("                width: 1000px;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                top: 780px;\r\n");
      out.write("                font-family: monospace;\r\n");
      out.write("                color: #cccccc;\r\n");
      out.write("                font-size: 30px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #bot_info_1{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 15%;\r\n");
      out.write("                width: 325px;\r\n");
      out.write("                height: 155px;\r\n");
      out.write("                top: 830px;\r\n");
      out.write("                background-image: url(\"bot_img/3.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #bot_info_2{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 39%;\r\n");
      out.write("                width: 325px;\r\n");
      out.write("                height: 155px;\r\n");
      out.write("                top: 830px;\r\n");
      out.write("                background-image: url(\"bot_img/2.png\");\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #bot_info_3{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 63%;\r\n");
      out.write("                width: 325px;\r\n");
      out.write("                height: 155px;\r\n");
      out.write("                top: 830px;\r\n");
      out.write("                background-image: url(\"bot_img/1.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #login_link{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 250px;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 80px;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            #user_logged{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 250px;\r\n");
      out.write("                top: 65px;\r\n");
      out.write("                width: 300px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                /*                background-color: #33ffff;*/\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

            HttpSession ht = request.getSession();
            if (ht.getAttribute("type") != null) {

                String type = (String) ht.getAttribute("type");

                String uname = (String) ht.getAttribute("uname");


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            //alert(\"inside if......\");\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        ");
            if (type.equals("admin")) {
    
            
            response.sendRedirect("admin_panel.jsp");
            
            
    } else {
    
      out.write("\r\n");
      out.write("    <div style=\"position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;\">\r\n");
      out.write("        ");
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.hash = \"no-back-button\";\r\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\r\n");
      out.write("            window.onhashchange = function() {\r\n");
      out.write("                window.location.hash = \"no-back-button\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"example\">\r\n");
      out.write("            <ul id=\"nav\">\r\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">Register</a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"userAdd.jsp\">User</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("<!--                <li><a href=\"#\">Brands</a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"acer.jsp\">Acer</a></li>\r\n");
      out.write("                            <li><a href=\"dell.jsp\">Dell</a></li>\r\n");
      out.write("                            <li><a href=\"Apple.jsp\">Apple</a></li>                           \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>-->\r\n");
      out.write("                \r\n");
      out.write("                <li><a href=\"our_services.jsp\">Our Services</a>\r\n");
      out.write("<!--                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Printers</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Scanners</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Routers</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"logout\">Logout</a></li>\r\n");
      out.write("                <li><a href=\"view.jsp\">All Products</a></li>\r\n");
      out.write("                <li class=\"pad\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    ");

        }


    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
    } else {

    
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <div style=\"position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;\">\r\n");
      out.write("        ");
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
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.hash = \"no-back-button\";\r\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\r\n");
      out.write("            window.onhashchange = function() {\r\n");
      out.write("                window.location.hash = \"no-back-button\";\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/style.css\" type=\"text/css\" media=\"all\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"example\">\r\n");
      out.write("            <ul id=\"nav\">\r\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"#\">Account</a>\r\n");
      out.write("                    <div>\r\n");
      out.write("\r\n");
      out.write("                        <ul>\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"userAdd.jsp\">Create Account</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("<!--                <li><a href=\"#\">Brands</a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"acer.jsp\">Acer</a></li>\r\n");
      out.write("                            <li><a href=\"dell.jsp\">Dell</a></li>\r\n");
      out.write("                            <li><a href=\"Apple.jsp\">Apple</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>-->\r\n");
      out.write("                 <li><a href=\"#\">Login</a>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                            \r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"our_services.jsp\">Our Services</a>\r\n");
      out.write("<!--                    <div>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Printers</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Scanners</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Routers</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>-->\r\n");
      out.write("                </li>\r\n");
      out.write("<!--                <li><a href=\"login.jsp\">Login</a></li>-->\r\n");
      out.write("                <li><a href=\"view.jsp\">All Products</a></li>\r\n");
      out.write("                <li class=\"pad\"></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
           }

    
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>   \r\n");
      out.write("    \r\n");
      out.write("  <!--hidden input tag--> \r\n");
      out.write("  <input type=\"hidden\" name=\"hdd1\" value=\"index\"/>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"background_design\"> \r\n");
      out.write("\r\n");
      out.write("        <div id=\"menu_space\">  </div>\r\n");
      out.write("        <div id=\"cart_logo\"> <a href=\"Cart_bill.jsp\" style=\"position: absolute; background-image: url('images/cart.png'); width: 70px; height: 70px;\"></a></div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"user_logged\"> \r\n");
      out.write("            ");
            HttpSession htt = request.getSession();
                String uname2 = (String) htt.getAttribute("uname");

                if (htt.getAttribute("uname") != null) {
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <p style=\"color: #ffffff; font-family: monospace; font-size: 18px;\"> you logged as :  ");
      out.print( uname2);
      out.write(" </p>\r\n");
      out.write("\r\n");
      out.write("            ");


                }
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"header_my_thin_line\"></div>\r\n");
      out.write("        <div id=\"hotline_contact_price_list\">\r\n");
      out.write("            <div id=\"buy_online_or_call\">\r\n");
      out.write("                Buy Online or Call +9425 56 27 600\r\n");
      out.write("            </div>              \r\n");
      out.write("        </v>\r\n");
      out.write("        <div id=\"main_big_image\">               \r\n");
      out.write("        </div> \r\n");
      out.write("        <div id=\"box_1\">OUR BRANDS</div>\r\n");
      out.write("        <div id=\"box_2\"> </div>\r\n");
      out.write("        <div id=\"box_3\"></div>\r\n");
      out.write("        <div  id=\"box_4\"></div>\r\n");
      out.write("        <div id=\"box_5\"></div>\r\n");
      out.write("        <div id=\"box_6\"></div>\r\n");
      out.write("        <div id=\"box_7\"> </div>\r\n");
      out.write("        <div id=\"box_8\"> </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"box_break_btm\">OTHER SERVICES </div>\r\n");
      out.write("        <div id=\"bot_info_1\"></div>\r\n");
      out.write("        <div id=\"bot_info_2\"></div>\r\n");
      out.write("        <div id=\"bot_info_3\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"logo\">  </div>\r\n");
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
