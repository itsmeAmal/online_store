package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.core.Validations;
import ifix.controller.CartReferenceController;
import java.sql.ResultSet;
import ifix.model.ImageUpload;
import ifix.controller.imageUploadController;
import ifix.model.User;
import ifix.controller.userController;

public final class dashBoard2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        body{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            font-family: Arial;\r\n");
      out.write("        }\r\n");
      out.write("        .top-container{\r\n");
      out.write("            /*background-color: #999999;*/\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            padding-left: 20px;\r\n");
      out.write("            padding-top: 10px;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            background-color: #ff3300;\r\n");
      out.write("            color: #cccccc;\r\n");
      out.write("            font-weight: 300;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .header{\r\n");
      out.write("            padding: 5px 5px;\r\n");
      out.write("            background: #999999;\r\n");
      out.write("            color: #000000; \r\n");
      out.write("            height: 40px;\r\n");
      out.write("        }\r\n");
      out.write("        .content{\r\n");
      out.write("            padding: 1px;\r\n");
      out.write("        }\r\n");
      out.write("        .sticky{\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            top: 0px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        .sticky + .content{\r\n");
      out.write("            padding-top: 102px;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 2%; \r\n");
      out.write("            top: 20%; \r\n");
      out.write("            width: 23%; \r\n");
      out.write("            height: 50%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav-2{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 83%; \r\n");
      out.write("            top: 13%; \r\n");
      out.write("            width: 16%; \r\n");
      out.write("            height: 81%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("            background-color: #333333;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav-3{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 28%; \r\n");
      out.write("            top: 20%; \r\n");
      out.write("            width: 50%; \r\n");
      out.write("            height: 50%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("            background-color: #cccccc;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav-4{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 74%; \r\n");
      out.write("            top: 20%; \r\n");
      out.write("            width: 23%; \r\n");
      out.write("            height: 50%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav-5{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 59%; \r\n");
      out.write("            top: 30%; \r\n");
      out.write("            width: 12%; \r\n");
      out.write("            height: 50%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("        }\r\n");
      out.write("        .sidenav-7{\r\n");
      out.write("            position: fixed; \r\n");
      out.write("            left: 72%; \r\n");
      out.write("            top: 30%; \r\n");
      out.write("            width: 12%; \r\n");
      out.write("            height: 50%; \r\n");
      out.write("            border: groove;\r\n");
      out.write("            padding: 8px 0;\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            overflow-x: hidden;\r\n");
      out.write("            border-width: thin;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .sidenav a{\r\n");
      out.write("            padding: 6px 8px 6px 16px;\r\n");
      out.write("            display: block; \r\n");
      out.write("        }\r\n");
      out.write("        .sidenav a:hover{\r\n");
      out.write("            color: #009999;\r\n");
      out.write("        }\r\n");
      out.write("        @media screen and (max-height:450px){\r\n");
      out.write("            .sidenav{padding-top: 100px;}\r\n");
      out.write("            .sidenav a{font-size: 18px;}\r\n");
      out.write("        }\r\n");
      out.write("        .footer{\r\n");
      out.write("            position: fixed;\r\n");
      out.write("            left: 0px;\r\n");
      out.write("            bottom: 0px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            background-image: url(web.pos.ee.images/footer.PNG);\r\n");
      out.write("            height: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        a:link, a:visited {\r\n");
      out.write("            background-color: #ff3300;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 5px 15px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        a:hover, a:active {\r\n");
      out.write("            background-color: red;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Dashboard / </title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            HttpSession hs = request.getSession();
            String email = (String) hs.getAttribute("loggedIn");

            if (hs.getAttribute("loggedIn") != null) {
                User user = userController.getuserByUserEmail(email);
        
      out.write("\r\n");
      out.write("        <div style=\"position: relative; left: 0px; width: 100%; height: 30px;\r\n");
      out.write("             top: 0px; background-color: #cccccc; font-family: Arial; text-align: center; color: #333333; padding-top: 5px; font-weight: 600;\">               \r\n");
      out.write("            iFix Computers (pvt) Ltd | Administrator Dashboard \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top-container\">          \r\n");
      out.write("            <p>\r\n");
      out.write("                DASHBOARD /    <a href=\"userProfile.jsp\">");
      out.print( user.getUserName());
      out.write("</a>  \r\n");
      out.write("                <a href=\"invalidateSession\" style=\"position: relative; left: 1500px; top: 1%; width: 100px; height: 40px;\">Logout</a>\r\n");
      out.write("            </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content\" >\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--header-->\r\n");
      out.write("        <div class=\"header\" id=\"myHeader\">\r\n");
      out.write("            <div style=\"position: relative; left: 20%; top: 10%; width: 150px; height: 30px; font-size: 20px;\r\n");
      out.write("                 color: #ffffff; font-weight: 500;\"></div>\r\n");
      out.write("            <div style=\"position: relative; left: 30%; top: -52%; width: 150px; height: 30px; font-size: 20px;\r\n");
      out.write("                 color: #ffffff; font-weight: 500;\" ></div>\r\n");
      out.write("            <div style=\"position: relative; left: 54%; top: -120%; width: 20%; height: 40px;\" >\r\n");
      out.write("                <!--                    <input type=\"text\" class=\"form-control\" id=\"search\" placeholder=\"SEARCH\" />-->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidenav\" >\r\n");
      out.write("            ");

                ResultSet rset = userController.getAllActiveAndDeactiveUsersWithoutAdmins();
            
      out.write("\r\n");
      out.write("            <div class=\"container\" style=\"position: absolute; left: 0px; top: 10%; width: 300px; height: max-content; background-color: #ffffff;\">\r\n");
      out.write("                <H4> USERS</H4>\r\n");
      out.write("                <table class=\"table table-condensed\" style=\"position: relative;  width: 100%;\">   \r\n");
      out.write("                    <th>USER EMAIL</th>\r\n");
      out.write("                    <th style=\"padding-left: 50px;\">ACTION</th>                                          \r\n");
      out.write("                        ");
  while (rset.next()) {
                        
      out.write("\r\n");
      out.write("                    <tr>  \r\n");
      out.write("                        <td style=\"width: 200px; height: 50px; font-size: small; text-align: left; font-weight: 100; \"> \r\n");
      out.write("                            <div style=\"position: relative; top: 10px; width: 200px; left: 10%; height: 50px;\">\r\n");
      out.write("                                ");
      out.print( rset.getString("user_email"));
      out.write("  \r\n");
      out.write("                            </div>                        \r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td style=\"position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 100;\">\r\n");
      out.write("                            <form action=\"changeUserStatus\" method=\"post\">\r\n");
      out.write("                                <div style=\"position: relative; top: 10px; width: 200px; left: 0px; height: 50px;\">\r\n");
      out.write("                                    ");

                                        int value = rset.getInt("user_img_name");
                                        String activeState = "";
                                        if (value == 1) {
                                            activeState = "DEACTIVATE";
                                        } else {
                                            activeState = "ACTIVATE";
                                        }
                                    
      out.write("                                    \r\n");
      out.write("                                    <input type=\"submit\" name=\"changeStatus\" value=\"");
      out.print(activeState);
      out.write("\" class=\"btn btn-info\" style=\"width: 130px; \">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"changeStatusHidden\" value=\"");
      out.print(rset.getInt("user_img_name"));
      out.write("\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"userEmail\" value=\"");
      out.print(rset.getString("user_email"));
      out.write("\">\r\n");
      out.write("                                </div>   \r\n");
      out.write("                            </form>\r\n");
      out.write("                        </td>                             \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
  }
                    
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidenav-2\">\r\n");
      out.write("            <a style=\"position: relative; top: 10px; width: 270px; background-color: #6666ff; text-align: left;\"   href=\"addAdminUserAccount.jsp\">REGISTER ADMIN USER ACCOUNT</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 20px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"addProduct.jsp\">REGISTER LAPTOP</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 30px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"userAdd.jsp\">REGISTER USER ACCOUNT</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 40px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"invoicedItems.jsp\">INVOICED ITEMS</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 50px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"dashBoard.jsp\">MANAGE USERS</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 60px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"dashBoard.jsp\">MANAGE LAPTOPS</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 70px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"dashBoard.jsp\">MANAGE INVOICES</a><br>\r\n");
      out.write("            <a style=\"position: relative; top: 80px; width: 270px; background-color: #6666ff; text-align: left;\"  href=\"dashBoard.jsp\">DELIVERY STATUS</a><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidenav-3\">\r\n");
      out.write("            ");

                int totalRegisteredUsers = userController.getAllregisteredUsersCount();
            
      out.write("\r\n");
      out.write("            <h3 style=\"padding-left: 20%; font-family: ubuntu; color: #009900;\">GLOBALLY REGISTERED :</h3> <br>\r\n");
      out.write("            <h1 style=\" padding-left: 40%; background-color: #ccccff; \">");
      out.print(totalRegisteredUsers);
      out.write(" USER ACCOUNTS </h1>\r\n");
      out.write("        \r\n");
      out.write("            <h3 style=\"padding-left: 20%; font-family: ubuntu; color: #009900;\">ACTIVE STATE :</h3> <br>\r\n");
      out.write("             ");

                int activeUsers = userController.getActiveUserAccountCount(); 
            
      out.write("\r\n");
      out.write("            <h1 style=\" padding-left: 40%; background-color: #ccccff; \">");
      out.print(activeUsers);
      out.write(" USER ACCOUNTS </h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.onscroll = function () {\r\n");
      out.write("                myFunction()\r\n");
      out.write("            };\r\n");
      out.write("            var header = document.getElementById(\"myHeader\");\r\n");
      out.write("            var sticky = header.offsetTop;\r\n");
      out.write("            function myFunction() {\r\n");
      out.write("                if (window.pageYOffset > sticky) {\r\n");
      out.write("                    header.classList.add(\"sticky\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    header.classList.remove(\"sticky\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        <div class=\"footer\"></div>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
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
