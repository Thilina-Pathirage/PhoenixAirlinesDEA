/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.unameCheck;
import model.upCheck;

/**
 *
 * @author Hiruna
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

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
            out.println("<title>Servlet login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet login at " + request.getContextPath() + "</h1>");
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
        
          PrintWriter out=response.getWriter();
        
        String uname=request.getParameter("uname");
        String pass=request.getParameter("password");
        
        
        out.println(uname);
        out.print(pass);
        
        
            upCheck d=new upCheck();
    
          List blist=d.viewdata(uname);
          
          
       unameCheck b=new unameCheck();
        
       boolean check=b.viewdata(uname);
          
        
         
           
           if(check==true)
           {
                  String passw = ((String) blist.get(2));
                  String namess=((String) blist.get(1));
                  
      
                if(pass.equals(passw))
                {
                      //staff A,B / admin
                       response.sendRedirect("./index.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                }
               
 
               
               
                
              
           }
           else{
               
               
                String msgthree="User name or Password Incorrect";
                request.setAttribute("messagethree",msgthree);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                  
           }
        
           
        
        
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
