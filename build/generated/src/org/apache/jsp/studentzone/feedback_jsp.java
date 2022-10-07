package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/studentzone/studentlinkmaster.jsp");
    _jspx_dependants.add("/studentzone/studentheadermaster.jsp");
    _jspx_dependants.add("/studentzone/studentfootermaster.jsp");
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
      out.write("\n");
      out.write("<!-- \n");
      out.write("Student zone -> feedback form \n");
      out.write("--->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOULMS || FEEDBACK</title>\n");
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
      out.write("        Welcome to Student Zone\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("        ");
      out.print(new DbManager().getDate() );
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            ");
      out.print(session.getAttribute("studentid") );
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
      out.write("<div class=\"row  border\">\n");
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
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"welcome.jsp\"><b>Dashboard</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"feedback.jsp\"><b>Feedback</b></a>\n");
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
      out.write("                            <a class=\"nav-link\" href=\"complaint.jsp\" ><b>Complaint</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"changepassword.jsp\" ><b>Changes Password</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"logout.jsp\" ><b>Log out</b></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
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
      out.write("<!--Feedback Form ==============================================================================================================----->\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12 \">\n");
      out.write("        <form action=\"feedback.jsp\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <div class=\"row mt-5\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4 bg-danger text-light shadow rounded\">\n");
      out.write("                            <h3 class=\"text-center mb-2 \"><b>Feedback <span class=\"text-danger\">Form</span></b></h3>\n");
      out.write("\n");
      out.write("                    <label for=\"entersubject\" class=\"col-form-label pt-3\"> Enter Subject </label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"entersubject\" id=\"entersubject\" placeholder=\"\">\n");
      out.write("                    <label for=\"feedback\" class=\"col-form-label pt-3\">Feedback  </label>\n");
      out.write("                    <textarea type=\"text\" class=\"form-control\" name=\"feedback\" id=\"feedback\" rows=\"4\" cols=\"80\"></textarea> <br/>\n");
      out.write("                    <center><input type=\"submit\" value=\"Submit\" class=\"btn btn-danger mb-3\" style=\"width:100px;\"/></center> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            \n");
      out.write("            <table class=\"table table-bordered table hover bg-info\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Sr.No</th>\n");
      out.write("                    <th>Subject</th\n");
      out.write("                    <th>Student Name</th>\n");
      out.write("                    <th>Subject</th>\n");
      out.write("                    <th>Feedback Text</th>\n");
      out.write("                    <th>Post Date</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                  String cmd="select*from feedback a left join studentinfo b on a.enrollmentno =b.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"' ";
                  
                  DbManager db=new DbManager();
                  ResultSet rs=db.selectQuery(cmd);
                  int n=1;
                  while(rs.next())
                  {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(n );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("enrollmentno") );
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString("name ") );
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString("subject ") );
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString(" feedbacktext ") );
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(rs.getString(" postdate") );
      out.write(" </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    n++;
                  }
                  
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("            <div class=\"row\" style=\"height:550px;\"></div>\n");
      out.write("\n");
      out.write("<!--footer=============================================================================------------------------------------>\n");
      out.write("\n");
      out.write(" ");
      out.write("\n");
      out.write("<div class=\"row bfooter text-light  bg-danger text-center \">\n");
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
