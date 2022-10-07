<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!--Student zone
Feedback Form
----------------------------------------------------------------------------------->

<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || FEEDBACK</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="studentheadermaster.jsp" %>

<!--Feedback Form ==============================================================================================================----->

<div class="row">
    <div class="col-sm-12 ">
        <form action="feedbackcode.jsp" method="post">
            
            <div class="row mt-5">
                <div class="col-sm-4"></div>
                <div class="col-sm-4  border rounded" style="background:#e8e8e8 ">
                            <h3 class="text-center mb-2 "><b>Feedback <span class="text-danger">Form</span></b></h3>

                    <label for="subject" class="col-form-label pt-3"> Enter Subject </label>
                    <input type="text" class="form-control" name="subject" id="subject" placeholder="">
                    <label for="ftext" class="col-form-label pt-3">Feedback  </label>
                    <textarea type="text" class="form-control" name="ftext" id="ftext" rows="4" cols="80"></textarea> <br/>
                    <center><input type="submit" value="Submit" class="btn btn-danger mb-3" style="width:100px;"/></center> 
                </div>
                <div class="col-sm-4"></div>
                    
            </div>
            
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <div class="row">
                <div class="col-sm-4 me-5 "></div>
                <div class="col-sm-3  mt-5 mb-4 text-center  rounded">
                    <h3 class="text-danger"> -||  Feedback List  ||-</h3>
                </div>
            </div>
            <table class="table table-bordered table hover   P-0">
                <tr class="bg-info">
                    <th>Sr.No</th>
                    <th>Subject</th>
                    <th>Student Name</th>
                    <th>Subject</th>
                    <th>Feedback Text</th>
                    <th>Post Date</th>
                </tr>
                <%
                  String cmd="select*from feedback a left join studentinfo b on a.enrollmentno =b.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"' ";
                  
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
                    <td><%=rs.getString("feedbacktext") %> </td>
                    <td><%=rs.getString("posteddate") %> </td>
                    </tr>
                    <%
                    n++;
                  }
                  
                %>
            </table>
        </form>
    </div>
</div>
            <div class="row" style="height:150px;"></div>

<!--footer=============================================================================------------------------------------>

 <%@include file="studentfootermaster.jsp" %>

        </div>
 </body>
</html>
