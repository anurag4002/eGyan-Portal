<%-- 
    Document   : index
    Created on : 25 Aug, 2022, 4:14:00 AM
    Author     : altaf
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>NOULMS || STUDENT Welcome</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        
        <div class="container-fluid">
            
         
            <%@include file="studentheadermaster.jsp"%>
                   
                
                 
                 
         
                    
                  
                   
                   <%
                      String cmd="select * from studentinfo where enrollmentno='"+session.getAttribute("studentid")+"' ";
                      DbManager db=new DbManager();
                      
                      ResultSet rs=db.selectQuery(cmd);
                       if(rs!=null)
                       {
                           
                       if(rs.next())
                       {
                           String img="";
                           String pic=rs.getString("profilepic")+"";
                           if(pic.equals("null"))
                                   {
                                    img="images/NOU_Project_Images/profile.jpg";  
                                   }
                               else
                           {
                               img="../uploadimage/"+pic;
                           }
                      
                   %>
                  
                   
                   <div class="row mt-5" >
                       <div class="col-sm-4"></div>
                        
                       <center> <div class="col-sm-5 mt-3" style="background:#f0f0f0">
                                 <h4><b class="text-danger mt-5 ">PROFILE</b>  </h4>
                   <table class="table table-bordered">
                       <tr>
                           <th style="width:140px;">Student Pic</th>  
                           <td>
                               <img src="<%=img%> " class="w-50" style="height: 100px;"/>
                       </tr>
                       <tr>
                          
                           <th>Student Name : </th>
                           <td><%=rs.getString("name")%></td>
                       
                       </tr>
                       <tr>
                           <th>Mobile No</th>
                           <td><%=rs.getString("contactno")%></td>
                       </tr>
                      
                       <tr>
                           <th>Email Id: </th>
                           <td><%=rs.getString("emailaddress")%></td>
                       </tr>
                       <tr>
                           <th>Address :</th>
                           <td><%=rs.getString("address")%></td>
                       </tr>
                       <tr>
                           <td colspan="2" align="center">
                               <a class="btn  btn-danger" style="width: 200px;" href="editprofile.jsp">Edit Profile</a>
                           </td>
                               
                          
                       </tr>
                   </table>
                   
                   <%
                       }
                       
                       }  
                       %>
                   
                   
                   
                   </div>
                       </center>
               </div>
           
                       <div class="row" style="height: 250px;"></div>
          
               <%@include file="studentfootermaster.jsp" %>
           
        </div>
      
        
    </body>
</html>