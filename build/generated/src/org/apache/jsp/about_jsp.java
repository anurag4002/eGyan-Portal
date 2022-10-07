package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"row \">\n");
      out.write("    <div class=\"col-sm-12  p-0\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><b>NOULMS</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"index.jsp\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"about.jsp\">About Us</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Course</a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"course.jsp\">Courses</a></li>\n");
      out.write("                                <li><a class=\"dropdown-item\" href=\"studycenter.jsp\">Study Center</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"registration.jsp\">Registration</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"contactus.jsp\">Contact Us</a>\n");
      out.write("                        </li>\n");
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
      out.write("                   \n");
      out.write("     \n");
      out.write("        <!--About start=======================================================================================================-->\n");
      out.write("\n");
      out.write("<div class=\"row mt-3 mb-3\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("    <div class=\"col-sm-12 ps-4\">\n");
      out.write("        <img src=\"images/about.jpg\"  class=\"w-100\" alt=\"\"/> \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <!--<h4 class=\"text-danger text-center pt-4 pb-2\" style=\"font-size:30px; font-color:#002d59;\"><b>Overview</b></h4>-->\n");
      out.write("        <h2 class=\"bot-bar\">Overview</h2>\n");
      out.write("        <div class=\"col-sm-2\"></div>\n");
      out.write("    <div class=\"col-sm-8 ps-4\">\n");
      out.write("        <p style=\"text-align:justify;\">\n");
      out.write("            <span style=\"font-size:19px;\">The Nalanda Open University is the only University in\n");
      out.write("                the State of Bihar meant for imparting learning\n");
      out.write("                exclusively through the system of distance education.\n");
      out.write("                The University was established in March, 1987 by an\n");
      out.write("                ordinance, promulgated by the Government of Bihar.\n");
      out.write("                Later, Nalanda Open University Act, 1995 was passed by\n");
      out.write("                the Bihar Legislature, replacing the Ordinance, and the\n");
      out.write("                University came under the authority and jurisdiction of\n");
      out.write("                the new Act automatically. The University is named after\n");
      out.write("                the famous Nalanda University of Ancient India.\n");
      out.write("                Nalanda E –Gyan Portal is a web based application, \n");
      out.write("                which provide e-learning for students of different \n");
      out.write("                courses.Nalanda E-Gyan Portal is a complete solution \n");
      out.write("                of elearning, through this portal student can get learning \n");
      out.write("                material online in form of pdf, video and document format.\n");
      out.write("                In this portal , there is a strong discussion forum where \n");
      out.write("                students can discuss on any topic to clear their doubts.\n");
      out.write("                In this portal student can give their feedback and complain. \n");
      out.write("                This portal also provide assignment and quizes for assessment\n");
      out.write("            </span>\n");
      out.write("    </div>\n");
      out.write("                <div class=\"col-sm-2\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write(" <!--about end =============================================================================================================================================-->\n");
      out.write("                  \n");
      out.write(" ");
      out.write("\n");
      out.write("<!--start footer=================================================================================================================================================-->\n");
      out.write("\n");
      out.write("<div class=\"row ufooter\">\n");
      out.write("    <div class=\"col-sm-12 bg-dark\" >\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1 bg-dark\"></div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark px-4 py-5\">\n");
      out.write("                <img src=\"images/logo.png\"  class=\"w-100 pb-3\"style=\"height:180px;\" alt=\"\"/>\n");
      out.write("                <h4 class=\"text-light\"><b><span class=\"text-danger\">Nalanda</span> eGyan Portal</b></h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1 bg-dark\"></div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark px-4 py-5  text-light\">\n");
      out.write("                <h6>Help</h6>\n");
      out.write("                <h6>About</h6>\n");
      out.write("                <h6>Advertise</h6>\n");
      out.write("                <h6>careers</h6>\n");
      out.write("                <h6>Developers</h6>\n");
      out.write("                <h6>Contact us</h6>\n");
      out.write("                <h6>Press</h6>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1 bg-dark\"></div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark px-4 py-5 text-light\">\n");
      out.write("                <h6>Copyright Policy</h6>\n");
      out.write("                <h6>Terms</h6>\n");
      out.write("                <h6>Blog</h6>\n");
      out.write("                <h6>Privacy Policy</h6>\n");
      out.write("                <h6>Sitemap</h6>\n");
      out.write("                <h6>Copyright Policy</h6>\n");
      out.write("                <h6>Terms</h6>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1 bg-dark\"></div>\n");
      out.write("            <div class=\"col-sm-2 bg-dark text-light\">\n");
      out.write("                <center>\n");
      out.write("                    <select class=\"form-select bg-dark mt-5\" style=\"width:125px;color:red;  border-radius:20px;\">\n");
      out.write("                        <option selected>Language</option>\n");
      out.write("                        <option value=\"1\">One</option>\n");
      out.write("                        <option value=\"2\">Two</option>\n");
      out.write("                        <option value=\"3\">Three</option>\n");
      out.write("                    </select>\n");
      out.write("                    <center>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger my-5\"style=\"border-radius:20px; width:170px; color:white;\">Teach on course</button>\n");
      out.write("                    </center>\n");
      out.write("                    <br/>\n");
      out.write("                    <i class=\"fa-brands fa-instagram ps-2\"></i>\n");
      out.write("                    <i class=\"fa-brands fa-whatsapp ps-2\"></i>\n");
      out.write("                    <i class=\"fa fa-phone ps-2\"></i>\n");
      out.write("                    <i class=\"fa-brands fa-twitter ps-2\" ></i>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row bfooter text-light   text-center \">\n");
      out.write("            <div class=\"col-sm-6  \"><h6>@ 2020 Course All Rights Reserved</h6></div>\n");
      out.write("            <div class=\"col-sm-6 \">Developed By : Anurag Mishra</div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("                  \n");
      out.write("<!-- end footer==================================================================================================================================================-->\n");
      out.write("            ");
      out.write("\n");
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
