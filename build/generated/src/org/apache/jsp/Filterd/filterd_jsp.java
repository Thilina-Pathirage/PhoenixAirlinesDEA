package org.apache.jsp.Filterd;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import model.dbcon;

public final class filterd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Filterd/../navbar.jsp");
  }

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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("         <!-- Font Awesome -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("        />\r\n");
      out.write("        \r\n");
      out.write("        <!-- MDB -->\r\n");
      out.write("        <script\r\n");
      out.write("          type=\"text/javascript\"\r\n");
      out.write("          src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"\r\n");
      out.write("        ></script>\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    .nav-logo{\r\n");
      out.write("    width: 25px;\r\n");
      out.write("    margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("            <image src=\"./images/Logo.png\" class=\"nav-logo\"/>\r\n");
      out.write("            <span class=\"nav-name\"> Phoenix Airlines </span>\r\n");
      out.write("        </a> \r\n");
      out.write("        <button\r\n");
      out.write("          class=\"navbar-toggler\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          data-mdb-toggle=\"collapse\"\r\n");
      out.write("          data-mdb-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("          aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("          aria-expanded=\"false\"\r\n");
      out.write("          aria-label=\"Toggle navigation\"\r\n");
      out.write("        >\r\n");
      out.write("          <i class=\"fas fa-bars\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("          <div class=\"navbar-nav\">\r\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Flights</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                <i class=\"fas fa-user\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");

        String avSeats= (String) request.getAttribute("AVseats");
        String destination = (String) request.getAttribute("Destination");
        String date = (String) request.getAttribute("date");
        String passe = (String) request.getAttribute("passen");
        String Fclass = (String) request.getAttribute("class");
        String totPrice = (String) request.getAttribute("totPrice");
        String FlightId =(String) request.getAttribute("flightID");
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <h5 class=\"card-header\">Total Price ");
      out.print(totPrice);
      out.write("$</h5>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">Sri Lanka to ");
      out.print(destination);
      out.write("</h5>\r\n");
      out.write("                          <p class=\"card-text\">\r\n");
      out.write("                            With supporting text below as a natural lead-in to additional content.\r\n");
      out.write("                          </p>\r\n");
      out.write("                          <form action=\"./AddTickets\" method=\"POST\">\r\n");
      out.write("                              <input type=\"hidden\" name=\"avseats\" value=\"");
      out.print(avSeats);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"desti\" value=\"");
      out.print(destination);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"date\" value=\"");
      out.print(date);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"passe\" value=\"");
      out.print(passe);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"Fclass\" value=\"");
      out.print(Fclass);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"price\" value=\"");
      out.print(totPrice);
      out.write("\" />\r\n");
      out.write("                              <input type=\"hidden\" name=\"flightId\" value=\"");
      out.print(FlightId);
      out.write("\" />\r\n");
      out.write("                              \r\n");
      out.write("                              <input type=\"submit\" class=\"btn btn-primary\" value=\"Book your Ticket Now\">\r\n");
      out.write("                          </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                          \r\n");
      out.write("                    <div class=\"col-lg-6\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print(date);
      out.write("</h5>\r\n");
      out.write("                          <p class=\"card-text\">\r\n");
      out.write("                              <strong>Seats:</strong> ");
      out.print(passe);
      out.write(" seats from ");
      out.print(avSeats);
      out.write(" seats\r\n");
      out.write("                              \r\n");
      out.write("                          </p>\r\n");
      out.write("                          <p>\r\n");
      out.write("                              <strong>Class:</strong> ");
      out.print(Fclass);
      out.write("\r\n");
      out.write("                          </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
