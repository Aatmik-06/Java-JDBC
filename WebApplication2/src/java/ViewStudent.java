/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import static java.util.Collections.list;


/**
 *
 * @author adi18
 */
public class ViewStudent extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewStudent</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<table border='5' align='center'>");
             out.println("<tr><th>SID</th>");
                  out.println("<th>Name</th>");
                  out.println("<th>Enroll</th>");
                  out.println("<th>P</th>");
                  out.println("<td>C</th>");
                  out.println("<th>M</th>");
                  out.println("<td>H</th>");
                  out.println("<th>E</th>");
                  out.println("<th>Per</th></tr>");
                  
                  StudentDAO sd = new StudentDAO();
                  ArrayList<StudentBean>list=sd.findAll();
                  
                  for (StudentBean sb:list){                  
                 out.println("<tr>");
                 out.println("<td>"+sb.getSid()+"</td>");
                 out.println("<td>"+sb.getName()+"</td>");
                 out.println("<td>"+sb.getEnroll()+"</td>");
                  out.println("<td>"+sb.getP()+"</td>");
                  out.println("<td>"+sb.getC()+"</td>");
                  out.println("<td>"+sb.getM()+"</td>");
                  out.println("<td>"+sb.getH()+"</td>");
                  out.println("<td>"+sb.getE()+"</td>");
                  out.println("<td>"+sb.getPer()+"</td>");
                  out.println("<td>"+sb.getTotal()+"</td>");
                  out.println("</tr>");  
                  }
                   out.println(" <table/>");
                        
            out.println("</body>");
            out.println("</html>");
            
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
