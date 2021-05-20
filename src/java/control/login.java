package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.tickets;
import model.unameCheck;
import model.upCheck;
import model.user;

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
        
    
        
          upCheck d=new upCheck();
    
          List blist=d.viewdata(uname);
          
          
       unameCheck b=new unameCheck();
        
       boolean check=b.viewdata(uname);
       tickets tc = new tickets();
       
          
        
         
           
           if(check==true)
           {
                  String passw = ((String) blist.get(3));
                  String namess=((String) blist.get(1));
                  String mail = ((String) blist.get(2));
                  String id = ((String)blist.get(0));
                  
                  String cTime =(new java.util.Date()).toLocaleString();
                  String ip = request.getRemoteAddr();
              
             
              List tlist = null;
              try {
                   if (tc.checkTicket(id))
              {
                  tlist = tc.getTicket(id);
                  
              }
                   else
                   {
                       tlist = null;
                   }
              } catch (SQLException ex) {
                  Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
              }
              
            
              
              Cookie ck = new Cookie("uname",namess);
              response.addCookie(ck);
             
              HttpSession session = request.getSession();
              session.setAttribute("user",namess);
              HttpSession session2 = request.getSession();
              session2.setAttribute("mail", mail);
              HttpSession session3 = request.getSession();
              session3.setAttribute("last", cTime);
              HttpSession session4 = request.getSession();
              session4.setAttribute("ip", ip);
              HttpSession session5 = request.getSession();
              session5.setAttribute("id", id);
              
              
          if(tlist==null)
          {
            if(uname.endsWith("0")){    
      
                if(pass.equals(passw))
                {
                      //staff A,B / admin
                    user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Admin/admin.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                }
              }
              else if(uname.endsWith("1"))
              {
                 if(pass.equals(passw))
                {
                      //staff A,B / admin
                    user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Staff/staff.jsp");
                       out.println("Login Sucsess !!!");
                }
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                } 
              }
              else if (uname.endsWith("2"))
              {
                 if(pass.equals(passw))
                {       
                        
                    user  u = new user();
                    u.updateUser(namess, cTime, ip);
                    response.sendRedirect("./Staff/staff2.jsp");
                    out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                    request.setAttribute("messagefour",msgfour);
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }  
              }
              else
              {
                  if(pass.equals(passw))
                {
                      //staff A,B / admin
                        user  u = new user();
                        u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Profile/profile.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                } 
              }
  
           }
           
          
          else
          {
              
              String tickect = ((String)tlist.get(0));
              String flight = ((String)tlist.get(1));
              String seat = ((String)tlist.get(2));
              String price = ((String)tlist.get(3));
              String date = ((String)tlist.get(4));
              String desti = ((String)tlist.get(5));
              String cls = ((String)tlist.get(6));
              
              //HttpSession session6 = request.getSession();
              //session.setAttribute("ticket",tickect);
              request.setAttribute("ticket",tickect);
              //HttpSession session7 = request.getSession();
              request.setAttribute("flight", flight);
              //HttpSession session8 = request.getSession();
              request.setAttribute("seat", seat);
              //HttpSession session9 = request.getSession();
              request.setAttribute("price", price);
              //HttpSession session10 = request.getSession();
              request.setAttribute("date",date);
              //HttpSession session11 = request.getSession();
              request.setAttribute("desti", desti);
              //HttpSession session12 = request.getSession();
              request.setAttribute("cls", cls);
             
             
          
         
                   
                  
              if(uname.endsWith("0")){    
      
                if(pass.equals(passw))
                {
                      //staff A,B / admin
                        user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Admin/admin.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                }
              }
              else if(uname.endsWith("1"))
              {
                 if(pass.equals(passw))
                {
                      //staff A,B / admin
                    user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Staff/staff.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                } 
              }
              else if (uname.endsWith("2"))
              {
                 if(pass.equals(passw))
                {
                      //staff A,B / admin
                    user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Staff/staff2.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                }  
              }
              else
              {
                  if(pass.equals(passw))
                {
                      //staff A,B / admin
                        user  u = new user();
                    u.updateUser(namess, cTime, ip);
                       response.sendRedirect("./Profile/profile.jsp");
                       out.println("Login Sucsess !!!");
                }
                
                else{
                    String msgfour="User name or Password Incorrect";
                  
                request.setAttribute("messagefour",msgfour);
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
                } 
              }
 
               
               
                
              
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