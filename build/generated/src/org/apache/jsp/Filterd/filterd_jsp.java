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
      out.write("        \r\n");
      out.write("        <!-- CSS Links -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../home.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-dark bg-dark navbar-expand-lg\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("            <image src=\"./images/Logo.png\" class=\"nav-logo\"/>\n");
      out.write("            <span class=\"nav-name\"> Phoenix Airlines </span>\n");
      out.write("        </a> \n");
      out.write("        <button\n");
      out.write("          class=\"navbar-toggler\"\n");
      out.write("          type=\"button\"\n");
      out.write("          data-mdb-toggle=\"collapse\"\n");
      out.write("          data-mdb-target=\"#navbarNavAltMarkup\"\n");
      out.write("          aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("          aria-expanded=\"false\"\n");
      out.write("          aria-label=\"Toggle navigation\"\n");
      out.write("        >\n");
      out.write("          <i class=\"fas fa-bars\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavAltMarkup\">\n");
      out.write("          <div class=\"navbar-nav\">\n");
      out.write("            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Flights</a>\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Pricing</a>\n");
      out.write("            <a class=\"nav-link\" href=\"#\">\n");
      out.write("                <i class=\"fas fa-user\"></i>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        \r\n");
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
