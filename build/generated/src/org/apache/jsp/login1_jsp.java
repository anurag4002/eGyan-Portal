package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOULMS || LOGIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<div class=\"row bg-primary\" >\n");
      out.write("     <div class=\"col-sm-12 \" style=\"height: 1200px; \">\n");
      out.write("         <br/>\n");
      out.write("         <div class=\"row \" >\n");
      out.write("             <div class=\"col-sm-2\"></div>\n");
      out.write("             <div class=\"col-sm-8 mt-5 bg-light rounded\" style=\"height:1070px;\" >\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                     <center><div class=\"col-sm-2 mt-5\">\n");
      out.write("                         <img src=\"images/logo.png\" class=\"  w-100\" alt=\"\" style=\"height:220px;\"/></center></div>\n");
      out.write("                         <div class=\"row\">\n");
      out.write("                             <div class=\"col-sm-12  text-center\" style=\"font-size: 28px;\">Nalanda Open University\n");
      out.write("                             <br/>\n");
      out.write("                             <center style=\"font-size: 18px;\"> NOU E-Gyan Portal</center>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-sm-11  ms-5\">\n");
      out.write("                                 <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header text-primary\" style=\"font-size:21px;\">\n");
      out.write("                                              University\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                              <p class=\"card-text\" style=\"font-size:20px;\">The university admin can login from below mentioned button to monitor the portal, provide access to authorised stake holders & upload study material.</p>\n");
      out.write("                                              <center><a href=\"login.jsp\" class=\"btn btn-primary \" style=\"font-size:20px;\">University Login</a></center>\n");
      out.write("                                            </div>\n");
      out.write("                                          </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"row mt-5 \">\n");
      out.write("                                 <div class=\"col-sm-5 ms-5 me-5\">\n");
      out.write("                                     <div class=\"card\">\n");
      out.write("                                                <h5 class=\"card-header text-primary\">Admin Page</h5>\n");
      out.write("                                                <div class=\"card-body\" >\n");
      out.write("                                                  <p class=\"card-text\" style=\"font-size:19px;\" >The study centres authorised personnel can login from below mentioned button to track students progress, enroll students, schedule assignments & generate reports.</p>\n");
      out.write("                                                  <center><a href=\"#\" class=\"btn btn-primary\"><span class=\"text\">Admin Login</span></a></center>\n");
      out.write("                                                </div>\n");
      out.write("                                              </div>\n");
      out.write("                                 </div>\n");
      out.write("                                 <div class=\"col-sm-5 me-5 ms-5\">\n");
      out.write("                                     <div class=\"card\">\n");
      out.write("                                                <h5 class=\"card-header text-primary\">Student Page</h5>\n");
      out.write("                                                <div class=\"card-body\">\n");
      out.write("                                                  <p class=\"card-text\" style=\"font-size:19px;\">Enrolled students can login from below mentioned button to view the notification by university, access the e-contents, give assignments & track thier progress report.</p>\n");
      out.write("                                                  <center><a href=\"#\" class=\"btn btn-primary\"><span class=\"text\">Student Login</span></a></center>\n");
      out.write("                                                </div>\n");
      out.write("                                              </div>\n");
      out.write("                                 </div>\n");
      out.write("                             </div>\n");
      out.write("                         </div>\n");
      out.write("                 </div>\n");
      out.write("                 </div>\n");
      out.write("             </div>\n");
      out.write("             \n");
      out.write("             <div class=\"col-sm-2\"></div>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("        </body>\n");
      out.write("        </html>\n");
      out.write(" ");
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
