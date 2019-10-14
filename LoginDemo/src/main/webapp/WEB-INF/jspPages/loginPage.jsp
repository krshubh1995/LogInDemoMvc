<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn Page</title>
</head>
<body>

	<h1>LogIn</h1>
	<form action="./login"  method="post">
	<table>
		<tr>
			<td>User:</td>
			<td><input name="userId" type="text"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input name="password" type="text"></td>
		</tr>


	</table>
	    <input value="LogIn" type="submit">
</form>
</body>
</html>