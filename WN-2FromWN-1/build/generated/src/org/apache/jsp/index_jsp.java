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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>iFix Computers</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function() {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #header_my_thin_line{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 5px;\n");
      out.write("                top: 2px;\n");
      out.write("                background-color: #999999;\n");
      out.write("            }\n");
      out.write("            #hotline_contact_price_list{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 15px;\n");
      out.write("                width:100%;\n");
      out.write("                height: 20px;\n");
      out.write("                left: 0px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #buy_online_or_call{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 10%;\n");
      out.write("                top: 5px;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 10px;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-weight: 300;\n");
      out.write("                color: #ffffff;\n");
      out.write("            }\n");
      out.write("            #background_design{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 200%;\n");
      out.write("            }\n");
      out.write("            #main_big_image{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 13%;\n");
      out.write("                right: 12%;\n");
      out.write("                width: 1000px;\n");
      out.write("                height: 398px;\n");
      out.write("                top: 200px;\n");
      out.write("                background-image: url(\"imgs/asus1.png\");\n");
      out.write("            }\n");
      out.write("            #logo{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 60%;\n");
      out.write("                width: 320px;\n");
      out.write("                height: 67px;\n");
      out.write("                top: 5%;\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.logos/3.png\");\n");
      out.write("            }\n");
      out.write("            #cart_logo{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 180px;\n");
      out.write("                width: 70px;\n");
      out.write("                height: 70px;\n");
      out.write("                top: 50px;\n");
      out.write("            }\n");
      out.write("            #menu_space{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 200px;\n");
      out.write("                background-color: #000000;\n");
      out.write("                top: 0px;\n");
      out.write("            }\n");
      out.write("            #box_1{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 15%;\n");
      out.write("                height: 100px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                color: #cccccc;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                top: 630px;\n");
      out.write("            }\n");
      out.write("            #box_2{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 15%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/1.png\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #box_3{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 25%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/2.png\");\n");
      out.write("            }\n");
      out.write("            #box_4{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 35%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/3.png\");\n");
      out.write("            }\n");
      out.write("            #box_5{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 45%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/4.png\");\n");
      out.write("            }\n");
      out.write("            #box_6{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 55%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/5.png\");\n");
      out.write("            }\n");
      out.write("            #box_7{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 65%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/6.png\");\n");
      out.write("            }\n");
      out.write("            #box_8{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 75%;\n");
      out.write("                height: 80px;\n");
      out.write("                width: 126px;\n");
      out.write("                top: 680px;\n");
      out.write("                background-image: url(\"our_brands/7.png\");\n");
      out.write("            }\n");
      out.write("            #box_break_btm{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 15%;\n");
      out.write("                width: 1000px;\n");
      out.write("                height: 100px;\n");
      out.write("                top: 780px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                color: #cccccc;\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 300;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #bot_info_1{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 15%;\n");
      out.write("                width: 325px;\n");
      out.write("                height: 155px;\n");
      out.write("                top: 830px;\n");
      out.write("                background-image: url(\"bot_img/3.png\");\n");
      out.write("            }\n");
      out.write("            #bot_info_2{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 39%;\n");
      out.write("                width: 325px;\n");
      out.write("                height: 155px;\n");
      out.write("                top: 830px;\n");
      out.write("                background-image: url(\"bot_img/2.png\");\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #bot_info_3{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 63%;\n");
      out.write("                width: 325px;\n");
      out.write("                height: 155px;\n");
      out.write("                top: 830px;\n");
      out.write("                background-image: url(\"bot_img/1.png\");\n");
      out.write("            }\n");
      out.write("            #login_link{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 250px;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 80px;\n");
      out.write("                background-color: #ffffff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #user_logged{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 250px;\n");
      out.write("                top: 65px;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 30px;\n");
      out.write("                /*                background-color: #33ffff;*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            HttpSession ht = request.getSession();
            if (ht.getAttribute("type") != null) {

                String type = (String) ht.getAttribute("type");

                String uname = (String) ht.getAttribute("uname");


        
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            //alert(\"inside if......\");\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        ");
            if (type.equals("admin")) {
    
            
            response.sendRedirect("admin_panel.jsp");
            
            
    } else {
    
      out.write("\n");
      out.write("    <div style=\"position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;\">\n");
      out.write("        ");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function() {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"example\">\n");
      out.write("            <ul id=\"nav\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"#\">Register</a>\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                            <li><a href=\"user_account_reg.jsp\">User</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Brands</a>\n");
      out.write("                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"acer.jsp\">Acer</a></li>\n");
      out.write("                            <li><a href=\"dell.jsp\">Dell</a></li>\n");
      out.write("                            <li><a href=\"Apple.jsp\">Apple</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li><a href=\"our_services.jsp\">Our Services</a>\n");
      out.write("<!--                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Printers</a></li>\n");
      out.write("                            <li><a href=\"#\">Scanners</a></li>\n");
      out.write("                            <li><a href=\"#\">Routers</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>-->\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"logout\">Logout</a></li>\n");
      out.write("                <li><a href=\"view.jsp\">All Products</a></li>\n");
      out.write("                <li class=\"pad\"></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

        }


    
      out.write("\n");
      out.write("\n");
      out.write("    ");
    } else {

    
      out.write("\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <div style=\"position: absolute; left: 8%; width: 800px; height: 100px; top: 10%;\">\n");
      out.write("        ");
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
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function() {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"example\">\n");
      out.write("            <ul id=\"nav\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"#\">Register</a>\n");
      out.write("                    <div>\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                            <li><a href=\"user_account_reg.jsp\">User</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\">Brands</a>\n");
      out.write("                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"acer.jsp\">Acer</a></li>\n");
      out.write("                            <li><a href=\"dell.jsp\">Dell</a></li>\n");
      out.write("                            <li><a href=\"Apple.jsp\">Apple</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                 <li><a href=\"#\">Login</a>\n");
      out.write("                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"our_services.jsp\">Our Services</a>\n");
      out.write("<!--                    <div>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Printers</a></li>\n");
      out.write("                            <li><a href=\"#\">Scanners</a></li>\n");
      out.write("                            <li><a href=\"#\">Routers</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>-->\n");
      out.write("                </li>\n");
      out.write("<!--                <li><a href=\"login.jsp\">Login</a></li>-->\n");
      out.write("                <li><a href=\"view.jsp\">All Products</a></li>\n");
      out.write("                <li class=\"pad\"></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
           }

    
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>   \n");
      out.write("    \n");
      out.write("  <!--hidden input tag--> \n");
      out.write("  <input type=\"hidden\" name=\"hdd1\" value=\"index\"/>\n");
      out.write("\n");
      out.write("    <div id=\"background_design\"> \n");
      out.write("\n");
      out.write("        <div id=\"menu_space\">  </div>\n");
      out.write("        <div id=\"cart_logo\"> <a href=\"Cart_bill.jsp\" style=\"position: absolute; background-image: url('images/cart.png'); width: 70px; height: 70px;\"></a></div>\n");
      out.write("\n");
      out.write("        <div id=\"user_logged\"> \n");
      out.write("            ");
            HttpSession htt = request.getSession();
                String uname2 = (String) htt.getAttribute("uname");

                if (htt.getAttribute("uname") != null) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <p style=\"color: #ffffff; font-family: monospace; font-size: 18px;\"> you logged as :  ");
      out.print( uname2);
      out.write(" </p>\n");
      out.write("\n");
      out.write("            ");


                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"header_my_thin_line\"></div>\n");
      out.write("        <div id=\"hotline_contact_price_list\">\n");
      out.write("            <div id=\"buy_online_or_call\">\n");
      out.write("                Buy Online or Call +9425 56 27 600\n");
      out.write("            </div>              \n");
      out.write("        </v>\n");
      out.write("        <div id=\"main_big_image\">               \n");
      out.write("        </div> \n");
      out.write("        <div id=\"box_1\">OUR BRANDS</div>\n");
      out.write("        <div id=\"box_2\"> </div>\n");
      out.write("        <div id=\"box_3\"></div>\n");
      out.write("        <div  id=\"box_4\"></div>\n");
      out.write("        <div id=\"box_5\"></div>\n");
      out.write("        <div id=\"box_6\"></div>\n");
      out.write("        <div id=\"box_7\"> </div>\n");
      out.write("        <div id=\"box_8\"> </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"box_break_btm\">OTHER SERVICES </div>\n");
      out.write("        <div id=\"bot_info_1\"></div>\n");
      out.write("        <div id=\"bot_info_2\"></div>\n");
      out.write("        <div id=\"bot_info_3\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"logo\">  </div>\n");
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
