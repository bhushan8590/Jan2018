<!DOCTYPE html>
<html>
<body>

	<h2>Hello, Welcome To Car dealer Website...!</h2>
	<form action="login.jsp" method="post">
		<table>
			<thead>
				<tr>
					<th colspan="2">Login User</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" placeholder="Enter Username"
						name="uname" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" placeholder="Enter Password"
						name="upass" required></td>
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
