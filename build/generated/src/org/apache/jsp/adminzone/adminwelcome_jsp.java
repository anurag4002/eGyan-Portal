package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connect.DbManager;

public final class adminwelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/adminzone/adminlinkmaster.jsp");
    _jspx_dependants.add("/adminzone/adminheadermaster.jsp");
    _jspx_dependants.add("/adminzone/adminfootermaster.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOULMS || HOME</title>\n");
      out.write("        ");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"js/bootstrap.bundle.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css\" integrity=\"sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Headline start =================================================================================================================================-->   \n");
      out.write("            \n");
      out.write("<div class=\"row bg-danger text-light\">\n");
      out.write("    <div class=\"col-sm-4\">\n");
      out.write("        Welcome to Admin Zone\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            \n");
      out.write("           ");
      out.print(new DbManager().getDate()  );
      out.write("\n");
      out.write("</div>\n");
      out.write(" <div class=\"col-sm-4\">\n");
      out.write("            Admin\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("<!-- Headline end================================================================================================================================================-->\n");
      out.write("                \n");
      out.write("<!-- Header start================================================================================================================================================--->\n");
      out.write("                \n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-1\">\n");
      out.write("        <img src=\"images/logo.png\" class=\"logo\"/>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-7\">\n");
      out.write("        <h4 class=\"text-danger pt-4\"><b>Nalanda eGyan Portal</b></h4>\n");
      out.write("        <p>(An Inititative Taken By Nalanda Open University)</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-4 \">\n");
      out.write("        <ul class=\"smi text-center mt-4\">\n");
      out.write("            <li><i class=\"fa-brands fa-facebook-f\"></i></li>\n");
      out.write("            <li><i class=\"fa-brands fa-instagram\"></i></li>\n");
      out.write("            <li><i class=\"fa-brands fa-whatsapp\"></i></li>\t\t\t\t\t  \n");
      out.write("            <li><i class=\"fa-brands fa-twitter\"></i></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Header end ==================================================================================================================================================-->\n");
      out.write("                \n");
      out.write("<!--Navbar start ================================================================================================================================================-->\n");
      out.write("\n");
      out.write("<div class=\"row border\">\n");
      out.write("    <div class=\"col-sm-12  p-0\" >\n");
      out.write("        <nav class=\"navbar navbar-expand-lg \" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\" style=\"color:#000035\"s><b>NOULMS</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedCsontent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\" >\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"adminwelcome.jsp\"><b>Dashboard</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                         <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"notification.jsp\"><b>Notification</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" ><b>Course</b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"course.jsp\" ><b>Courses</b></a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"studycenter.jsp\" ><b>Study Center</b></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"feedback.jsp\" ><b>feedback</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"complaint.jsp\" ><b>Complaint</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"studentlist.jsp\" ><b>studentlist</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"changepassword.jsp\" ><b>Change Password</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"logout.jsp\" ><b>Logout</b></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar end==================================================================================================================================================-->\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--notification box--------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12  mb-5 mt-5\">\n");
      out.write("        <h3><b>Welcome ! Adminzone</b></h3>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--footer=============================================================================------------------------------------>\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row bfooter text-light   text-center \">\n");
      out.write("            <div class=\"col-sm-6  \"><h6>@ 2020 Course All Rights Reserved</h6></div>\n");
      out.write("            <div class=\"col-sm-6 \">Developed By : Anurag Mishra</div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("                  \n");
      out.write("<!-- end footer==================================================================================================================================================-->\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write(" </body>\n");
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
