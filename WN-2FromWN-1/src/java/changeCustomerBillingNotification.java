/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifix.controller.CartReferenceController;
import ifix.core.Validations;
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

/**
 *
 * @author Amal
 */
@WebServlet(urlPatterns = {"/changeCustomerBillingNotification"})
public class changeCustomerBillingNotification extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

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
        PrintWriter out = response.getWriter();
        String stateValue = request.getParameter("hdnBtn");
        String userIdString = request.getParameter("hdnUserId");
        String itemIdString = request.getParameter("hdnItemId");

        int intStateValue = Validations.getIntOrZeroFromString(stateValue);
        int intUserId = Validations.getIntOrZeroFromString(userIdString);
        int itemId = Validations.getIntOrZeroFromString(itemIdString);

        switch (intStateValue) {
            case 1:
                try {
                    CartReferenceController.updateCustomerDeliveryNotification(2, itemId, intUserId);
                } catch (SQLException ex) {
                    Logger.getLogger(changeCustomerBillingNotification.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2:
                try {
                    CartReferenceController.updateCustomerDeliveryNotification(3, itemId, intUserId);
                } catch (SQLException ex) {
                    Logger.getLogger(changeCustomerBillingNotification.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3: {
                try {
                    CartReferenceController.updateCustomerDeliveryNotification(1, itemId, intUserId);
                } catch (SQLException ex) {
                    Logger.getLogger(changeCustomerBillingNotification.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                break;
        }
        response.sendRedirect("invoicedItems.jsp");
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
