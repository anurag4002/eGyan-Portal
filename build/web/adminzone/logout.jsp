<% 
    
    // Admin Zone Log out code
    session .invalidate();//session clear ,close,kill
    response.sendRedirect("../login.jsp");
    
 %>