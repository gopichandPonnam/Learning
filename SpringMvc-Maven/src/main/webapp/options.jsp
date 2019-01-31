<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Option</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>
		Welcome
	</h1>
	<div id="options">	
		<a href= "addUser.jsp"><input id="add" type="submit" value="Add User"></a>
		<a href = "updateUser.jsp">	<input id="update" type="submit" value="Update User"></a>
		<a href = "deleteUser.jsp">	<input id="delete" type="submit" value="Delete User"></a>
		<form method="post" action="login.ttm?method=logout"><input id="log-out" type="submit" value="Logout"></form>
	</div>
</body>
</html>