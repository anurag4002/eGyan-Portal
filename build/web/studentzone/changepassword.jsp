<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--Student zone
Change Password
----------------------------------------------------------------------------------->

<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || CHANGE PASSWORD</title>
        <%@include file="studentlinkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="studentheadermaster.jsp" %>

<div class="row mt-5">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 border" style="background:#f0f0f0">
                    <form action="complaintcode.jsp" method="post">
                        <h4 class="text-center mt-3"><b>CHANGE </b><b class="text-danger">PASSWORD</b></h4>
                        <label for="oldpass" class="col-form-label pt-3"> Enter Old Password<sup class="text-danger">*</sup></label>
                    <input type="password" class="form-control" name="oldpass" id="oldpass" placeholder="">
                    
                      <label for="newpass" class="col-form-label pt-3"> Enter New Password<sup class="text-danger">*</sup></label>
                    <input type="password" class="form-control" name="newpass" id="newpass" placeholder="">
                    
                    <label for="repass" class="col-form-label pt-3"> Re-Enter New Password<sup class="text-danger">*</sup></label>
                    <input type="password" class="form-control" name="repass" id="repass" placeholder="">
                    
                    <br/>
                    <center><input type="submit" value="Change Password" class="btn btn-danger mb-3" style="width:150px;"/></center> 
                </div>
                <div class="col-sm-4"></div>
                    
            </div>
            <div class="row" style="height: 270px"></div>

<!--footer=============================================================================------------------------------------>
 <%@include file="studentfootermaster.jsp" %>

        </div>
 </body>
</html>


