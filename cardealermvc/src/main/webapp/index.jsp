<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form method="post" action="http://localhost:8080/cardealermvc/user/authenticate.do">
	<input type="hidden" name="login" value="login_form">
		<table>
			<tr>
				<td><label><b>Username</b></label></td>
				<td><input type="text" placeholder="Enter Username" name="name"
					required></td>
			</tr>
			<tr>
				<td><label><b>Password</b></label><br></td>
				<td><input type="password" placeholder="Enter Password"
					name="password" required></td>
			</tr>
			<tr>
			<td><input type="submit" value="Submit"></td>
			<td><a href="register.jsp">Register Here</a></td>
			</tr>
			
		</table>
	</form>
</body>
</html>