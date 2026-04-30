<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="Login" method="post"><br><br><br>
<h2>Login</h2>
Email &nbsp;&nbsp;&nbsp;  :<input type="email" name="email"><br><br>
password :<input type="password" name="password"><br><br>
role &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  name="role" value="admin">Admin
                                    <input type="radio"   name="role" value="User">User<br><br><br>
<input type="submit" value="click">
</form>
</center>
</body>
</html>