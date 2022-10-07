<%@page import="java.sql.ResultSet"%>
<%@page import="connect.DbManager"%>
<%
   String userid = request.getParameter("userid");
   String pwd = request.getParameter("pwd");
   
   // this query is used to select record from database
   String q = "Select * from studentinfo where enrollmentno='" +userid+"' ";
  
   DbManager db = new DbManager();
   ResultSet rs = db.selectQuery(q);
   boolean status = false;
   if(rs!=null)
   {
       if(rs.next()==true)
       {
          String pass = rs.getString("pwd");
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
        response.sendRedirect("adminzone/adminwelcome.jsp");
    }
    else
    {
        session.setAttribute("studentid",userid);
        response.sendRedirect("studentzone/welcome.jsp");
    }
}
else
{
    %>
    <script>
        alert('Login detail Invalid');
        window.location.href="login.jsp";
        </script>
    <%
}
%>