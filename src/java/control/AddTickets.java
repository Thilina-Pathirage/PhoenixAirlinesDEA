/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.flights;
import model.tickets;

/**
 *
 * @author Ruchira Kvnd
 */
@WebServlet(name = "AddTickets", urlPatterns = {"/AddTickets"})
public class AddTickets extends HttpServlet {

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
        
        int avSeats= Integer.parseInt(request.getParameter("avseats"));
        String destination = request.getParameter("desti");
        String date = request.getParameter("date");
        int passe = Integer.parseInt(request.getParameter("passe"));
        String Fclass = request.getParameter("Fclass");
        String price = request.getParameter("price");
        String flightId = request.getParameter("flightId");
        String clientID = "1";
         
        tickets tk = new tickets();
        flights fl = new flights();
        
        List seatList = tk.getSeatNumbers(avSeats, passe);
        String seats = "";
       
        Iterator it = seatList.iterator();
        while(it.hasNext()){
            seats = seats + " " +it.next() + "/";
        }
       
       tk.createTicket(flightId,clientID,seats,price,date,destination, Fclass);
       
       fl.updateAVSeats(Fclass, avSeats, passe, flightId);
       
       RequestDispatcher rd = request.getRequestDispatcher("./other/thankyoures.jsp");
       rd.forward(request, response); 
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
