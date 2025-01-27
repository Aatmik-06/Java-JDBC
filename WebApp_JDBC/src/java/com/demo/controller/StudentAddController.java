/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.demo.controller;

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
public class StudentAddController extends HttpServlet {

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
            out.println("<title>Servlet StudentAddController</title>");
            out.println("</head>");
            out.println("<body>");
            int sid = Integer.parseInt(request.getParameter("sid"));
            int p = Integer.parseInt(request.getParameter("p"));
            int c = Integer.parseInt(request.getParameter("c"));
            int m = Integer.parseInt(request.getParameter("m"));
            int h = Integer.parseInt(request.getParameter("h"));
            int e = Integer.parseInt(request.getParameter("e"));
            out.println("<h1>SID " + sid + "</h1>");
            out.println("<h1>ENROLL " + enroll + "</h1>");
            out.println("<h1>NAME " + name + "</h1>");
            out.println("<h1>P " + p + "</h1>");
            out.println("<h1>C " + c + "</h1>");
            out.println("<h1>M " + m + "</h1>");
            out.println("<h1>H" + h + "</h1>");
            out.println("<h1>E" + e + "</h1>");
            StudentBean sb = new StudentBean();
            sb.setC(c);
            sb.setE(e);
            sb.setEnroll(enroll);
            sb.setH(h);
            sb.setM(m);
            sb.setName(name);
            sb.setP(p);
            sb.setSid(sid);
            StudentDAO sd = new StudentDAO();
            int r = sd.addStudent(sb);
            if (r > 0) {
                out.println("<h1><font color='green'>Student Addedsuccess</font > < / h1 >");
                }
            else{
              out.println("<h1><font color='red'>Student Not Added </font></h1>");
            }
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
