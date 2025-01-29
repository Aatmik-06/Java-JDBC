/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.controller;

import com.ram.bean.StudentBean;
import com.ram.dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author adi18
 */
public class EditStudent extends HttpServlet {

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
            out.println("<title>Servlet EditStudent</title>");
            out.println("</head>");
            out.println("<body>");
               int sid = Integer.parseInt(request.getParameter("id"));
            StudentDAO sd = new StudentDAO();
            StudentBean sb = sd.findById(sid);
            

               
            out.println("<h1 align='center'>Student Registration Form</h1>");
            out.println("<form action='StudentUpdateController'>");
            out.println("<table align='center' border='1'");
            out.println("<tr>");
            out.println("<td>ENROLLMENT NO :</td>");
            out.println("<td><input type='text' name='enroll' value='" + sb.getEnroll() + "'></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>SID :</td>");
            out.println("<td><input type='text' name='sid' disabled value='" + sb.getSid() + "'></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>NAME:</td>");
            out.println(" <td><input type='text' name='name' value=" + sb.getName() + "></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>P :</td>");
            out.println("<td><input type='text' name='p' value='" + sb.getP() + "'></td>");
            out.println(" </tr>");
            out.println("<tr>");
            out.println("<td>C :</td>");
            out.println("<td><input type='text' name='c' value='" + sb.getC() + "'></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>M :</td>");
            out.println("<td><input type='text' name='m' value=" + sb.getM() + "></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>H:</td>");
            out.println(" <td><input type='text' name='h' value=" + sb.getH() + "></td>");
            out.println(" </tr>");
            out.println("<tr>");
            out.println("<td>E :</td>");
            out.println("<td><input type='text' name='e' value=" + sb.getE() + "></td>");
            out.println(" </tr>");
            out.println("<tr>");
            out.println("<td colspan='2' align='center'><input type='submit' value='Update'></td>");
            out.println(" </tr>");
            out.println("</table>");
            out.println("</form>");
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
