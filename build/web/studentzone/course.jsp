<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Student zone
Course
----------------------------------------------------------------------------------->
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || COURSE</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="studentheadermaster.jsp" %>

             <div class="row">
                <div class="col-sm-4 me-5 "></div>
                <div class="col-sm-3  mt-3 mb-4 text-center   rounded">
                    <h4> <b>COURSE <span class="text-danger">LIST</span></b></h4>
                </div>
            </div>
<div class="row">
    <div class="col-sm-12 p-0 ">
        
        
        <table class="table table-bordered table-hover">
                <tr class="bg-info ">
                    <th>Sr.No.</th>
                    <th>Course Name</th>
                    <th>Course Type</th>
                    <th>Course Duration</th>
                    <th style="width: 200px;">Course Images</th>
                    <th>Delete</th>
                </tr>
                
                <%
                String cmd="select *from courseinfo";
                DbManager db=new DbManager();
                ResultSet rs=db.selectQuery(cmd);
                int n=1;
                while(rs.next())
                {
                    %>
                    <tr>
                        <td><%=n %></td>
                        <td><%=rs.getString("coursename") %></td>
                        <td><%=rs.getString("coursetype") %></td>
                        <td><%=rs.getString("courseduration") %></td>
                        
                        <td>
                            <img  height="200px" width="200px" src="../uploadimage/<%=rs.getString("courseimage") %>" />
                        </td>
                        <td>
                            <a onclick="return confirm('Are you sure delete this record ?')" href="delcourse.jsp?id=<%=rs.getString("courseid") %>">Delete</a>   
                        </td>
                        </tr>
                   
                    <%
                }
                
                %>
                 
            </table>
    </div>
</div>
                <div class="row" style="height: 380px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="studentfootermaster.jsp" %>

        </div>
 </body>
</html>
