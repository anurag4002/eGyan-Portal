<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Admin zone
Notification
----------------------------------------------------------------------------------->

<!DOCTYPE html>
<html>
    <head>

        <title>NOULM || ADMIN</title>

        <%@include file="adminlinkmaster.jsp" %>

    </head>
    <body>
        <div class="container-fluid">

            <%@include file="adminheadermaster.jsp" %>



            <!-- notification box-->
<form  action="noticecode.jsp" method="post">
                        
<div class="row mt-5">
    <div class="col-sm-4"></div>
    <div class="col-sm-4  border rounded" style="background:#e8e8e8 ">
                             <h4 class="text-center mb-2 pt-3 "><b>Add<span class="text-danger"> Notification</span></b></h4>
                            <label for="ntext" class="col-form-label pt-3">Enter Notification : </label>
                            <textarea type="text" class="form-control" name="ntext" id="ntext" rows="1" cols="80"></textarea> <br/>
                            <center><input type="submit" value="Submit" class="btn btn-danger mb-3" style="width:100px;"/></center><br>
                             <br/>
                             
    </div>
    
     <div class="col-sm-4"></div>
                    
            </div>
            
            <br/>
            <br/>
            <br/>
            <table class="table table-bordered table hover">
                            <tr class="bg-info">
                                <th>Sr.No</th>
                                <th>Notification Text</th>
                                <th>Posted Date</th>
                                <th>Delete</th>
                            </tr >
                            <%
                                String cmd = "select * from notification";
                                DbManager db = new DbManager();
                                ResultSet rs = db.selectQuery(cmd);
                                int n = 1;
                                while (rs.next()) {
                            %>
                            <tr class="bg-light">
                            <td><%=n%></td>
                            <td><%=rs.getString("ntext")  %></td>
                            <td><%=rs.getString("posteddate")  %></td>
                            <td>
                      <a onclick="return confirm('Are you sure do you want delete record ?')" href="delnotice.jsp?id=<%=rs.getString("nid") %>">Delete</a>
                  </td>
                               
                            </tr>  
                            <%
                            n++;
                                }
                            %>

                        </table>


                    </form>



            <div class="row" style="height: 200px;"></div>
    
            <!--notification end-->

            <%@include file="adminfootermaster.jsp" %>

            <!-- outer end -->
        </div>   
    </body>
</html>