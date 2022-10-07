<%-- 
    Document   : index
    Created on : 25 Aug, 2022, 1:44:00 PM
    Author     : ANURAG MISHRA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NOULMS || Registration</title>
        <%@include file="linkmaster.jsp" %>
    </head>
    <body>
        <div class="container-fluid">
            <%@include file="headermaster.jsp" %>
            
<!-- outer start=================================================================================================================================================-->
                
 <!--Registration Start=========================================================================================================================================-->                 
 
 
 <div class="row  " style="background:linear-gradient(45deg,red ,white);">
     <div class="col-sm-2"></div>
     <div class="col-sm-8 rounded pt-5">
         <center> <h3 style="color:#004080"><b>Registration <span class="text-danger">Form</span></b></h3></center>
         
         <form action="regcode.jsp" method="post">
         <div class="row mb-4 pt-5 rounded mt-4" style="background:#f0f0f0;">

             <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="enrollmentno" class="form-label">
                     Enrollment No<sup style="color:red">*</sup>
                 </label>
                 <input type="text" class="form-control" id="enrollmentno" required="true" name="enrollmentno"/>
             </div>
             
 <!--Name=================================================================-->            
             <div class="col-sm-4 mb-3">
                 <label for="name" class="form-label">
                     Name<sup style="color:red">*</sup>
                 </label>
                 <input type="text" class="form-control" id="name" required="true" name="name"/>
             </div>
             <div class="col-sm-2"></div>

<!--Fname=================================================================--->
              <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="fname" class="form-label">
                     Father's Name<sup style="color:red">*</sup>
                 </label>
                 <input type="text" class="form-control" id="fname" required="true" name="fname"/>
             </div>

<!--mname=================================================================--->
             <div class="col-sm-4 mb-3">
                 <label for="mname" class="form-label">
                     Mother's Name<sup style="color:red">*</sup>
                 </label>
                 <input type="text" class="form-control" id="mname" required="true" name="mname"/>
             </div>
             <div class="col-sm-2"></div>
             
<!--Address===============================================================--->

<div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="address" class="form-label">
                     Address<sup style="color:red">*</sup>
                 </label>
            <textarea cols="5" row="5" class="form-control" id="address" required="true"value="address" name="address" ></textarea>             
             </div>

<!--Gender=============================================================---->
            <div class="col-sm-4  pt-4 mb-3">
                  <label for="gender" class="form-label">
                     Gender<sup style="color:red">*</sup>&nbsp;
                 </label>
                 
                 &nbsp;&nbsp;<input type="radio"  id="gender" required="true" name="gender" value="Male"/>Male
                
                  &nbsp;&nbsp;<input type="radio" id="gender" required="true" name="gender" value="Male"/>Female

             </div>
             <div class="col-sm-2"></div>

<!--Contact===========================================================----->
 <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="contactno" class="form-label">
                     Contact No<sup style="color:red">*</sup>
                 </label>
                 <input type="number" class="form-control" id="contactno" required="true" name="contactno"/>
             </div>
             
<!--Emai============================================================-------->
             <div class="col-sm-4 mb-3">
                 <label for="emailaddress" class="form-label">
                     Email Id<sup style="color:red">*</sup>
                 </label>
                 <input type="email" class="form-control" id="emailaddress" required="true" name="emailaddress"/>
             </div>
             <div class="col-sm-2"></div>
             
<!--Date=================================================================----->
 <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="dob" class="form-label">
                     Date<sup style="color:red">*</sup>
                 </label>
                 <input type="Date" class="form-control" id="dob" required="true" name="dob"/>
             </div>
<!--Aadhar no=============================================================--->

             <div class="col-sm-4 mb-3">
                 <label for="aadharno" class="form-label">
                     Aadhar No<sup style="color:red">*</sup>
                 </label>
                 <input type="number" class="form-control" id="aadharno" required="true" name="aadharno"/>
             </div>
             <div class="col-sm-2"></div>

<!--Course===========================================================---------->
             <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="course" class="form-label">
                     Course<sup style="color:red">*</sup>
                 </label>
                 <select  name="course" class="form-control" required="true">
                     <option>---Select---</option>
                     <option>MCA</option>
                     <option>BCA</option>
                     <option>B.Tech</option>
                     <option>Diploma</option>
                </select>
             </div>
             
<!--Year===================================================================---->
             <div class="col-sm-4 mb-3">
                 <label for="year" class="form-label">
                     Course<sup style="color:red">*</sup>
                 </label>
                 <select  name="year"  class="form-control" required="true">
                     <option value="">---Select---</option>
                     <option>First Year</option>
                     <option>Second Year</option>
                     <option>Third Year</option>
                     <option>Forth Year</option>

                </select>
             </div>
    
                         <div class="col-sm-2"></div>

<!--centername===========================================================--->
               <div class="col-sm-2"></div>
             <div class="col-sm-4 mb-3">
                 <label for="centername" class="form-label">
                     Centername<sup style="color:red">*</sup>
                 </label>
                 <input type="text" class="form-control" id="centername" required="true" name="centername"/>
             </div>
             
             
             
             <div class="col-sm-4 mb-3">
                 <label for="password" class="form-label">
                     Password<sup style="color:red">*</sup>
                 </label>
                 <input type="password" class="form-control" id="password" required="true" name="password"/>
             </div>
             <div class="col-sm-2"></div>
             
             
             
             
             
             
             <div class="row pb-3">
                 <div class="col-sm-5"></div>
             <div class="col-sm-2">
                 
                 <input type="submit" value="SUBMIT" class=" btn btn-danger form-control"/>
             </div>
                 <div class="col-sm-5"></div>
                 </div>
 </div>
     </form>

 </div
 </div>
 
   <div class="col-sm-2"></div>
 </div>
 
 
 <!--Registration End===========================================================================================================================================--->
 
 <%@include file="footermaster.jsp" %>
    
 <!-- outer end -->

    </div>
    </body>
</html>


