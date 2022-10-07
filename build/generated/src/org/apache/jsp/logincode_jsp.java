package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import connect.DbManager;

public final class logincode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

   String userid = request.getParameter("userid");
   String pwd = request.getParameter("password");
   
   // this query is used to select record from database
   String q = "Select * from studentinfo where enrollmentno='" +userid+"' ";
  
   DbManager db = new DbManager();
   ResultSet rs = db.selectQuery(q);
   boolean status = false;
   if(rs!=null)
   {
       if(rs.next()==true)
       {
          String pass = rs.getString("password");
          if(pass.equals(pwd)==true)
          {
              status = true;  
          }
       }
       else
       {
           
       }
   }
   else
   {
       
   }
   


if (status==true)
{
    if(userid.equals("admin")==true)
    {
        session.setAttribute("adminid",userid);
        response.sendRedirect("adminzone/admin/welcome.jsp");
    }
    else
    {
        session.setAttribute("studentid",userid);
        response.sendRedirect("studentzone/welcome.jsp");
    }
}
else
{
    
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert('Login detail Invalid');\n");
      out.write("        window.location.href=\"login.jsp\";\n");
      out.write("        </script>\n");
      out.write("    ");

}

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
