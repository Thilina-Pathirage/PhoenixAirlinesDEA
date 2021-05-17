package org.apache.jsp.Profile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.tickets;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
 
    
        String uname= (String)session.getAttribute("user");
        if(uname!=null){
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./profile.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../home.css\">\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <style>\r\n");
      out.write("    .nav-logo{\r\n");
      out.write("    width: 25px;\r\n");
      out.write("    margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("            <image src=\"../images/Logo.png\" class=\"nav-logo\"/>\r\n");
      out.write("            <span class=\"nav-name\"> Phoenix Airlines </span>\r\n");
      out.write("        </a> \r\n");
      out.write("        <button\r\n");
      out.write("          class=\"navbar-toggler\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          data-mdb-toggle=\"collapse\"\r\n");
      out.write("          data-mdb-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("          aria-controls=\"navbarNavAltMarkup\"\r\n");
      out.write("         \r\n");
      out.write("          aria-label=\"Toggle navigation\"\r\n");
      out.write("        >\r\n");
      out.write("          <i class=\"fas fa-bars\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("          <div class=\"navbar-nav\">\r\n");
      out.write("            <a class=\"nav-link \" href=\"../index.jsp\">Home</a>\r\n");
      out.write("            <a class=\"nav-link active\" href=\"#\">Flights</a>\r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("            <form action=\"../logout\" method=\"POST\">\r\n");
      out.write("                <input type=\"submit\" value=\"Log Out\" style=\"color:black;border-radius:20px;background-color: white;margin: 5px 5px 0px 5px\"></form> \r\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\r\n");
      out.write("                <i class=\"fas fa-user\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
 
String name= (String)session.getAttribute("user");
String mail= (String)session.getAttribute("mail");
String last= (String)session.getAttribute("last");
String ip= (String)session.getAttribute("ip");

              String tickect =(String) request.getAttribute("ticket");
              String flight =(String) request.getAttribute("flight");
              String seat = (String) request.getAttribute("seat");
              String price = (String) request.getAttribute("price");
              String date = (String) request.getAttribute("date");
              String desti = (String) request.getAttribute("desti");
              String cls = (String) request.getAttribute("cls");



      out.write("\r\n");
      out.write("       <div class=\"prof\">\r\n");
      out.write("           <center><h1>Welcome ");
      out.print( name);
      out.write(" ... </h1>\r\n");
      out.write("           <h5>Profile details</h5></center>\r\n");
      out.write("           <br> \r\n");
      out.write("           <div class=\"row\"><center>\r\n");
      out.write("               <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                   <table class=\"table \" style=\"text-align:center;\">\r\n");
      out.write("                       <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                          <th scope=\"col\">User Name</th>\r\n");
      out.write("                          <th scope=\"col\">");
      out.print( name );
      out.write("</th>\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                     \r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                          <th scope=\"col\">E mail</th>\r\n");
      out.write("                          <th scope=\"col\">");
      out.print( mail);
      out.write("</th>\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                      \r\n");
      out.write("                      \r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                          <th scope=\"col\">Last Login</th>\r\n");
      out.write("                          <th scope=\"col\">");
      out.print( last);
      out.write("</th>\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                      \r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                          <th scope=\"col\">IP Address</th>\r\n");
      out.write("                          <th scope=\"col\">");
      out.print( ip);
      out.write("</th>\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                      \r\n");
      out.write("                   </table>\r\n");
      out.write("                          <br>\r\n");
      out.write("                   <h5>Profile details</h5></center>\r\n");
      out.write("           <br> \r\n");
      out.write("                   <table class=\"table \" style=\"text-align:center;\">\r\n");
      out.write("                       <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                          \r\n");
      out.write("                          <th scope=\"col\">User Name</th>\r\n");
      out.write("                          <th scope=\"col\">Flight</th>\r\n");
      out.write("                          <th scope=\"col\">Seats</th>\r\n");
      out.write("                          <th scope=\"col\">Price</th>\r\n");
      out.write("                          <th scope=\"col\">Date</th>\r\n");
      out.write("                          <th scope=\"col\">Destination</th>\r\n");
      out.write("                          <th scope=\"col\">Class</th>\r\n");
      out.write("                          \r\n");
      out.write("                        </tr>\r\n");
      out.write("                      </thead>\r\n");
      out.write("                      <tr>\r\n");
      out.write("                          <td>");
      out.print( name );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( flight );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( seat );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( price );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( date );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( desti );
      out.write("</td>\r\n");
      out.write("                          <td>");
      out.print( cls );
      out.write("</td>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                      \r\n");
      out.write("                   </table>\r\n");
      out.write("                   \r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("           </div>\r\n");
      out.write("      \r\n");
      out.write("               \r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid footer\" >\r\n");
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
      out.write("            <center><p style=\"color: white;margin: 10px\"><i class=\"fas fa-copyright\"></i> copyright phoenix airlines 2021</p></center><br>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
 }else{
            
            response.sendRedirect("../login.jsp");
        }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
