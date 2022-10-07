<%@page import="java.sql.ResultSet"%>
<%@page import="connect.DbManager"%>
<% 
    //Studentzone feedback code 
    
    String subject=request.getParameter("subject");
    
    String ftext=request.getParameter("ftext");
    
    String enrollmentno=session.getAttribute("studentid").toString();
    
    String cmd = "insert into feedback(enrollmentno,subject,feedbacktext,posteddate) values('"+enrollmentno+"','"+subject+"','"+ftext+"',curdate())";
    
    DbManager db=new DbManager();
    
    boolean status=db.insertUpdateDelete(cmd);
    
    if (status==true )
    {
      %>
      
        <script>
            alert('Feedback successfully submitted');
            window.location.href="feedback.jsp";
            
            </script>
            
         <%
    }
    
    else
    {
    
     %>
        <script>
            alert('Feedback is not submitted');
            window.location.href="feedback.jsp";
        </script>
                    
      <%
        
    }
    
 %>