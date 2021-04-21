/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.flights;
import model.prices;

/**
 *
 * @author User
 */
@WebServlet(name = "SearchFlight", urlPatterns = {"/SearchFlight"})
public class SearchFlight extends HttpServlet {

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
        String desti = request.getParameter("destination");
        String pass = request.getParameter("passengers");
        String Fclass = request.getParameter("class");
        String date = request.getParameter("departDate");
        
        flights sf = new flights();
        prices gp = new prices();
        
            try {
            List Sresults = sf.searchFlight(desti);
            List Plist = gp.getPrice(desti, Fclass);
            float priceForEach = Float.parseFloat((String) Plist.get(3));
            float totPrice = priceForEach * Float.parseFloat(pass);
            String StotPrice = String.valueOf(totPrice);
                       
            if(Fclass.equals("firstclass")){
                int avSeats = Integer.parseInt((String) Sresults.get(1));
                if(avSeats != 0){
                    request.setAttribute("flightID", Sresults.get(0));
                    request.setAttribute("AVseats", Sresults.get(1));
                    request.setAttribute("Destination", Sresults.get(4));
                    request.setAttribute("passen", pass);
                    request.setAttribute("class", Fclass);
                    request.setAttribute("date", date);
                    request.setAttribute("totPrice", StotPrice);

                    RequestDispatcher rd = request.getRequestDispatcher("./Filterd/filterd.jsp");
                    rd.forward(request, response);
            
            }else{
            out.println("Sorry..! flights not avalable!");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
            }  
            }else if(Fclass.equals("businessclass")){
                int avSeats = Integer.parseInt((String) Sresults.get(2));
                if(avSeats != 0){
                    request.setAttribute("flightID", Sresults.get(0));
                    request.setAttribute("AVseats", Sresults.get(2));
                    request.setAttribute("Destination", Sresults.get(4));
                    request.setAttribute("passen", pass);
                    request.setAttribute("class", Fclass);
                    request.setAttribute("date", date);
                    request.setAttribute("totPrice", StotPrice);

                    RequestDispatcher rd = request.getRequestDispatcher("./Filterd/filterd.jsp");
                    rd.forward(request, response);
            
            }else{
            out.println("Sorry..! flights not avalable!");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
            }  
            }else if(Fclass.equals("economyclass")){
                int avSeats = Integer.parseInt((String) Sresults.get(3));
                if(avSeats != 0){
                    request.setAttribute("flightID", Sresults.get(0));
                    request.setAttribute("AVseats", Sresults.get(3));
                    request.setAttribute("Destination", Sresults.get(4));
                    request.setAttribute("passen", pass);
                    request.setAttribute("class", Fclass);
                    request.setAttribute("date", date);
                    request.setAttribute("totPrice", StotPrice);

                    RequestDispatcher rd = request.getRequestDispatcher("./Filterd/filterd.jsp");
                    rd.forward(request, response);
              
            }else{
                out.println("Sorry..! flights not avalable!");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
            }
            }else{               
                out.println("Sorry..! Smoething went wrong");
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.include(request, response);
            }
            
            } catch (SQLException ex) {
                Logger.getLogger(SearchFlight.class.getName()).log(Level.SEVERE, null, ex);
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
