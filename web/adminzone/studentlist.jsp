<%@page import="java.sql.ResultSet"%>
<%@page import="connect.DbManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>NOULMS || ADMIN</title>
        <%@include file="adminlinkmaster.jsp" %>
    </head>
    <body>
        
        <div class="container-fluid">
            
         
            <%@include file="adminheadermaster.jsp"%>
                   
                 <!----about section---->  
                 
                 
                 
<div class="row">
    <div class="col-sm-12 p-0  ">
        <h4 CLASS="text-center pt-3 pb-3"><b>STUDENT </b><b class="text-danger">LIST</b></h4>
        <div class="text-center  p-0 border-dark rounded-2 ">
            <table class="table table-bordered ">
                <tr class="bg-info">
                    <th>Sr.No</th>  
                    <th>Enrollment No</th>    
                    <th>Name</th>
                    <th> Father Name</th>
                    <th> Mother Name</th> 
                    <th>Gender</th>    
                    <th>address</th>    
                    <th>Email</th>
                    <th> Contact No</th>    
                    <th>DOB</th>    
                    <th>Aadhar No</th> 
                    <th>Course</th>    
                    <th>Year</th>    
                    <th>Center Name</th>    
                    <th>Registration Date</th>    
                    <th>Password</th>    
                    <th>Delete</th>    
                </tr>
                <tr>
                    <%
                        String cmd="select * from studentinfo where enrollmentno<>'admin' ";
                        DbManager db=new DbManager();
                        ResultSet rs=db.selectQuery(cmd);

                        int n=1;
                        while(rs.next())
                                       {
                    %>
                <tr class="bg-light">
                    <td><%=n%></td>
                    <td><%=rs.getString("enrollmentno")%></td>
                    <td><%=rs.getString("name")%></td>
                    <td><%=rs.getString("fname")%></td>
                    <td><%=rs.getString("mname")%></td>
                    <td><%=rs.getString("gender")%></td>
                    <td><%=rs.getString("address")%></td>
                    <td><%=rs.getString("emailaddress")%></td>
                    <td><%=rs.getString("contactno")%></td>
                    <td><%=rs.getString("dob")%></td>
                    <td><%=rs.getString("aadharno")%></td>
                    <td><%=rs.getString("course")%></td>
                    <td><%=rs.getString("year")%></td>
                    <td><%=rs.getString("centername")%></td>
                    <td><%=rs.getString("registrationdate")%></td>
                    <td><%=rs.getString("pwd")%></td>
                    <td>
                        <a onclick="return confirm('Are you sure do you want to delete record')" href="delreg.jsp?id=<%=rs.getString("enrollmentno")%>">Delete</a>                             </td>
                                      
                </tr>
                
                <%
                    n++;
                    }

                %>
            </table>
        </div>
    </div>
                               
                   
                                  
                                  
                                       
                                       
           <!--- Start Footer  -->
           
           <div class="row" style="height: 555px;"></div>
          
           <%@include file="adminfootermaster.jsp" %>
           <!-- Fotter end -->
           
           
           <!-- outer end -->
        </div>
        
    </body>
</html>