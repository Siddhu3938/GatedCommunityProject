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
<form action="signin" method="post"><br><br><br>
<h2>SignUp</h2>
UserName :<input type="text" name="userName"><br><br>
password :<input type="password" name="password"><br><br>
Email &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :<input type="email" name="email"><br><br>
phone &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:<input type="text" name="phone"><br><br>
role &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio"  name="role" value="admin">Admin
                                    <input type="radio"   name="role" value="User">User<br><br><br>
<input type="submit" value="click">
</form>
</center>
</body>
</html>