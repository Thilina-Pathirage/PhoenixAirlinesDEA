package org.apache.jsp.Staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.dbcon;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class staff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <!-- CSS Links -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../home.css\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <script\r\n");
      out.write("          type=\"text/javascript\"\r\n");
      out.write("          src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("        \r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                    <image src=\"../images/Logo.png\" style=\"width: 25px; margin-left: 5px;\" class=\"nav-logo\"/>\r\n");
      out.write("                    <span class=\"nav-name\"> Phoenix Airlines </span>\r\n");
      out.write("                </a> \r\n");
      out.write("                <button\r\n");
      out.write("                  class=\"navbar-toggler\"\r\n");
      out.write("                  type=\"button\"\r\n");
      out.write("                  data-mdb-toggle=\"collapse\"\r\n");
      out.write("                  data-mdb-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("                  aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("                  aria-expanded=\"false\"\r\n");
      out.write("                  aria-label=\"Toggle navigation\"\r\n");
      out.write("                >\r\n");
      out.write("                  <i class=\"fas fa-bars\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("                  <div class=\"navbar-nav\">\r\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">Home</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Flights</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"login.jsp\">Login</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                        <i class=\"fas fa-user\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"d-flex justify-content-center\">\r\n");
      out.write("            <br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div style=\"text-align: center\" class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <h1 style=\"font-weight: bolder;\">Staff Grade One Dashboard</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row d-flex justify-content-center\">\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("                <br> <br>\r\n");
      out.write("    <center><h1>Flight Details</h1></center> <form action=\"../addflight\">\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("    <br>\r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <thead class=\"table-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>FlightID</th>\r\n");
      out.write("                    <th>Seats 1st Class</th>\r\n");
      out.write("                    <th>Seats 2nd Class</th>\r\n");
      out.write("                    <th>Seats 3rd Class</th>\r\n");
      out.write("                    <th>Destination</th>\r\n");
      out.write("                    <th>Date</th>\r\n");
      out.write("                    <th>Delete</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            \r\n");
      out.write("            ");

            try{
            dbcon con = new dbcon();
            statement =con.connection().createStatement();
            String sql = "SELECT * FROM flights";
            resultSet = statement.executeQuery(sql);
            
            while(resultSet.next()){
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("flightid"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("firstclass"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("businessclass"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("economyclass"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("destination"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"../deleteFlight\" method=\"POST\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"flightid\" value=\"");
      out.print(resultSet.getString("flightid"));
      out.write("\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Delete\" class=\"btn btn-dark\"/>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    \r\n");
      out.write("    <br> \r\n");
      out.write("    <br>\r\n");
      out.write("    <hr>\r\n");
      out.write("            <div class=\"col-xl-12\">\r\n");
      out.write("             <div class=\"card\" style=\" margin: 30px; height: 420px\">\r\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\"><strong>Update Flight</strong></h5>\r\n");
      out.write("                    <br>\r\n");
      out.write("                  \r\n");
      out.write("                  <form action=\"../updateFlight\" method=\"POST\">\r\n");
      out.write("                      Flight ID\r\n");
      out.write("                      <input type=\"text\" class=\"form-control\" placeholder=\"12003\" aria-label=\"flightid\" aria-describedby=\"addon-wrapping\" name=\"flightid\" /> <br>\r\n");
      out.write("                      Destination\r\n");
      out.write("                      <select name=\"destination\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("                          <option value=\"\">Select</option>\r\n");
      out.write("                          <option value=\"india\">Sri Lanka - India</option>\r\n");
      out.write("                          <option value=\"dubai\">Sri Lanka - Dubai</option>\r\n");
      out.write("                          <option value=\"Australia\">Sri Lanka - Australia</option>\r\n");
      out.write("                      </select> <br>\r\n");
      out.write("                      Date\r\n");
      out.write("                      <input type=\"date\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"date\" /> <br>\r\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Update\"/><br>\r\n");
      out.write("                      \r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("             </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    \r\n");
      out.write("    <br>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <br>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"col-xl-12\">\r\n");
      out.write("             <div class=\"card\" style=\" margin: 30px; height: 380px\">\r\n");
      out.write("                <div class=\"bg-image hover-overlay ripple\" data-mdb-ripple-color=\"light\">\r\n");
      out.write("<!--                  <img\r\n");
      out.write("                    src=\"./images/20382870.jpg\"\r\n");
      out.write("                    class=\"img-fluid\"\r\n");
      out.write("                  />-->\r\n");
      out.write("                    <div class=\"mask\" style=\"background-color: rgba(251, 251, 251, 0.15)\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\"><strong>Add New Flight</strong></h5>\r\n");
      out.write("                  <p class=\"card-text\">\r\n");
      out.write("                    We a happy to see the your face in our flights\r\n");
      out.write("                  </p>\r\n");
      out.write("                  <form action=\"../addFlight\" method=\"POST\">\r\n");
      out.write("                      Destination\r\n");
      out.write("                      <select name=\"destination\" class=\"form-select\" aria-label=\"Default select example\">\r\n");
      out.write("                          <option value=\"\">Select</option>\r\n");
      out.write("                          <option value=\"india\">Sri Lanka - India</option>\r\n");
      out.write("                          <option value=\"dubai\">Sri Lanka - Dubai</option>\r\n");
      out.write("                          <option value=\"Australia\">Sri Lanka - Australia</option>\r\n");
      out.write("                      </select> <br>\r\n");
      out.write("                      Date\r\n");
      out.write("                      <input type=\"date\" class=\"form-control\"  aria-label=\"Username\" aria-describedby=\"addon-wrapping\" name=\"date\" /> <br>\r\n");
      out.write("                      <input type=\"submit\" class=\"btn btn-primary\" value=\"Add\"/>\r\n");
      out.write("                  </form>\r\n");
      out.write("                </div>\r\n");
      out.write("             </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    <hr>\r\n");
      out.write("    <br>\r\n");
      out.write("                  \r\n");
      out.write("    <center><h1>Ticket Details</h1></center>\r\n");
      out.write("    <br>\r\n");
      out.write("             \r\n");
      out.write("        <table class=\"table\">\r\n");
      out.write("            <thead class=\"table-dark\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>TiketID</th>\r\n");
      out.write("                    <th>FlightID</th>\r\n");
      out.write("                    <th>ClientID</th>\r\n");
      out.write("                    <th>Seat Numbers</th>\r\n");
      out.write("                    <th>Price</th>\r\n");
      out.write("                    <th>Date</th>\r\n");
      out.write("                    <th>Destination</th>\r\n");
      out.write("                    <th>Class</th>\r\n");
      out.write("                    <th>Delete</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            \r\n");
      out.write("            ");

            statement =con.connection().createStatement();
            String sql2 = "SELECT * FROM tiskets";
            resultSet = statement.executeQuery(sql2);

            while(resultSet.next()){
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("ticketid"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("flightid"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("clientid"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("seatno"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("date"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("destination"));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(resultSet.getString("class"));
      out.write("</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <form action=\"../deleteTicket\" method=\"POST\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"tiketid\" value=\"");
      out.print(resultSet.getString("ticketid"));
      out.write("\">\r\n");
      out.write("                            <input type=\"submit\" value=\"Delete\" class=\"btn btn-dark\"/>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </tbody>\r\n");
      out.write("            \r\n");
      out.write("            ");

                }
            connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }      
            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"container-fluid footer\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: center;color: white\">\r\n");
      out.write("                   <image src=\"../images/logo2.jpg\" class=\"footer-logo\"/>\r\n");
      out.write("                   <h6>Phoenix Airlines</h6>\r\n");
      out.write("                   <p>Find islands' best offers with SriLankan Holidays</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\"><br>\r\n");
      out.write("                    <form>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Email input -->\r\n");
      out.write("                        <div>\r\n");
      out.write("                          <label style=\"color: white\">Email address</label>\r\n");
      out.write("                          <input type=\"email\"  class=\"dropdown\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Message input -->\r\n");
      out.write("                        <div>\r\n");
      out.write("                          <label style=\"color: white\">Message</label>\r\n");
      out.write("                          <textarea class=\"dropdown\"  rows=\"2\"></textarea>\r\n");
      out.write("                        </div><br>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Submit button -->\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-light btn-block mb-4\" style=\"width: 200px\">Send</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-lg-4 col-sm-12\" style=\"text-align: right; color: white;padding: 40px 70px 0px 0px\">\r\n");
      out.write("                    <p>+94 152 524 45 &nbsp;<i class=\"fas fa-phone\"></i></p>\r\n");
      out.write("                    <p>phoenixairlines@gmail.com &nbsp;<i class=\"fas fa-envelope-square\"></i></p>\r\n");
      out.write("                    <p>NO.25, Pitipana South , Homagama &nbsp; <i class=\"fas fa-home\"></i></p><br><br>\r\n");
      out.write("                    <span><i class=\"fab fa-facebook fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-twitter fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-linkedin fa-2x\"></i>&nbsp;&nbsp;<i class=\"fab fa-instagram fa-2x\"></i></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <center><p style=\"color: white\"><i class=\"fas fa-copyright\"></i> copyright phoenix airlines 2021</p></center>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
