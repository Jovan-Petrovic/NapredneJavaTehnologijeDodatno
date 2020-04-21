/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.frontcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dusan
 */
@WebServlet("/app/*")
public class FrontController extends HttpServlet {

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
        
        System.out.println(request.getServletPath());
        System.out.println(request.getServerName());
        System.out.println(request.getPathInfo());
        
        String pathInfo = request.getPathInfo();
        
        String page="login.jsp";
        if (pathInfo.equals("/login")){
            //login
            page = login(request);
        }
        
        if (pathInfo.equals("/user/all")){
            page = getAllUsers(request);
        }
        
        if (pathInfo.equals("/user/add")){
            page = addUser(request);
        }
        
        if (pathInfo.equals("/user/login")){
            page = getAllLoginUsers(request);
        }
        
        
        
        request.getRequestDispatcher(page).forward(request, response);
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

    private String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        //postoji prijavljen na sistem
        return "/WEB-INF/pages/home.jsp";
    }

    private String getAllUsers(HttpServletRequest request) {
         return "/WEB-INF/pages/user/all.jsp";
    }

    private String addUser(HttpServletRequest request) {
         return "/WEB-INF/pages/user/add.jsp";
    }

    private String getAllLoginUsers(HttpServletRequest request) {
          return "/WEB-INF/pages/user/login_all.jsp";
    }

}