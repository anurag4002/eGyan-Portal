<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Admin zone
Study center 
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
                            alert('Student material successfully uploaded');
                            window.location.href="usm.jsp";
                            </script>
                            <%
                    }
                    else
                    {
                        %>
                        <script>
                            alert('Student material is not uploaded');
                            window.location.href="usm.jsp";
                            </script>
                        
                        <%
                    }
                }
                %>

            

<!--notification box--------------------------------------------------------------------->

<div class="row mt-5">
    <div class="col-sm-3"></div>
    <div class="col-sm-6" style="background: #ebebeb">
        <center><h4 class=" pt-3 pb-3"><b class="text-danger ">STUDY</b>  <b>MATERIAL</b></h4></center>
        <form action="../uploadimage" method="post" enctype="multipart/form-data" >
            <table class="table table-bordered">
                <tr>
                <th>Course Name :</th>
                <td>
                    <select name="course" class="form-control">
                        <option value="">Select Course</option>
                         <% 
                         String q="select * from courseinfo";
                         DbManager db=new DbManager();
                         ResultSet rs=db.selectQuery(q);
                         while(rs.next())
                         {
                             %>
                               <option value="<%=rs.getString("courseid") %>"><%=rs.getString("coursename") %></option>
                             <%
                         }
                         %>
                    </select>
                </td>
                </tr>
                <tr>
                    <th>Year</th>
                    <td>
                        <select name="year" class="form-control" required="">
                            <option value="">Select Year</option>
                            <option>First Year</option>
                            <option>Second Year</option>
                           <option>Third year</option>
                           <option>Fourth year</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Upload File :</th>
                    <td>
                        <input type="file" name="filename" />
                    </td>
                </tr>
                <tr>
                    <th colspan="2" align="center">
                <center> <input type="submit" class="btn btn-danger " style="width:150px;"/></center>
                </th>
                </tr>
            </table>
    </div>
</div>
                    <br/>
                    <div class="row mt-5">
                        <div class="col-sm-12 p-0">
                    <table class="table table-bordered table-hover">
                     <tr class="bg-info">
                    <th>Sr.No.</th>
                    <th>Course Name</th>
                    <th>Year</th>
                    <th>File Name</th>
                    <th>Upload Date</th>
                    <th>Delete</th>
                </tr>
                
                <%
                String cmd="select b.coursename, a.* from studymaterial a left join courseinfo b on b.courseid=a.coursename";
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
                            <a href="../uploadimage/<%=row.getString("filename") %>">Download</a>
                        </td>
                        
                        </tr>
                   
                    <%
                    n++;
                }
                
                %>
                 
            </table>
        </form>
    </div>
</div>

                    <div class="row" style="height:530px;"></div>
<!--footer=============================================================================------------------------------------>
 <%@include file="adminfootermaster.jsp" %>

        </div>
 </body>
</html>
