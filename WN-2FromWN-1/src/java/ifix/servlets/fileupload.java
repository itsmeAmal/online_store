package ifix.servlets;

import ifix.core.Validations;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.hibernate.Session;

@WebServlet(name = "fileupload", urlPatterns = {"/fileupload"})
public class fileupload extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and
     * <code>POST</code> methods.
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
        try {

            String laptopModelLaptopId = null;
            String hardDisk = null;
            String ram = null;
            String vga = null;
            String processor = null;
            String usbType1 = null;
            String usbType2 = null;
            String hdmi = null;
            String vgaOp = null;
            String screenSize = null;
            String cache = null;
            String Path = "files/";

            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> item = upload.parseRequest(request);

            for (FileItem file_item : item) {
                if (file_item.isFormField()) {

                    if (file_item.getFieldName().equals("laptopModelLaptopId")) {
                        laptopModelLaptopId = file_item.getString();

                    } else if (file_item.getFieldName().equals("hardDisk")) {
                        hardDisk = file_item.getString();

                    } else if (file_item.getFieldName().equals("ram")) {
                        ram = file_item.getString();

                    } else if (file_item.getFieldName().equals("vga")) {
                        vga = file_item.getString();

                    } else if (file_item.getFieldName().equals("processor")) {
                        processor = file_item.getString();

                    } else if (file_item.getFieldName().equals("usbType1")) {
                        usbType1 = file_item.getString();

                    } else if (file_item.getFieldName().equals("usbType2")) {
                        usbType2 = file_item.getString();

                    } else if (file_item.getFieldName().equals("hdmi")) {
                        hdmi = file_item.getString();

                    } else if (file_item.getFieldName().equals("vgaOp")) {
                        vgaOp = file_item.getString();

                    } else if (file_item.getFieldName().equals("screenSize")) {
                        screenSize = file_item.getString();

                    } else if (file_item.getFieldName().equals("cache")) {
                        cache = file_item.getString();

                    }

                } else {

                    Path += System.currentTimeMillis() + file_item.getName();
                    File savedfile = new File(request.getServletContext().getRealPath("") + "/" + Path);
                    file_item.write(savedfile);

                    pojos.LaptopModel laptopModel = new pojos.LaptopModel();
                    laptopModel.setLaptopModelLaptopId(laptopModelLaptopId);
                    laptopModel.setLaptopModelHardDisk(hardDisk);
                    laptopModel.setLaptopModelRam(ram);
                    laptopModel.setLaptopModelVga(vga);
                    laptopModel.setLaptopModelProcessor(processor);
                    laptopModel.setLaptopModelUsbType1(usbType1);
                    laptopModel.setLaptopModelUsbType2(usbType2);
                    laptopModel.setLaptopModelHdmi(hdmi);
                    laptopModel.setLaptopModelVgaOutput(vgaOp);
                    laptopModel.setLaptopModelScreenSize(screenSize);
                    laptopModel.setLaptopModelCacheMemory(Validations.getIntFromString(cache));
                    laptopModel.setLaptopModelStatus(1);
                    laptopModel.setLaptopModelImagePath(Path);

                    Session s = ifix.hib.connection.connector.getSessionFactory().openSession();
                    s.save(laptopModel);
                    s.beginTransaction().commit();
                    s.close();
                    response.sendRedirect("laptopModelAdd.jsp"); 
                }

            }
        } catch (Exception e) {
            throw new ServletException(e);
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
