<%-- 
    Document   : index
    Created on : 25 Aug, 2022, 4:14:00 AM
    Author     : altaf
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="connect.DbManager"%>
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
                   
                
                 
                 
         <div class="row mt-3">
                   <div class="col-sm-12 p-2 text-center  text-danger ">
          
                       <h4 style="font-size:28">-||  Profile  ||-</h4>
                  
                   <hr/>
                   
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
                               img=pic;
                           }
                      
                   %>
                   <form action="../updateprofile" method="post" enctype="multipart/form-data">
                   
                   
                   <table class="table table-bordered">
                       <tr>
                           <th>Student Pic</th>  
                           <td>
                               <input type="file" name="filepic" class="form-control" required=""/>
                           </td> 
                       </tr>
                       <tr>
                          
                           <th>Student Name : </th>
                           <td>
                               <input type="text" name="name" value="<%=rs.getString("name")%> " class="form-control" required=""/>
                           </td>
                       
                       </tr>
                       <tr>
                           <th>Mobile No</th>
                           <td>
                               <input type="text" name="contactno" class="form-control" value="<%=rs.getString("contactno")%>"/>
                           </td>
                       </tr>
                      
                       <tr>
                           <th>Email Id: </th>
                           <td>
                                <input type="email" name="email" class="form-control" value="<%=rs.getString("emailaddress")%>"/>
                           </td>
                       </tr>
                       <tr>
                           <th>Address :</th>
                           <td>
                               <textarea name="address"  class="form-control" required=""><%=rs.getString("address")%></textarea>
                           </td>
                       </tr>
                       <tr>
                           <td colspan="2" align="center">
                               <input type="submit" value="Update" class="btn btn-primary"/>
                           </td>
                               
                          
                       </tr>
                   </table>
                   </form>
                   
                   <%
                       }
                       
                       }  
                       %>
                   
                   
                   
                   </div>
               </div>
           
           
          
               <%@include file="studentfootermaster.jsp" %>
           
        </div>
      
        
    </body>
</html>