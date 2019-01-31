<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Add User Form</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div id="addUser">
		<form name='form-add' action="login.ttm?method=addUser" method="post">
			<span class="fontawesome-user"></span> <input type="text" id="user" placeholder="Username" name="userName"> 
			<span class="fontawesome-lock"></span> <input type="password" id="pass" placeholder="Password" name="password"> 
			<span class="fontawesome-lock"></span> <input type="password" id="repass" placeholder="Re-enter Password" name="Password"> 
			<input type="submit" value="Add User">

		</form>

	</div>

</body>

</html>
