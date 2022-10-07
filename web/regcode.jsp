<%@page import="connect.DbManager"%>
<%
    String enrollmentno=request.getParameter("enrollmentno");
    String name=request.getParameter("name");
    String fname=request.getParameter("fname");
    String mname=request.getParameter("mname");
    String gender=request.getParameter("gender");
    String address=request.getParameter("address");
    String contactno=request.getParameter("contactno");
    String emailaddress=request.getParameter("emailaddress");
    String dob=request.getParameter("dob");
    String aadharno=request.getParameter("aadharno");
    String course=request.getParameter("course");
    String year=request.getParameter("year");
    String centername=request.getParameter("centername");
    String password=request.getParameter("password");
    
    // this query is use to insert according database 
    String cmd="insert into studentinfo(enrollmentno,name,fname,mname,gender,address,contactno,emailaddress,dob,aadharno,course,year,centername,registrationdate,pwd	)    values('"+enrollmentno+"','"+name+"','"+fname+"','"+mname+"','"+gender+"','"+address+"','"+contactno+"','"+emailaddress+"','"+dob+"','"+aadharno+"','"+course+"','"+year+"','"+centername+"',curdate(),'"+password+"')";
    
   // out.print(cmd);
     DbManager db=new DbManager();
    
      boolean status=db.insertUpdateDelete(cmd);
      if(status==true)
      {
          out.print("Registration Success");
          
      }
      else
      {
          out.print("Registration is not success");
      }
    
    
    
%>