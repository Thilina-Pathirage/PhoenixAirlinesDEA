package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
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
      out.write("        <!-- CSS Links -->\r\n");
      out.write("           \r\n");
      out.write("     <style>\r\n");
      out.write("    .nav-logo{\r\n");
      out.write("    width: 25px;\r\n");
      out.write("    margin-left: 5px;}\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(".loginfrm{\r\n");
      out.write("  \r\n");
      out.write("     padding: 20px;\r\n");
      out.write("    margin: 20px;\r\n");
      out.write("    border-radius: 14px;\r\n");
      out.write("   \r\n");
      out.write("    box-shadow: 3px 3px 25px 5px rgba(0,0,0,0.4);\r\n");
      out.write("    \r\n");
      out.write("    height: auto;\r\n");
      out.write("    padding: 60px 60px 60px 60px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".new{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: auto;\r\n");
      out.write("    background-image: url(\"./images/loginphoto.jpg\");\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2{\r\n");
      out.write("   font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"new\">\r\n");
      out.write("           \r\n");
      out.write("          <nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("                    <image src=\"./images/Logo.png\" class=\"nav-logo\"/>\r\n");
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
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"./index.jsp\">Home</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Flights</a>\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Pricing</a>\r\n");
      out.write("                      <a class=\"nav-link\" href=\"./signup.jsp\">Sign Up</a>\r\n");
      out.write("                    \r\n");
      out.write("                    </a>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("  \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("      <!--Sigjn Up Form-->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <!-- Button trigger modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("\r\n");
      out.write("   <br> <br> <br>\r\n");
      out.write("      <center>\r\n");
      out.write("      <div class=\"col-sm-9 col-lg-4 col-md-7\">\r\n");
      out.write("          \r\n");
      out.write("        <div class=\"loginfrm\">\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"./login\" method=\"POST\">\r\n");
      out.write("        <br>\r\n");
      out.write("        <h2>Sign In</h2><br>\r\n");
      out.write("        \r\n");
      out.write("        ");

               String rs=(String)request.getAttribute("messagethree");
           if(rs==null)
           {
                    rs="";
           }
           
         String rk=(String)request.getAttribute("messagefour");
           if(rk==null)
           {
                    rk="";
           }
       
            
            
            
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("               \r\n");
      out.write("                    <div class=\"input-group flex-nowrap\">\r\n");
      out.write("  <span class=\"input-group-text\" id=\"addon-wrapping\"><i class=\"fas fa-user\"></i></span>\r\n");
      out.write("  <input type=\"text\" class=\"form-control\"  placeholder=\"username\" aria-label=\"Username\" name=\"uname\"\r\n");
      out.write("         aria-describedby=\"addon-wrapping\" />\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("          \r\n");
      out.write("       \r\n");
      out.write("</div>\r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("                          \r\n");
      out.write("                           \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("                    <br>\r\n");
      out.write("                    \r\n");
      out.write("                              <div class=\"input-group flex-nowrap\">\r\n");
      out.write("  <span class=\"input-group-text\" id=\"addon-wrapping\"><i class=\"fas fa-unlock-alt\"></i></span>\r\n");
      out.write("  <input type=\"password\" class=\"form-control\" placeholder=\"password\" aria-label=\"Username\"\r\n");
      out.write("    aria-describedby=\"addon-wrapping\" name=\"password\" />\r\n");
      out.write("     \r\n");
      out.write("</div>\r\n");
      out.write("                     <p style=\"color: red;\"> ");
      out.print(rk);
      out.write("</p>\r\n");
      out.write("                           <p style=\"color: red;\"> ");
      out.print(rs);
      out.write("</p>   \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("                            <br>\r\n");
      out.write("                          <span>Haven’t created an account yet?</span><a href=\"./signup.jsp\">sign up</a>  \r\n");
      out.write("  \r\n");
      out.write("                          <br><br>\r\n");
      out.write("\r\n");
      out.write("  <!-- Submit button -->\r\n");
      out.write("  <button type=\"submit\" class=\"btn btn-dark btn-block mb-4\">Sign in</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("                     </center>\r\n");
      out.write("                        <br> <br> <br> <br> <br> <br>\r\n");
      out.write("    </div>\r\n");
      out.write("                   \r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("    \r\n");
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
