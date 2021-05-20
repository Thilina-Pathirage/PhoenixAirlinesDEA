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
import model.addsignData;
import model.unameCheck;


/**
 *
 * @author Hiruna
 */
@WebServlet(name = "signup", urlPatterns = {"/signup"})
public class signup extends HttpServlet {

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
        
              PrintWriter out = response.getWriter();
        
           String uname = request.getParameter("uname");
           String email=request.getParameter("email");
           String password=request.getParameter("password");
           
       unameCheck b=new unameCheck();
        
       boolean check=b.viewdata(uname);
       
        
        // String id=(String) check.get(0);
       //String userid=String.valueOf(id);
       
       if(check==true)
       {
                String msg="username is already taken";
                
                out.println(msg);
               request.setAttribute("messageOne",msg);
               RequestDispatcher rd = request.getRequestDispatcher("./signup.jsp");
               rd.forward(request, response);
       }
         else{
                
           if(uname.endsWith("1") || uname.endsWith("2")  || uname.endsWith("0") ){
               
                String msgtwo="username must contain only characters";
                request.setAttribute("messageTwo",msgtwo);
                RequestDispatcher rd = request.getRequestDispatcher("./signup.jsp");
                rd.forward(request, response);
           }
       
           
           else{
               
               addsignData c = new addsignData();
               c.addData(uname,email,password);
               
           
             //  out.println(password.length()); 
              response.sendRedirect("./login.jsp");
           }
        
        
        
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
