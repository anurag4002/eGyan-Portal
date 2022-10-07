<%@page import="connect.DbManager"%>

<% 
    //Studentzone Complaint code
    
    String subject=request.getParameter("subject");
    String ctext=request.getParameter("ctext");
    String enrollmentno=session.getAttribute("studentid").toString();
    
    String query="insert into complaint(enrollmentno,subject,complainttext,posteddate,status,statusdate) values('"+enrollmentno+"','"+subject+"','"+ctext+"',curdate(),'pending','NA')";
     
 
 
   DbManager db=new DbManager();
    
    boolean b=db.insertUpdateDelete(query);
    
    if (b==true )
    {
      %>
      
        <script>
            alert('Complaint successfully submitted');
            window.location.href="complaint.jsp";
            
            </script>
            
         <%
    }
    
    else
    {
    
     %>
        <script>
            alert('Complaint is not submitted');
            window.location.href="complaint.jsp";
        </script>
                    
      <%
        
    }
    
 %>