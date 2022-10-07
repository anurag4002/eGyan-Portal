<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Student zone
Course
----------------------------------------------------------------------------------->
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || STUDYMATERIAL</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="studentheadermaster.jsp" %>

            
            <div class="row">
                <div class="col-sm-4 me-5 "></div>
                <div class="col-sm-3  mt-3 mb-4 text-center   rounded">
                    <h4> <b>STUDY</b> <b class="text-danger"> MATERIAL</></b></h4>
                </div>
            </div>
<div class="row">
    <div class="col-sm-12 p-0">
        <table class="table table-bordered table-hover">
                     <tr class="bg-info">
                    <th>Sr.No.</th>
                    <th>Course Name</th>
                    <th>Year</th>
                    <th>File Name</th>
                    <th>Upload Date</th>
                    <th>Download</th>
                </tr>
                
                <%
                String cmd="select b.coursename, a.* from studymaterial a left join courseinfo b on b.courseid=a.coursename";
                DbManager db=new DbManager();
                
                ResultSet row=db.selectQuery(cmd);
                
                int n=1;
                while(row.next())
                {
                %>
                    <tr>
                        <td><%=n %></td>
                        <td><%=row.getString("coursename") %></td>
                        <td><%=row.getString("year") %></td>
                        <td><%=row.getString("filename") %></td>
                        <td><%=row.getString("uploaddate") %></td>
                        <td>
                            <a target="_blank" href="../uploadimage/<%=row.getString("filename") %>">Download</a>
                        </td>
                        
                        </tr>
                   
                    <%
                    n++;
                }
                
                %>
                 
            </table>
    </div>
</div>
                <div class="row" style="height:520px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="studentfootermaster.jsp" %>

        </div>
 </body>
</html>
