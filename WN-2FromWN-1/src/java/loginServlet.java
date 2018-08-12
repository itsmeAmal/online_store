/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifix.controller.CartReferenceController;
import ifix.controller.userController;
import ifix.core.MethodStatus;
import ifix.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amal
 */
@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String userName = request.getParameter("uname");
            String password = request.getParameter("pw");
            HttpSession ses = request.getSession();
            MethodStatus status = null;
            status = userController.isCorrectEmailAndPw(userName, password);
            if (status == MethodStatus.SUCCESS) {
                User user = userController.getuserByUserEmail(userName);
                if (user.getSatus() == 2) {
                    ses.setAttribute("loggedIn", userName);
                    response.sendRedirect("addProduct.jsp");
                } else if (user.getSatus() == 1) {
                    ses.setAttribute("loggedIn", userName);
                    MethodStatus succStatus = CartReferenceController.updateSessionIdToUserId(request.getSession().getId(), Integer.toString(user.getUserId()));
                    if (succStatus == MethodStatus.SUCCESS) {
                        response.sendRedirect("productList.jsp");
                    }

//                    out.println("<script type=\"text/javascript\">");
//                    out.println("alert('" + userName + "');");
//                    out.println("location='login.jsp';");
//                    out.println("</script>");
                }
            } else if (status == MethodStatus.FAILED) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Username or Password is Incorrect');");
                out.println("location='login.jsp';");
                out.println("</script>");
            }

        } catch (SQLException ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
//        try {
//            response.setContentType("text/html;charset=UTF-8");
//            PrintWriter out = response.getWriter();
//            String userName = request.getParameter("uname");
//            String password = request.getParameter("pw");
//            HttpSession ses = request.getSession();
//            MethodStatus status = null;
//            status = userController.isCorrectEmailAndPw(userName, password);
//            if (status == MethodStatus.SUCCESS) {
//                User user = userController.getuserByUserEmail(userName);
//                if (user.getSatus() == 2) {
//                    response.sendRedirect("controlPanel.jsp");
//                    ses.setAttribute("user", "amal");
//                } else if (user.getSatus() == 1) {
//                    response.sendRedirect("productList.jsp");
//                    ses.setAttribute("user", "amal");
//                }
//            } else if (status == MethodStatus.FAILED) {
//                out.println("<script type=\"text/javascript\">");
//                out.println("alert('Username or Password is Incorrect');");
//                out.println("location='login.jsp';");
//                out.println("</script>");
////                response.sendRedirect("login.jsp");
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
