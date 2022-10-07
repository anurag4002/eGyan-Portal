<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Admin zone
Course
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
            <% 
                if(request.getParameter("f")!=null)
                {
                    if(request.getParameter("f").equals("1"))
                    {
                        %>
                        <script>
                            alert('course successfully uploaded');
                            window.location.href="course.jsp";
                            </script>
                            <%
                    }
                    else
                    {
                        %>
                        <script>
                            alert('course is not uploaded');
                            window.location.href="course.jsp";
                            </script>
                        
                        <%
                    }
                }
                %>

<!--notification box--------------------------------------------------------------------->


    <div class="row mt-5">
        <div class="col-sm-3"></div>
        <div class="col-sm-6 " style="background: #efefef">
            <center><h4 class="mt-3"><b>Add</b> <b class="text-danger">Course</b></h4></center>
        <form action="../coursecode" method="post" enctype="multipart/form-data">
            <table class="table table-bordered">
                <tr>
                    <th>Enter Course Name</th>
                    <td>
                <input type="text" class="form-control" name="coursename" id="coursename" placeholder="">
                    </td>
                </tr>
                <tr>
                    <th>Enter Course Type </th>
                    <td>
                        <select name="coursetype" required="" class="form-control">
                            <option value="">Select Course</option>
                            <option>Diploma</option>
                            <option>B.Tech</option>
                            <option>M.tech</option>
                            <option>BCA</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Enter Course Duration</th>
                    <td>
                        <input type="text" name="cd" required="" />
                    </td>
                </tr>
                <tr>
                    <th>Upload Image</th>
                <td>
                    <input type="file" name="img" required=""/>
                </td>
            </tr>
            <tr>
                <th colspan="2" align="center">
                <center> <input type="submit" class="btn btn-danger " style="width:150px;"/></center>
                </th>
            </tr>
            </table>
            <br/>
        </div>
    </div>
    <div class="row mt-5">
        <div class="col-sm-12 p-0">
            <h4 class="text-center text-danger" >-||  Courss List  ||-</h4>
            <br/>
            <table class="table table-bordered table-hover">
                <tr class="bg-info">
                    <th>Sr.No.</th>
                    <th>Course Name</th>
                    <th>Course Type</th>
                    <th>Course Duration</th>
                    <th style="width:180px; p-0">Course Images</th>
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
                            <img  height="150px" width="180px;;" src="../uploadimage/<%=rs.getString("courseimage") %>" />
                        </td>
                        <td>
                            <a onclick="return confirm('Are you sure delete this record ?')" href="delcourse.jsp?id=<%=rs.getString("courseid") %>">Delete</a>   
                        </td>
                        </tr>
                   
                    <%
                }
                
                %>
                 
            </table>
        </form>
    </div>
        <div class="col-sm-2"></div>
</div>

<div class="row" style="height: 300px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="adminfootermaster.jsp" %>

        </div>
 </body>
</html>
