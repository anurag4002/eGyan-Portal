<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Admin zone
Complaint Form
----------------------------------------------------------------------------------->
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || HOME</title>
        <%@include file="adminlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="adminheadermaster.jsp" %>

<!--notification box--------------------------------------------------------------------->
<div class="row mt-3 mb-3">
    <center><div class="col-sm-3">
            <h4><b>COMPLAINT <span class="text-danger">LIST</span> </b></h4>
        </div></center>
</div>
<div class="row">
    <div class="col-sm-12 p-0">
        
        <table class="table table-bordered table hover ">
                <tr class="bg-info">
                    <th>Sr.No</th>
                    <th>Enrollment No</th>
                    <th>Student Name</th>
                    <th>Subject</th>
                    <th>Complaint Text</th>
                    <th>Posted date</th>
                    <th>Status</th>
                    <th>Approve Date</th>
                    <th>Delete</th>
                </tr>
                <%
                  String cmd="select*from feedback a left join studentinfo b on a.enrollmentno =b.enrollmentno ";                  
                  DbManager db=new DbManager();
                  ResultSet rs=db.selectQuery(cmd);
                  int n=1;
                  while(rs.next())
                  {
                %>
                
                <tr>
                    <td><%=n %></td>
                    <td><%=rs.getString("enrollmentno") %> </td>
                    <td><%=rs.getString("name") %> </td>
                    <td><%=rs.getString("subject") %> </td>
                    <td><%=rs.getString("posteddate") %> </td>
                    <td>
                        <a onclick="return confirm('Are you sure delete this record ?')" href="delcomplaint.jsp?id=<%=rs.getString("id") %>">Delete</a>
                    </td>
                    
                    </tr>
                    <%
                    n++;
                  }
                  
                %>
            </table>
    </div>
</div>         
            <div class="row" style="height: 365px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="adminfootermaster.jsp" %>

        </div>
 </body>
</html>
