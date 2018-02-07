<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<form action="NewUser.jsp" method="post">
		<table>
			<thead>
				<tr>
					<th colspan="2">Register New User</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>User Name</td>
					<td><input type="text" placeholder="Enter Username"
						name="newUserName" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" placeholder="Enter Password"
						name="newUserPass" required></td>
				</tr>
				<tr>
					<td><button type="submit">Submit</button></td>
					<td><button type="reset">Reset</button></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>