package org.apache.jsp.studentzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import connect.DbManager;

public final class passcode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    
    String oldpass=request.getParameter("oldpass");
    String newpass=request.getParameter("newpass");
    String repass=request.getParameter("repass");

               
String enrollmentno=session.getAttribute("studentid").toString();

boolean status=false;

if(newpass.equals(repass))
{
    status=true;
}
boolean b=false;
if(status==true)
{
    String q="update studentinfo set pwd='"+newpass+"' where enrollmentno='"+enrollmentno+"' and pwd='"+oldpass+"' ";

    
    DbManager db=new DbManager();
    
    b=db.insertUpdateDelete(q);
}

    if(b==true)
    {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            alert('New Password successfully updated');\n");
      out.write("            window.location.href=\"../login.jsp\";\n");
      out.write("         </script>\n");
      out.write("        ");

    }
    else 
    {
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("            alert('New Password is not updated');\n");
      out.write("            window.location.href=\"../login.jsp\";\n");
      out.write("         </script>\n");
      out.write("        ");

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
