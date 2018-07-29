/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifix.servlets;

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
@WebServlet(name = "CartReferences", urlPatterns = {"/CartReferences"})
public class CartReferences extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String itemId;
            itemId = request.getParameter("itemId");

            HttpSession ht = request.getSession();
            String laptopId = (String) ht.getAttribute("laptopId");
            if (ht.getAttribute("loggedIn") != null) {
                String email = (String) ht.getAttribute("loggedIn");
                User user = userController.getuserByUserEmail(email);

                MethodStatus validStatus = CartReferenceController.validateProductForOneLaptop(laptopId, Integer.toString(user.getUserId()));
                if (validStatus == MethodStatus.SUCCESS) {
                    MethodStatus status = CartReferenceController.addcartReference(laptopId, Integer.toString(user.getUserId()));
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Successfully added to cart');");
                    out.println("location='laptopModelAll.jsp';");
                    out.println("</script>");
                    ht.setAttribute("itemId", "");
                    System.out.println(ht.getAttribute("itemId"));
                } else if (validStatus == MethodStatus.DUPLICATE_PRIMARY_KEY) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Cart items full, Please purchase cart items or clear your cart');");
                    out.println("location='laptopModelAll.jsp';");
                    out.println("</script>");
                }

            } else if (ht.getAttribute("loggedIn") == null) {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('You need to login first');");
                out.println("location='login.jsp';");
                out.println("</script>");

            }

        } catch (SQLException ex) {
            Logger.getLogger(CartReferences.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartReferences.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartReferences.class.getName()).log(Level.SEVERE, null, ex);
        }
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
