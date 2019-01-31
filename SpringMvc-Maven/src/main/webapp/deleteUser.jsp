<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Delete User Form</title>
<link rel="stylesheet" href="css/style.css">
</head>

<body>
	<div id="deleteUser">
		<form name='form-delete' action="login.ttm?method=deleteUser" method="post">
			<span class="fontawesome-user"></span> <input type="text" id="user" placeholder="Username" name="userName"> 
			<input type="submit" value="Delete User">

		</form>

	</div>

</body>

</html>
