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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pay Online</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"com.official.cazzendra.css.common/bootstrap.min.css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.location.hash = \"no-back-button\";\n");
      out.write("            window.location.hash = \"Again-No-back-button\";//again because google chrome don't insert first hash into history\n");
      out.write("            window.onhashchange = function() {\n");
      out.write("                window.location.hash = \"no-back-button\";\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            #back_box{\n");
      out.write("                position: absolute;\n");
      out.write("                alignment-adjust: central;\n");
      out.write("                left: 20%;\n");
      out.write("                width: 600px;\n");
      out.write("                height: 550px;\n");
      out.write("                top: 10%;\n");
      out.write("                border-style: groove;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #payment_type_d{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #cart_images{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 250px;\n");
      out.write("                width: 187px;\n");
      out.write("                height: 40px;\n");
      out.write("                top: 50px;\n");
      out.write("                background-image: url(\"com.official.cazzendra.images.paymentgateway/1.png\");\n");
      out.write("            }\n");
      out.write("            #name_on_card{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 400px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 100px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #address_l1{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 145px;\n");
      out.write("            }\n");
      out.write("            #address_l2{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 190px;\n");
      out.write("            }\n");
      out.write("            #city{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 235px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #credit_card_no{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 200px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 280px;\n");
      out.write("            }\n");
      out.write("            #exp_month{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 345px;\n");
      out.write("            }\n");
      out.write("            #exp_year{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 190px;\n");
      out.write("                width: 150px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 370px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #statement{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 350px;\n");
      out.write("                height: 100px;\n");
      out.write("                top: 420px;\n");
      out.write("            }\n");
      out.write("            #confirm_payment{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 30px;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 30px;\n");
      out.write("                top: 490px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #cancel_payment{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 210px;\n");
      out.write("                top: 490px;\n");
      out.write("                width: 100px;\n");
      out.write("                height: 30px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"final_pay_2\" method=\"GET\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"back_box\">\n");
      out.write("                <div id=\"payment_type_d\">\n");
      out.write("                    <h5>Credit Card Type</h5>\n");
      out.write("                    <select class=\"form-control\" name=\"card_type\">\n");
      out.write("                        <option>Master</option>\n");
      out.write("                        <option>Visa </option>\n");
      out.write("                        <option>AMEX </option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"cart_images\"></div>\n");
      out.write("                <div id=\"name_on_card\"> <input type=\"text\" name=\"tf-1\" placeholder=\"Name on credit card\"  class=\"form-control\"/> </div>\n");
      out.write("                <div id=\"address_l1\"> <input type=\"text\" name=\"tf-2\" placeholder=\"Address Line 1\" class=\"form-control\"/> </div>\n");
      out.write("                <div id=\"address_l2\" > <input type=\"text\" name=\"tf-3\" placeholder=\"Address Line 2\" class=\"form-control\" />  </div>\n");
      out.write("                <div id=\"city\"> <input type=\"text\" name=\"tf-4\" placeholder=\"City\" class=\"form-control\" />   </div>\n");
      out.write("                <div id=\"credit_card_no\"> <input type=\"text\" name=\"tf-5\" placeholder=\"Credit Card No\" class=\"form-control\" />   </div>\n");
      out.write("                <div id=\"exp_month\"> \n");
      out.write("                    <h5>Expiration Date</h5>\n");
      out.write("                    <select class=\"form-control\" name=\"exp_mnth2\">\n");
      out.write("                        <option>January</option>\n");
      out.write("                        <option>February</option>\n");
      out.write("                        <option>March</option>\n");
      out.write("                        <option>April</option>\n");
      out.write("                        <option>May</option>\n");
      out.write("                        <option>June</option>\n");
      out.write("                        <option>July</option>\n");
      out.write("                        <option>August</option>\n");
      out.write("                        <option>September</option>\n");
      out.write("                        <option>October</option>\n");
      out.write("                        <option>November</option>\n");
      out.write("                        <option>December</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"exp_year\">\n");
      out.write("                    <h5></h5>\n");
      out.write("                    <select class=\"form-control\" name=\"exp_year2\">\n");
      out.write("                        <option>2016</option>\n");
      out.write("                        <option>2017</option>\n");
      out.write("                        <option>2018</option>\n");
      out.write("                        <option>2019</option>\n");
      out.write("                        <option>2020</option>\n");
      out.write("                        <option>2021</option>\n");
      out.write("                        <option>2022</option>\n");
      out.write("                        <option>2023</option>\n");
      out.write("                        <option>2024</option>\n");
      out.write("                        <option>2025</option>\n");
      out.write("                        <option>2026</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"statement\">\n");
      out.write("                    <p>\n");
      out.write("                        For on-time posting on the payment to your account please allow three business days \n");
      out.write("                        prior to the due date for processing\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"confirm_payment\"><input type=\"submit\" name=\"payment\" value=\"PAY\" class=\"btn btn-success\" style=\"position: absolute; width: 150px;\"  /> </div>\n");
      out.write("                <div id=\"cancel_payment\"> <a href=\"Cart_bill.jsp\"  class=\"btn btn-success\" style=\"position: absolute; width: 150px;\" >Cancel</a>  </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");


                HttpSession hs = request.getSession();

            
      out.write("\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" name=\"hidden_tot\" value=\"");
      out.print( hs.getAttribute("tot"));
      out.write("\"/>\n");
      out.write("\n");
      out.write("        </form>\n");
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
