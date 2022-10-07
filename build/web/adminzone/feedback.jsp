<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Admin zone
Feedback Form
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

<div class="row">
    
    <div class="col-sm-12 p-0">
        <h4 class="text-center pt-3 pb-3"><b>FEEDBACK</b> <b class="text-danger">LIST</b></h4>
        <table class="table table-bordered table hover bg-info">
                <tr class="border-dark">
                    <th>Sr.No</th>
                    <th>Subject</th>
                    <th>Student Name</th>
                    <th>Feedback Text</th>
                    <th>Status</th>
                    <th>Posted Date</th>
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
                
                <tr class="bg-light">
                    <td><%=n %></td>
                    <td><%=rs.getString("enrollmentno") %> </td>
                    <td><%=rs.getString("name") %> </td>
                    <td><%=rs.getString("subject") %> </td>
                    <td><%=rs.getString("feedbacktext") %> </td>
                    <td><%=rs.getString("posteddate") %> </td>
                    <td>
                        <a onclick="return confirm('Are you sure delete this record ?')" href="delfeedback.jsp?id=<%=rs.getString("id") %>">Delete</a>
                    </td>
                    </tr>
                    <%
                    n++;
                  }
                  
                %>
            </table>
    </div>
</div>
            <div class="row" style="height: 565px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="adminfootermaster.jsp" %>

        </div>
 </body>
</html>
