
<%@page import="connect.DbManager"%>
<!-- Headline start =================================================================================================================================-->   
            
<div class="row bg-danger text-light">
    <div class="col-sm-4">
        Welcome to Student Zone
    </div>
        <div class="col-sm-4">
        <%=new DbManager().getDate() %>
        </div>
        <div class="col-sm-4">
            <%=session.getAttribute("studentid") %>
        </div>

</div>
                
<!-- Headline end================================================================================================================================================-->
                
<!-- Header start================================================================================================================================================--->
                
<div class="row">
    <div class="col-sm-1">
        <img src="images/logo.png" class="logo"/>
    </div>
    <div class="col-sm-7">
        <h4 class="text-danger pt-4"><b>Nalanda eGyan Portal</b></h4>
        <p>(An Inititative Taken By Nalanda Open University)</p>
    </div>
    <div class="col-sm-4 ">
        <ul class="smi text-center mt-4">
            <li><i class="fa-brands fa-facebook-f"></i></li>
            <li><i class="fa-brands fa-instagram"></i></li>
            <li><i class="fa-brands fa-whatsapp"></i></li>					  
            <li><i class="fa-brands fa-twitter"></i></li>
        </ul>
    </div>
</div>

<!-- Header end ==================================================================================================================================================-->
                
<!--Navbar start ================================================================================================================================================-->

<div class="row  border">
    <div class="col-sm-12  p-0" >
        <nav class="navbar navbar-expand-lg " >
            <div class="container-fluid">
                <a class="navbar-brand" href="#" style="color:#000035"s><b>NOULMS</b></a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedCsontent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0" >
                       <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="welcome.jsp"><b>Dashboard</b></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="feedback.jsp"><b>Feedback</b></a>
                        </li>
                        
                        <li class="nav-item dropdown" style="display:none;">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false" ><b>Course</b></a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="course.jsp" ><b>Courses</b></a></li>
                                <li><a class="dropdown-item" href="studycenter.jsp" ><b>Study Center</b></a></li>
                            </ul>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link" href="course.jsp" ><b>Courses</b></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="studymaterial.jsp" ><b>Study Material</b></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="profile.jsp" ><b>Profile</b></a>
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="complaint.jsp" ><b>Complaint</b></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="changepassword.jsp" ><b>Changes Password</b></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="logout.jsp" ><b>Log out</b></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>

<!-- Navbar end==================================================================================================================================================-->
 


