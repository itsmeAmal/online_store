package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_005fonline_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Pay Online</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            window.location.hash = \"no-back-button\";\r\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\r\n");
      out.write("            window.onhashchange = function() {\r\n");
      out.write("                window.location.hash = \"no-back-button\";\r\n");
      out.write("            };\r\n");
      out.write("        </script>\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            #back_box{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                alignment-adjust: central;\r\n");
      out.write("                left: 20%;\r\n");
      out.write("                width: 600px;\r\n");
      out.write("                height: 550px;\r\n");
      out.write("                top: 10%;\r\n");
      out.write("                border-style: groove;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #payment_type_d{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 20px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #cart_images{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 250px;\r\n");
      out.write("                width: 187px;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                top: 50px;\r\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.paymentgateway/1.png\");\r\n");
      out.write("            }\r\n");
      out.write("            #name_on_card{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 400px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 100px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #address_l1{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 145px;\r\n");
      out.write("            }\r\n");
      out.write("            #address_l2{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 190px;\r\n");
      out.write("            }\r\n");
      out.write("            #city{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 235px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #credit_card_no{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 280px;\r\n");
      out.write("            }\r\n");
      out.write("            #exp_month{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 345px;\r\n");
      out.write("            }\r\n");
      out.write("            #exp_year{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 190px;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 370px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #statement{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 350px;\r\n");
      out.write("                height: 100px;\r\n");
      out.write("                top: 420px;\r\n");
      out.write("            }\r\n");
      out.write("            #confirm_payment{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 30px;\r\n");
      out.write("                width: 100px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                top: 490px;\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("            #cancel_payment{\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                left: 210px;\r\n");
      out.write("                top: 490px;\r\n");
      out.write("                width: 100px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"final_pay_2\" method=\"GET\">\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div id=\"back_box\">\r\n");
      out.write("                <div id=\"payment_type_d\">\r\n");
      out.write("                    <h5>Credit Card Type</h5>\r\n");
      out.write("                    <select class=\"form-control\" name=\"card_type\">\r\n");
      out.write("                        <option>Master</option>\r\n");
      out.write("                        <option>Visa </option>\r\n");
      out.write("                        <option>AMEX </option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"cart_images\"></div>\r\n");
      out.write("                <div id=\"name_on_card\"> <input type=\"text\" name=\"tf-1\" placeholder=\"Name on credit card\"  class=\"form-control\"/> </div>\r\n");
      out.write("                <div id=\"address_l1\"> <input type=\"text\" name=\"tf-2\" placeholder=\"Address Line 1\" class=\"form-control\"/> </div>\r\n");
      out.write("                <div id=\"address_l2\" > <input type=\"text\" name=\"tf-3\" placeholder=\"Address Line 2\" class=\"form-control\" />  </div>\r\n");
      out.write("                <div id=\"city\"> <input type=\"text\" name=\"tf-4\" placeholder=\"City\" class=\"form-control\" />   </div>\r\n");
      out.write("                <div id=\"credit_card_no\"> <input type=\"text\" name=\"tf-5\" placeholder=\"Credit Card No\" class=\"form-control\" />   </div>\r\n");
      out.write("                <div id=\"exp_month\"> \r\n");
      out.write("                    <h5>Expiration Date</h5>\r\n");
      out.write("                    <select class=\"form-control\" name=\"exp_mnth2\">\r\n");
      out.write("                        <option>January</option>\r\n");
      out.write("                        <option>February</option>\r\n");
      out.write("                        <option>March</option>\r\n");
      out.write("                        <option>April</option>\r\n");
      out.write("                        <option>May</option>\r\n");
      out.write("                        <option>June</option>\r\n");
      out.write("                        <option>July</option>\r\n");
      out.write("                        <option>August</option>\r\n");
      out.write("                        <option>September</option>\r\n");
      out.write("                        <option>October</option>\r\n");
      out.write("                        <option>November</option>\r\n");
      out.write("                        <option>December</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"exp_year\">\r\n");
      out.write("                    <h5></h5>\r\n");
      out.write("                    <select class=\"form-control\" name=\"exp_year2\">\r\n");
      out.write("                        <option>2016</option>\r\n");
      out.write("                        <option>2017</option>\r\n");
      out.write("                        <option>2018</option>\r\n");
      out.write("                        <option>2019</option>\r\n");
      out.write("                        <option>2020</option>\r\n");
      out.write("                        <option>2021</option>\r\n");
      out.write("                        <option>2022</option>\r\n");
      out.write("                        <option>2023</option>\r\n");
      out.write("                        <option>2024</option>\r\n");
      out.write("                        <option>2025</option>\r\n");
      out.write("                        <option>2026</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"statement\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        For on-time posting on the payment to your account please allow three business days \r\n");
      out.write("                        prior to the due date for processing\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"confirm_payment\"><input type=\"submit\" name=\"payment\" value=\"PAY\" class=\"btn btn-success\" style=\"position: absolute; width: 150px;\"  /> </div>\r\n");
      out.write("                <div id=\"cancel_payment\"> <a href=\"Cart_bill.jsp\"  class=\"btn btn-success\" style=\"position: absolute; width: 150px;\" >Cancel</a>  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");


                HttpSession hs = request.getSession();

            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <input type=\"hidden\" name=\"hidden_tot\" value=\"");
      out.print( hs.getAttribute("tot"));
      out.write("\"/>\r\n");
      out.write("\r\n");
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
