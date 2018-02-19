<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%-- <%@page import="java.util.ArrayList"%>
<%@page import="com.cardealermvc.java.*"%>
 --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h2>Welcome page</h2>
	<%=request.getAttribute("message")%>
	<table width="30" border="1">
		<caption>
			<em>Available cars</em>
		</caption>
		<c:forEach var="car" items="${carlist}">
			<tr>
				<td>${car.model_id.name}</td>
				<td>${car.model_id.make}</td>
				<td>${car.make_year}</td>
				<td>${car.type}</td>
				<td>${car.color}</td>
				<td>${car.model_id.price}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>