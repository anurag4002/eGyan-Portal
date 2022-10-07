<%-- 
    Document   : index
    Created on : 25 Aug, 2022, 1:44:00 PM
    Author     : ANURAG MISHRA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || LOGIN</title>
        <%@include file="linkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="headermaster.jsp" %>
            
<!-- outer start=================================================================================================================================================-->
                

 <div class="row bg-primary " style="height: 700px;">
     <div class="col-sm-4"></div>
     <div class="col-sm-4 shadow-lg rounded bg-light mt-5 pt5" style="height: 460px;">
         <div class="row">
             <div class="col-sm-12">
                 <div class="p-5">
                     <div class="text-center">
                         <img src="images/logo.png" width="15%">
                         <h5 class="h5 text-gray-900 mb-4">University Login</h5>
                     </div>
                     <form action="logincode.jsp" method="post">
                         <div class="form-group">
                             <input type="text" class="form-control form-control-user" id="userid" name="userid" value=""  placeholder="Enter Signin Id">
                         </div><br/>
                         <div class="form-group">
                             <input type="password" class="form-control form-control-user" id="pwd" name="pwd" placeholder="Enter Password">
                         </div>
                         <br/>
                         <center><button type="submit" class="btn btn-primary btn-user btn-block w-100">Login</button></center>
                     </form>
                     
                     <hr>
                     <div class="text-center">
                         <a class="small" href="#">Forgot Password?</a>
                     </div>
                     
                     <div class="col-sm-4"></div>
                         
                 </div>
                     
             </div>
                 
         </div>
             
     </div>
         
     </div>
 
<div class="row text-light p-0 " style="background: #7d0000">
                     <div class="col-sm-12  col-xs-12 text-center">
                        <p>Copyright 2019 - 2022 © NALANDA UNIVERSITY</p>
                     </div>
                  </div> 
 
 
    
 <!-- outer end -->
 
 

        </div>
    </body>
</html>


