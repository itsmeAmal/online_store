package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ifix.model.User;
import ifix.controller.userController;

public final class controlPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            #divOuter{               \r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                top: 0px;    \r\n");
      out.write("                background-color: #cccccc;\r\n");
      out.write("            }\r\n");
      out.write("            #divTopBlueLine{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 5%;\r\n");
      out.write("                top: 0px;\r\n");
      out.write("                background-color: #0066ff;\r\n");
      out.write("            }\r\n");
      out.write("            #divLeftBlackSpace{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 15%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                top: 5%;  \r\n");
      out.write("                background-color: #333333;\r\n");
      out.write("            }\r\n");
      out.write("            #divTopWhiteSpece{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 15%;\r\n");
      out.write("                width: 85%;\r\n");
      out.write("                height: 6%;\r\n");
      out.write("                top: 5%;\r\n");
      out.write("                background-color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox1{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 17%;\r\n");
      out.write("                top: 13%;\r\n");
      out.write("                width: 19%;\r\n");
      out.write("                height: 9%;\r\n");
      out.write("                background-color: #cc66ff;\r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox2{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 38%;\r\n");
      out.write("                top: 13%;\r\n");
      out.write("                width: 19%;\r\n");
      out.write("                height: 9%;\r\n");
      out.write("                background-color: #33ccff;\r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox3{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 59%;\r\n");
      out.write("                top: 13%;\r\n");
      out.write("                height: 9%;\r\n");
      out.write("                width: 19%;\r\n");
      out.write("                background-color: #ff6666;\r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox4{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 80%;\r\n");
      out.write("                width: 19%;\r\n");
      out.write("                height: 9%;\r\n");
      out.write("                top: 13%;\r\n");
      out.write("                background-color: #ffcc00;\r\n");
      out.write("            }\r\n");
      out.write("            #divTopWhiteSpece_lblDashBoard{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 2%;\r\n");
      out.write("                top: 10%;\r\n");
      out.write("                width: 30%;\r\n");
      out.write("                height: 70%;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: 500;\r\n");
      out.write("                color: #666666;\r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox1_worldIcon{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 80%;\r\n");
      out.write("                top: 20%;\r\n");
      out.write("                width: 48px;\r\n");
      out.write("                height: 48px;\r\n");
      out.write("                background-image: url('web.pos.ee.images/world.png');               \r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox2_mailIcon{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 80%;\r\n");
      out.write("                top: 20%;\r\n");
      out.write("                width: 48px;\r\n");
      out.write("                height: 48px;\r\n");
      out.write("                background-image: url('web.pos.ee.images/mail.png'); \r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox3_fieldsIcon{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 80%;\r\n");
      out.write("                top: 20%;\r\n");
      out.write("                width: 48px;\r\n");
      out.write("                height: 48px;\r\n");
      out.write("                background-image: url('web.pos.ee.images/fields.png'); \r\n");
      out.write("            }\r\n");
      out.write("            #divMenuBox4_dataBases{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 80%;\r\n");
      out.write("                top: 20%;\r\n");
      out.write("                width: 48px;\r\n");
      out.write("                height: 48px;\r\n");
      out.write("                background-image: url('web.pos.ee.images/db.png'); \r\n");
      out.write("            }\r\n");
      out.write("            #divTopBlueLine_cloudControl{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 0px;\r\n");
      out.write("                width: 15%;\r\n");
      out.write("                height: 5%;\r\n");
      out.write("                top: 0px;\r\n");
      out.write("                background-color: #003399;\r\n");
      out.write("            }\r\n");
      out.write("            #divTopBlueLine_cloudControl_comIcon{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 5%;\r\n");
      out.write("                width: 32px;\r\n");
      out.write("                height: 32px;\r\n");
      out.write("                top: 0px;\r\n");
      out.write("                background-image: url('web.pos.ee.images/cloudcontrol.png');\r\n");
      out.write("            }\r\n");
      out.write("            #divTopBlueLine_cloudControl_txtCoudControl{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30%;\r\n");
      out.write("                width: 60%;\r\n");
      out.write("                height: 5%;\r\n");
      out.write("                top: 20%; \r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                font-weight: 500;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("            }\r\n");
      out.write("            #divLeftBlackSpace_management{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                top: 10%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("            }\r\n");
      out.write("            #allUsers{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 20%;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("            }\r\n");
      out.write("            #addProducts{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 45%;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("            }\r\n");
      out.write("            #addUser{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 25%;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("            }\r\n");
      out.write("            #addGrn{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 50%;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("            }\r\n");
      out.write("            #searchUser{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 30%;\r\n");
      out.write("                color: #ffffff;\r\n");
      out.write("                font-weight: 200;\r\n");
      out.write("                font-family: serif;\r\n");
      out.write("            }\r\n");
      out.write("            .sidenav-6{\r\n");
      out.write("                position: fixed; \r\n");
      out.write("                left: 17%; \r\n");
      out.write("                top: 27%; \r\n");
      out.write("                width: 30%; \r\n");
      out.write("                height: 30%; \r\n");
      out.write("                border: groove;\r\n");
      out.write("                padding: 8px 0;   \r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                overflow-x: hidden;\r\n");
      out.write("                border-width: thin;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>   \r\n");
      out.write("        <div id=\"divOuter\"> \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div id=\"divTopBlueLine\"></div>\r\n");
      out.write("            <div id=\"divTopBlueLine_cloudControl\">\r\n");
      out.write("                <div id=\"divTopBlueLine_cloudControl_comIcon\"></div>\r\n");
      out.write("                <div id=\"divTopBlueLine_cloudControl_txtCoudControl\">Cloud Control</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divLeftBlackSpace\">\r\n");
      out.write("                <div id=\"divLeftBlackSpace_management\">Management</div>\r\n");
      out.write("                <div id=\"allUsers\"> <a style=\"color: #ffffff;\" href=\"addAdminUserAccount.jsp\">ADD ADMIN USER ACCOUNT</a></div>\r\n");
      out.write("                <div id=\"addProducts\"> <a style=\"color: #ffffff;\" href=\"addProduct.jsp\">PRODUCT MANAGEMNT</a></div>\r\n");
      out.write("                <div id=\"addUser\"> <a style=\"color: #ffffff;\" href=\"userAdd.jsp\">ADD USER ACCOUNT</a></div>\r\n");
      out.write("                <div id=\"addGrn\"> <a style=\"color: #ffffff;\" href=\"invoicedItems.jsp\">INVOICED ITEMS</a></div>\r\n");
      out.write("                <div id=\"searchUser\"> <a style=\"color: #ffffff;\" href=\"activeUsers.jsp\">ACTIVE USERS</a></div> \r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divTopWhiteSpece\">\r\n");
      out.write("                <div id=\"divTopWhiteSpece_lblDashBoard\">\r\n");
      out.write("                    ");

                        HttpSession hs = request.getSession();
                        String email = (String) hs.getAttribute("loggedIn");

                        if (hs.getAttribute("loggedIn") != null) {
                            User user = userController.getuserByUserEmail(email);
                    
      out.write("\r\n");
      out.write("                    Dashboard   /    <a href=\"userProfile.jsp\">");
      out.print( user.getUserName());
      out.write("</a>  \r\n");
      out.write("                    <a href=\"invalidateSession\" style=\"position: relative; left: 1200px; top: 1%; width: 100px; height: 50px;\">Logout</a>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divMenuBox1\">\r\n");
      out.write("                ");

                    int totalRegisteredUsers = userController.getAllregisteredUsersCount();
                
      out.write("\r\n");
      out.write("                <h4 style=\"padding-left: 10px;\">GLOBALLY REGISTERED USERS </h4>\r\n");
      out.write("                <h3 style=\"padding-left: 45%;\">");
      out.print(totalRegisteredUsers);
      out.write("</h3>\r\n");
      out.write("                <div id=\"divMenuBox1_worldIcon\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divMenuBox2\">\r\n");
      out.write("                <div id=\"divMenuBox2_mailIcon\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divMenuBox3\">\r\n");
      out.write("                <div id=\"divMenuBox3_fieldsIcon\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"divMenuBox4\">\r\n");
      out.write("                <div id=\"divMenuBox4_dataBases\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sidenav-6\">\r\n");
      out.write("                <table class=\"table table-responsive\">   \r\n");
      out.write("                    <th>PRODUCT</th>\r\n");
      out.write("                    <th>QUANTITY</th>                   \r\n");
      out.write("                    <th>PRICE</th>\r\n");
      out.write("                      \r\n");
      out.write("                    <tr>  \r\n");
      out.write("                       \r\n");
      out.write("                        <td style=\"width: 300px; height: 100px; font-size: medium; text-align: left; top: 30%; font-weight: 100; \"> \r\n");
      out.write("                            <div style=\"position: relative; top: 10px; width: 200px; left: 10%; height: 50px;\">\r\n");
      out.write("                            </div>                        \r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td style=\"position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 100;\">\r\n");
      out.write("                            1 Pcs                      \r\n");
      out.write("                        </td> \r\n");
      out.write("                        <td style=\"position:  relative; font-size: medium; text-align: left; top: 30%; font-weight: 600; color: #ff0000;\">\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
