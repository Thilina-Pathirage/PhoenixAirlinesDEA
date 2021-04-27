/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

/**
 *
 * @author Thilina
 */
@WebServlet(name = "addAdmin", urlPatterns = {"/addAdmin"})
public class addAdmin extends HttpServlet {

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
        
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String pwd = request.getParameter("password");
        String pos = request.getParameter("position");
        
        if(pos.equals("admin")){
            if(uname.endsWith("0")){
                
            user us = new user();
                if(us.addAdmin(uname,email,pwd)){
                    out.println("user added successful <a href='./index.jsp'> go back</a>");
                    RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                    rd.include(request, response);
                }
            }else{
                out.println("username should be ends with 0 <a href='./index.jsp'> go back</a>");
                RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                rd.include(request, response);
            }
        }else if(pos.equals("stg1")){
            if(uname.endsWith("1")){
                
            user us = new user();
                if(us.addAdmin(uname,email,pwd)){
                    out.println("user added successful <a href='./index.jsp'> go back</a>");
                    RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                    rd.include(request, response);
                }
            }else{
                out.println("username should be ends with 1 <a href='./index.jsp'> go back</a>");
                RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                rd.include(request, response);
            }
        }else if(pos.equals("stg2")){
            
            if(uname.endsWith("2")){
            user us = new user();
                if(us.addAdmin(uname,email,pwd)){
                    out.println("user added successful <a href='./index.jsp'> go back</a>");
                    RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                    rd.include(request, response);
                }
            }else{
                out.println("username should be ends with 2 <a href='./index.jsp'> go back</a>");
                RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
                rd.include(request, response);
            }
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
