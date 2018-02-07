<%@ page import="com.dealer.dbconnection.*"%>
<%
String userName = request.getParameter("newUserName");
String userPassword = request.getParameter("newUserPass");

if(ExecuteQuery.insertNewUser(userName, userPassword)){ 
	out.println("Register sucessfully click <a href='index.jsp'>login</a>");
}/* else{
	out.println("User name or password is incorrect please <a href='index.jsp'>try again</a>");
} */
%>