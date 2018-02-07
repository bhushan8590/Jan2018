<%@ page import="java.sql.ResultSet" import="com.app.db.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h3>
		<%
			out.print("Welcome " + session.getAttribute("user"));
		%>
	</h3>
	<a href="logout.jsp">Logout</a>
	<%
		/* //String name = request.getParameter("uname");
		String name = (String)session.getAttribute("user");
		out.print(name); */
		boolean flag = ExecuteQuery.isAdmin((String) session.getAttribute("user"));
		if (flag) {
	%>
	<table width="30" border="0">
		<caption>
			<em>Available cars</em>
		</caption>
		<tr>
			<td><a href="add.jsp"><button>Add</button></a></td>
		</tr>
		<%
			ResultSet rs = ExecuteQuery.query();
				while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getInt(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getInt(6)%></td>
			<td><a href="edit.jsp"><button>Edit</button></a></td>
			<td><form action="ControllerServlet" method="post">
					<input type="hidden" name="id" value="<%rs.getInt(7);%>">
					<input type="hidden" name="DELETE" value="DELETE_RECORD"> 
					<input type="submit" value="delete">
				</form></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		} else {
	%>
	<table width="30" border="1">
		<caption>
			<em>Available cars</em>
		</caption>
		<%
			ResultSet rs = ExecuteQuery.query();
				while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString(1)%></td>
			<td><%=rs.getString(2)%></td>
			<td><%=rs.getInt(3)%></td>
			<td><%=rs.getString(4)%></td>
			<td><%=rs.getString(5)%></td>
			<td><%=rs.getInt(6)%></td>
		</tr>
		<%
			}
		%>
	</table>
	<%
		}
	%>
</body>
</html>