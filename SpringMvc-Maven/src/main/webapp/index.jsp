<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div id="login">
	<form name = "form-login" action="login.htm" method = "post">
		<span class="fontawesome-user"></span><input type ="text" name="userName" placeholder="Username" />
		<span class="fontawesome-lock"></span><input type="password" name="password" placeholder="Password" />
		<input type="submit" name="submit" value="Login"/>
 	</form>
	</div>

</body>

</html>
