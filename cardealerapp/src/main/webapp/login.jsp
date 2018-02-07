<%@ page import="com.dealer.dbconnection.*"%>
<%
String userName = request.getParameter("uname");
String userPassword = request.getParameter("upass");

if(ExecuteQuery.validateUser(userName, userPassword)){
	session.setAttribute("user", userName); 
	response.sendRedirect("welcome.jsp");
}else{
	out.println("User name or password is incorrect please <a href='index.jsp'>try again</a>");
}
%>