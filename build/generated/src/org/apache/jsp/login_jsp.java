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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        \n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        <!-- MDB -->\n");
      out.write("        <link\n");
      out.write("          href=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.css\"\n");
      out.write("          rel=\"stylesheet\"\n");
      out.write("        />\n");
      out.write("        \n");
      out.write("        <!-- MDB -->\n");
      out.write("        <script\n");
      out.write("          type=\"text/javascript\"\n");
      out.write("          src=\"https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.3.0/mdb.min.js\"\n");
      out.write("        ></script>\n");
      out.write("        \n");
      out.write("        <!-- CSS Links -->\n");
      out.write("           \n");
      out.write("     <style>\n");
      out.write("    .nav-logo{\n");
      out.write("    width: 25px;\n");
      out.write("    margin-left: 5px;}\n");
      out.write("    \n");
      out.write("    \n");
      out.write(".loginfrm{\n");
      out.write("  \n");
      out.write("     padding: 20px;\n");
      out.write("    margin: 20px;\n");
      out.write("    border-radius: 14px;\n");
      out.write("   \n");
      out.write("    box-shadow: 3px 3px 25px 5px rgba(0,0,0,0.4);\n");
      out.write("    \n");
      out.write("    height: auto;\n");
      out.write("    padding: 60px 60px 60px 60px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".new{\n");
      out.write("    width: 100%;\n");
      out.write("    height: auto;\n");
      out.write("    background-image: url(\"./images/loginphoto.jpg\");\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("   font-weight: 700;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"new\">\n");
      out.write("           \n");
      out.write("          <nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                    <image src=\"./images/Logo.png\" class=\"nav-logo\"/>\n");
      out.write("                    <span class=\"nav-name\"> Phoenix Airlines </span>\n");
      out.write("                </a> \n");
      out.write("                <button\n");
      out.write("                  class=\"navbar-toggler\"\n");
      out.write("                  type=\"button\"\n");
      out.write("                  data-mdb-toggle=\"collapse\"\n");
      out.write("                  data-mdb-target=\"#navbarNavAltMarkup\"\n");
      out.write("                  aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("                  aria-expanded=\"false\"\n");
      out.write("                  aria-label=\"Toggle navigation\"\n");
      out.write("                >\n");
      out.write("                  <i class=\"fas fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\n");
      out.write("                  <div class=\"navbar-nav\">\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"./index.jsp\">Home</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Flights</a>\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("                      <a class=\"nav-link\" href=\"./signup.jsp\">Sign Up</a>\n");
      out.write("                    \n");
      out.write("                    </a>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      <!--Sigjn Up Form-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("\n");
      out.write("   <br> <br> <br>\n");
      out.write("      <center>\n");
      out.write("      <div class=\"col-sm-9 col-lg-4 col-md-7\">\n");
      out.write("          \n");
      out.write("        <div class=\"loginfrm\">\n");
      out.write("            \n");
      out.write("            <form action=\"./login\" method=\"POST\">\n");
      out.write("        <br>\n");
      out.write("        <h2>Sign In</h2><br>\n");
      out.write("        \n");
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
       
            
            
            
            
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("               \n");
      out.write("                    <div class=\"input-group flex-nowrap\">\n");
      out.write("  <span class=\"input-group-text\" id=\"addon-wrapping\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("  <input type=\"text\" class=\"form-control\"  placeholder=\"username\" aria-label=\"Username\" name=\"uname\"\n");
      out.write("         aria-describedby=\"addon-wrapping\" />\n");
      out.write("  \n");
      out.write("  \n");
      out.write("          \n");
      out.write("       \n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("       \n");
      out.write("                          \n");
      out.write("                           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                              <div class=\"input-group flex-nowrap\">\n");
      out.write("  <span class=\"input-group-text\" id=\"addon-wrapping\"><i class=\"fas fa-unlock-alt\"></i></span>\n");
      out.write("  <input type=\"password\" class=\"form-control\" placeholder=\"password\" aria-label=\"Username\"\n");
      out.write("    aria-describedby=\"addon-wrapping\" name=\"password\" />\n");
      out.write("     \n");
      out.write("</div>\n");
      out.write("                     <p style=\"color: red;\"> ");
      out.print(rk);
      out.write("</p>\n");
      out.write("                           <p style=\"color: red;\"> ");
      out.print(rs);
      out.write("</p>   \n");
      out.write("   \n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                          <span>Haven’t created an account yet?</span><a href=\"./signup.jsp\">sign up</a>  \n");
      out.write("  \n");
      out.write("                          <br><br>\n");
      out.write("\n");
      out.write("  <!-- Submit button -->\n");
      out.write("  <button type=\"submit\" class=\"btn btn-dark btn-block mb-4\">Sign in</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("                     </center>\n");
      out.write("                        <br> <br> <br> <br> <br> <br>\n");
      out.write("    </div>\n");
      out.write("                   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("            \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
