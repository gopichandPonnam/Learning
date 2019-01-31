<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Update User Form</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div id="updateUser">
		<form name='form-update' action="login.ttm?method=updateUser" method="post">
			<span class="fontawesome-user"></span> <input type="text" id="user" placeholder="Username" name="userName">
			<!-- <input type="submit" value="Get User"> --> 
			<span class="fontawesome-lock"></span> <input type="password" id="pass" placeholder="Password" name="password"> 
			<span class="fontawesome-lock"></span> <input type="password" id="repass" placeholder="Re-enter Password" name="repassword"> 
			<input type="submit" value="Update User">

		</form>

	</div>

</body>

</html>
