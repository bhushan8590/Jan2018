<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="com.carproject.java.*"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>B Jsp</title>
</head>
<body>
<%-- <h2>Welcome to B jsp</h2>

<table width="30" border="1">
		<caption>
			<em>Available cars</em>
			<label>Using Session</label>
		</caption>
		<%
			ArrayList<Car> carList1;
		    carList1 = (ArrayList<Car>)session.getAttribute("clist");
		    for(Car car: carList1){
		%>
		<tr>
			<td><%=car.getName()%></td>
			<td><%=car.getMake()%></td>
			<td><%=car.getMake_year()%></td>
			<td><%=car.getType()%></td>
			<td><%=car.getColor()%></td>
			<td><%=car.getPrice()%></td>
		</tr>
		<%
			}
		%> --%>
	</table>
	<br>
	<%-- IT throws Internal server error i.e. HTTP status 500 and NullPointerException
	<table width="30" border="1">
		<caption>
			<em>Available cars</em>
			<label>Using request</label>
		</caption>
		<%
			ArrayList<Car> carList;
		    carList = (ArrayList<Car>)request.getAttribute("list");
		    for(Car car: carList){
		%>
		<tr>
			<td><%=car.getName()%></td>
			<td><%=car.getMake()%></td>
			<td><%=car.getMake_year()%></td>
			<td><%=car.getType()%></td>
			<td><%=car.getColor()%></td>
			<td><%=car.getPrice()%></td>
		</tr>
		<%
			}
		%>
	</table> --%>
<%-- <%
	 ArrayList<Car> carList;
/*out.println("Using request");
	carList = (ArrayList<Car>)request.getAttribute("list");
	for(Car car: carList){
		out.println(car.getName()+" "+car.getMake()+" "+car.getMake_year()+" "+car.getType()+" "+car.getColor()+" "+car.getPrice());
	}*/
 	out.println("Using session");
	carList = (ArrayList<Car>)session.getAttribute("clist");
	for(Car car: carList){
		out.println(car.getName()+" "+car.getMake()+" "+car.getMake_year()+" "+car.getType()+" "+car.getColor()+" "+car.getPrice());
	}
%>
 --%>
 </body>
</html>