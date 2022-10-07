<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Student zone
Complaint Form
----------------------------------------------------------------------------------->

<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || cOMPLAINT</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="studentheadermaster.jsp" %>

            <div class="row">
    <div class="col-sm-12 ">
        <form action="complaintcode.jsp" method="post">
 <div class="row mt-5">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 border" style="background:#f0f0f0">
                        <h4 class="text-center mt-3"><b>COMPLAINT </b><b class="text-danger">FORM</b></h4>
                        <label for="subject" class="col-form-label pt-3"> Enter Subject<sup class="text-danger">*</sup></label>
                    <input type="text" class="form-control" name="subject" id="subject" placeholder="">
                    
                    <label for="ctext" class="col-form-label pt-3">Enter Complain Text<sup class="text-danger">*</sup></label>
                    <textarea type="text" class="form-control" name="ctext" id="ctext" rows="4" cols="80"></textarea> <br/>
                    <center><input type="submit" value="Submit" class="btn btn-danger mb-3" style="width:100px;"/></center> 
                </div>
                <div class="col-sm-4"></div>
                    
            </div>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <div class="row mb-2">
                <div class="col-sm-4"></div>
                <div class="col-sm-3 me-5   text-center rounded">
                <h3 class=" rounded text-danger mb-3">-||  Complaint List  ||-</h3>
                </div>
            </div>
            <table class="table table-bordered table hover ">
                <tr class="bg-info p-0">
                    <th>Sr.No</th>
                    <th>Enrollment No</th>
                    <th>Student Name</th>
                    <th>Subject</th>
                    <th>Complaint Text</th>
                    <th>Status</th>
                    <th>Posted date</th>
                    <th>Approve Date</th>
                </tr>
                <%
                  String q="select*from complaint a left join studentinfo b on b.enrollmentno =a.enrollmentno where a.enrollmentno='"+session.getAttribute("studentid")+"' ";
                  
                  DbManager db=new DbManager();
                  ResultSet rs=db.selectQuery(q);
                  int n=1;
                  while(rs.next())
                  {
                %>
                
                <tr>
                    <td><%=n %></td>
                    <td><%=rs.getString("enrollmentno") %> </td>
                    <td><%=rs.getString("name") %> </td>
                    <td><%=rs.getString("subject") %> </td>
                    <td><%=rs.getString("complainttext") %> </td>
                    <td><%=rs.getString("posteddate") %> </td>
                    <td><%=rs.getString("status") %> </td>
                    <td><%=rs.getString("statusdate") %> </td>

                    </tr>
                    <%
                    n++;
                  }
                  
                %>
            </table>
        </form>
    </div>
            </div>
    
            <div class="row" style="height:310px;"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="studentfootermaster.jsp" %>
 
 


        </div>
 </body>
</html>
