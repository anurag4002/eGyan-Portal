<% 
    //Studentzone Logout
    
    session.invalidate();
    
    response.sendRedirect("../login.jsp");
    
%>
    