package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.model.ImageUpload;
import ifix.controller.CartReferenceController;
import ifix.controller.userController;
import ifix.model.User;
import ifix.controller.imageUploadController;
import java.sql.ResultSet;
import ifix.controller.laptopPriceDetailController;
import ifix.dao.Impl.laptopPriceDetailDaoImpl;
import ifix.model.laptopPriceDetail;
import java.util.List;

public final class userProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            /*background-color: #999999;*/\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .header{\n");
      out.write("            padding: 10px 16px;\n");
      out.write("            background: #cccccc;\n");
      out.write("            color: #000000; \n");
      out.write("            height: 70px;\n");
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
      out.write("        .sidenav{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 20%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 16%; \n");
      out.write("            height: 60%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;   \n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav-6{\n");
      out.write("            position: fixed; \n");
      out.write("            left: 40%; \n");
      out.write("            top: 30%; \n");
      out.write("            width: 40%; \n");
      out.write("            height: 60%; \n");
      out.write("            border: groove;\n");
      out.write("            padding: 8px 0;   \n");
      out.write("            z-index: 1;\n");
      out.write("            overflow-x: hidden;\n");
      out.write("            border-width: thin;\n");
      out.write("        }\n");
      out.write("        .sidenav a{\n");
      out.write("            padding: 6px 8px 6px 16px;\n");
      out.write("            display: block; \n");
      out.write("        }\n");
      out.write("        .sidenav a:hover{\n");
      out.write("            color: #009999;\n");
      out.write("        }\n");
      out.write("        @media screen and (max-height:450px){\n");
      out.write("            .sidenav{padding-top: 100px;}\n");
      out.write("            .sidenav a{font-size: 18px;}\n");
      out.write("        }\n");
      out.write("        .footer{\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0px;\n");
      out.write("            bottom: 0px;\n");
      out.write("            width: 100%;\n");
      out.write("            background-image: url(web.pos.ee.images/footer.PNG);\n");
      out.write("            height: 50px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            HttpSession hs = request.getSession();
            String email = (String) hs.getAttribute("loggedIn");
            User user = userController.getuserByUserEmail(email);
        
      out.write("\n");
      out.write("        <div style=\"position: relative; left: 0px; width: 100%; height: 30px; top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333;\">               \n");
      out.write("            <div> Working Hours : Monday - Friday : 8.30 am - 5.30 pm / Saturday : 8.30 am - 1.30 pm </div> \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"top-container\">          \n");
      out.write("            <h1>iFix Laptops.com</h1>\n");
      out.write("            <p>\n");
      out.write("                Something Different\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\" >\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--header-->\n");
      out.write("        <div class=\"header\" id=\"myHeader\">\n");
      out.write("            <div style=\"position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\">MY CART</div>\n");
      out.write("            <div style=\"position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;\n");
      out.write("                 color: #ffffff; font-weight: 500;\" >HOME</div>\n");
      out.write("            <div style=\"position: relative; left: 65%; top: -120%; width: 20%; height: 40px;\" >\n");
      out.write("                <input type=\"submit\" class=\"btn btn-danger\" name=\"checkout\" value=\"PROCEED TO CHECKOUT\" />\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--add detail -->\n");
      out.write("        <div class=\"sidenav\" >\n");
      out.write("            <div style=\"position: relative; left: 0px; width: 100%; top: 0px; height: 40px;\n");
      out.write("                 border-bottom: groove; font-weight: 700; color: #999999; text-align: center; border-width: thin;\">MY PROFILE</div>\n");
      out.write("            <div style=\"position: relative; left: 18%; width: 200px; top: 10px; height: 200px; background-image: url(web.pos.ee.images/user.png); align-content: center; \">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--            <div style=\"position: relative; left: 5px; width: 80%; top: 10%; height: 20px; color: #999999; \">SUMMARY</div>-->\n");
      out.write("            <div style=\"position: relative; left: 15%; width: 80%; top: 10%; height: 20px; color: #999999; \">\n");
      out.write("                <h4 class=\"form-control\" style=\" width: 210px;\" type=\"text\" name=\"email\">");
      out.print( user.getEmail());
      out.write("</h4>\n");
      out.write("                <h4 class=\"form-control\" style=\" width: 210px;\" type=\"text\" name=\"name\">");
      out.print( user.getUserName());
      out.write("</h4>\n");
      out.write("                <h4 class=\"form-control\" style=\" width: 210px;\" type=\"text\" name=\"name\">");
      out.print( user.getContact());
      out.write("</h4>\n");
      out.write("                <h4 class=\"form-control\" style=\" width: 210px;\" type=\"text\" name=\"name\">");
      out.print( user.getUserAddress());
      out.write("</h4>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-success\" value=\"DEACTIVATE PROFILE\" style=\"width: 210px;\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"sidenav-6\">\n");
      out.write("            ");

                ResultSet rset = CartReferenceController.getCartProductsByUserId(Integer.toString(user.getUserId()));
            
      out.write("\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 5%; top: 3%; width: 90%; height: max-content; background-color: #ffffff;\">\n");
      out.write("                <table class=\"table table-responsive\">   \n");
      out.write("                    <th>PRODUCT</th>\n");
      out.write("                    <th>QUANTITY</th>                   \n");
      out.write("                    <th>PRICE</th>\n");
      out.write("                    <th>ACTION</th>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    ");
  while (rset.next()) {
                    
      out.write("\n");
      out.write("                    <tr>  \n");
      out.write("                        ");

                        ImageUpload imageUpload = imageUploadController.getLaptopById(Integer.toString(rset.getInt("cart_references_item_id")));                        
                        
      out.write("\n");
      out.write("                        <td style=\"width: 300px; height: 100px; font-size: medium; text-align: left; top: 30%; font-weight: 100; \">");
      out.print(rset.getString("cart_references_model_brand") );
      out.write(" \n");
      out.write("                            <div style=\"position: relative; top: 10px; width: 200px; left: 10%; height: 50px;\">\n");
      out.write("                                Date added : ");
      out.print( rset.getDate("cart_references_date").toString() );
      out.write(" \n");
      out.write("                            </div>                        \n");
      out.write("                        </td>\n");
      out.write("                        <td style=\"position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 100;\">\n");
      out.write("                            1 Pcs                      \n");
      out.write("                        </td> \n");
      out.write("                        <td style=\"position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 600; color: #ff0000;\">\n");
      out.write("                           Rs ");
      out.print(rset.getBigDecimal("cart_references_item_price") );
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <form action=\"addToDatabaseCart\" method=\"post\">\n");
      out.write("                                <div style=\"position: relative; left: 10%; top: 10px; width: 100%; height: 30px;\">\n");
      out.write("                                    <input class=\"btn btn-success\" type=\"submit\" value=\"REMOVE\" style=\"width: 100px; background-color: #990099;\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>  \n");
      out.write("                           \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
  }
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.onscroll = function () {\n");
      out.write("                myFunction()\n");
      out.write("            };\n");
      out.write("            var header = document.getElementById(\"myHeader\");\n");
      out.write("            var sticky = header.offsetTop;\n");
      out.write("            function myFunction() {\n");
      out.write("                if (window.pageYOffset > sticky) {\n");
      out.write("                    header.classList.add(\"sticky\");\n");
      out.write("                } else {\n");
      out.write("                    header.classList.remove(\"sticky\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"footer\"></div>\n");
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
