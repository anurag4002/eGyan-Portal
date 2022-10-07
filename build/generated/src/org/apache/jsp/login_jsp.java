package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/linkmaster.jsp");
    _jspx_dependants.add("/headermaster.jsp");
    _jspx_dependants.add("/footermaster.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>NOULMS || LOGIN</title>\n");
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
      out.write("<!-- Headline start =================================================================================================================================-->   \n");
      out.write("            \n");
      out.write("<div class=\"row bg-danger text-light\" style=\"font-size:12px;\">\n");
      out.write("    <div class=\"col-sm-9\" style=\"min-height:10px; \" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class=\"fa fa-phone fa-spin\"></i>&nbsp;<a>Helpline No: +91-7307716878 | +91-7307716878 | +91-7307716878 </a>&nbsp;&nbsp;&nbsp;&nbsp;<i class=\"fa-solid fa-envelope\"></i>mishraanurag66031@gmail.com &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class=\"fa-solid fa-location-pin\"></i>Address: Lucknow road Gonda  &nbsp;&nbsp;</div>\n");
      out.write("    <div class=\"col-sm-3\">\n");
      out.write("        <i class=\"fa fa-graduation-cap i\"></i>Developed by : Anurag  mishra\n");
      out.write("    </div> \n");
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
      out.write("                <a class=\"navbar-brand\" href=\"noulms.jsp\" style=\"color:#000035\"s><b>NOULMS</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedCsontent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\" >\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" aria-current=\"page\" href=\"index.jsp\"><b>Home</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" ><b>About Us</b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"vision.jsp\" >History and Revival</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"about.jsp\" >Overview</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\" ><b>Course</b></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"course.jsp\" ><b>Courses</b></a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"studycenter.jsp\" ><b>Study Center</b></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"registration.jsp\" ><b>Registration</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"contactus.jsp\" ><b>Contact Us</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\" ><b>Login</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"d-flex\" role=\"search\">\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                        <button class=\"btn btn-outline-danger\" type=\"submit\">Search</button>\n");
      out.write("                    </form>\n");
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
      out.write("            \n");
      out.write("<!-- outer start=================================================================================================================================================-->\n");
      out.write("                \n");
      out.write("\n");
      out.write(" <div class=\"row bg-danger mb-4\" style=\"height: 600px;\">\n");
      out.write("     <div class=\"col-sm-4\"></div>\n");
      out.write("     <div class=\"col-sm-4 shadow-lg rounded bg-light mt-5\" style=\"height: 430px;\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("             <div class=\"col-sm-12\">\n");
      out.write("                 <div class=\"p-5\">\n");
      out.write("                     <div class=\"text-center\">\n");
      out.write("                         <img src=\"images/logo.png\" width=\"15%\">\n");
      out.write("                         <h5 class=\"h5 text-gray-900 mb-4\">University Login</h5>\n");
      out.write("                     </div>\n");
      out.write("                     <form action=\"logincode.jsp\" method=\"post\">\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                             <input type=\"text\" class=\"form-control form-control-user\" id=\"userid\" name=\"userid\" value=\"\"  placeholder=\"Enter Signin Id\">\n");
      out.write("                         </div><br/>\n");
      out.write("                         <div class=\"form-group\">\n");
      out.write("                             <input type=\"password\" class=\"form-control form-control-user\" id=\"pwd\" name=\"pwd\" placeholder=\"Enter Password\">\n");
      out.write("                         </div>\n");
      out.write("                         <br/>\n");
      out.write("                         <center><button type=\"submit\" class=\"btn btn-danger btn-user btn-block w-100\">Login</button></center>\n");
      out.write("                     </form>\n");
      out.write("                     \n");
      out.write("                     <hr>\n");
      out.write("                     <div class=\"text-center\">\n");
      out.write("                         <a class=\"small\" href=\"#\">Forgot Password?</a>\n");
      out.write("                     </div>\n");
      out.write("                     \n");
      out.write("                     <div class=\"col-sm-4\"></div>\n");
      out.write("                         \n");
      out.write("                 </div>\n");
      out.write("                     \n");
      out.write("             </div>\n");
      out.write("                 \n");
      out.write("         </div>\n");
      out.write("             \n");
      out.write("     </div>\n");
      out.write("     <div class=\"row\" style=\"height: 200px;\">\n");
      out.write("         \n");
      out.write("     </div>\n");
      out.write(" \n");
      out.write(" ");
      out.write("\n");
      out.write("<!--start footer=================================================================================================================================================-->\n");
      out.write("\n");
      out.write("<div class=\"row  text-light p-0  \" style=\"background: #a40000;\">\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("        <h4 class=\"pt-3\"><b>QUICK LINKS</b></h4>\t\n");
      out.write("             <h6 class=\"pt-3\">landa Act and Statutes</h6>\n");
      out.write("             <h6>Annual Reports</h6>\n");
      out.write("             <h6>Annual Accounts</h6>\n");
      out.write("             <h6>RTI</h6>\n");
      out.write("             <h6>Media </h6>\n");
      out.write("             <h6>Jobs</h6>\n");
      out.write("             <h6>Tenders</h6>\n");
      out.write("             <h6>Make a Gift</h6>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("         <h4 class=\"pt-3\"><b>QUICK LINKS</b></h4>\t\n");
      out.write("             <h6 class=\"pt-3 \">Copyright and Privace Policy</h6>\n");
      out.write("             <h6>Academic Calender</h6>\n");
      out.write("             <h6>Holiday List</h6>\n");
      out.write("             <h6>Policies</h6>\n");
      out.write("             <h6>Events</h6>\n");
      out.write("             <h6>Student Notice Board</h6>\n");
      out.write("             <h6>Contact Us</h6>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-sm-2\">\n");
      out.write("         <h4 class=\"pt-3\"><b>CONTACT US</b></h4>\t\n");
      out.write("             <h6 class=\"pt-3 text-warning\">Campus Address</h6>\n");
      out.write("             <h6>Nalanda University</h6>\n");
      out.write("             <h6>Rajgir,Nalanda District</h6>\n");
      out.write("             <h6>Pin - 803116 Bihar</h6>\n");
      out.write("             <h6>vcoffice@nalandauniv.edu.in</h6>\n");
      out.write("             <h6>06112-255330</h6>\n");
      out.write("             <h6>Admission Helpline</h6>\n");
      out.write("             <h6>VC Office</h6>\n");
      out.write("             <h6 class=\"pb-4\">00919939504874</h6>\n");
      out.write("             \n");
      out.write("    </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("         <div class=\"col-sm-2\">\n");
      out.write("             <h6 class=\"pt-5 mt-5 text-warning\">Delhi Office :</h6>\n");
      out.write("             <h6>Nalanda University</h6>\n");
      out.write("             <h6>Flat No - 201 & 208 ashoka</h6>\n");
      out.write("             <h6>Estates, 24 Barakhamba Road</h6>\n");
      out.write("             <h6>New Delhi 110001 India</h6>\n");
      out.write("             <h6>+91-11-23358131, 23358132</h6>\n");
      out.write("             <h6>Fax - +91-11-23358142</h6>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("</div>\n");
      out.write("               \n");
      out.write("                  <div class=\"row text-light \" style=\"background: #7d0000\">\n");
      out.write("                     <div class=\"col-sm-12  col-xs-12 text-center\">\n");
      out.write("                        <p>Copyright 2019 - 2022 © NALANDA UNIVERSITY</p>\n");
      out.write("                     </div>\n");
      out.write("                  </div>\n");
      out.write("<!-- end footer==================================================================================================================================================-->\n");
      out.write("            ");
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write(" \n");
      out.write("    \n");
      out.write(" <!-- outer end -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
