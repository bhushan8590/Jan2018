<!DOCTYPE html>
<html>
<body>

	<h2>Hello, Welcome To Car dealer Website...!</h2>
	<form action="ControllerServlet" method="post">
	<input type="hidden" name="CAR" value="CAR_FORM">
		<table>
			<thead>
				<tr>
					<th colspan="2">Login User</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Car Name</td>
					<td><input type="text" placeholder="Enter car name"
						name="cname" required></td>
				</tr>
				<tr>
					<td>Make</td>
					<td><input type="text" placeholder="Enter car Make"
						name="cmake" required></td>
				</tr>
				<tr>
					<td>Make Year</td>
					<td><input type="text" placeholder="Enter car make year"
						name="cmake_year" required></td>
				</tr>
				<tr>
					<td>Car type</td>
					<td><input type="text" placeholder="Enter car type"
						name="ctype" required></td>
				</tr>
				<tr>
					<td>Color</td>
					<td><input type="text" placeholder="Enter car color"
						name="ccolor" required></td>
				</tr>
				<tr>
					<td>Car Price</td>
					<td><input type="text" placeholder="Enter car price"
						name="cprice
						" required></td>
				</tr>
				<tr>
					<td><button type="submit">Login</button></td>
					<td><button type="reset">Reset</button></td>
				</tr>
				<tr>
					<td colspan="2">New User <a href="Register.jsp">Register
							here</a></td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>
