<%@page import="connect.DbManager"%>

<%
    //student zone -> Change pass code
    
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
else{
    %>
     <script>
            alert('New Password is not confermed');
            window.location.href="../changepassword.jsp";
         </script>
    <%
}

    if(b==true)
    {
        %>
        <script>
            
            alert('New Password successfully updated');
            window.location.href="../login.jsp";
         </script>
        <%
    }
    else 
    {
        %>
        <script>
            alert('New Password is not updated');
            window.location.href="../changepassword.jsp";
         </script>
<%
        
}
            
    
%>