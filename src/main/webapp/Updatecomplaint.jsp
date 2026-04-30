<%@page import="java.util.List"%>
<%@page import="com.Model.Complaint"%>
<%@page import="com.dao.userdao"%>
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
<%
int id= Integer.parseInt( request.getParameter("complaintId"));
userdao dao = new userdao();
Complaint c=  dao.getbyid(id);
%>
<form action="updatecomplaint" method="post"><br><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :<input type="hidden"  name="complaintId"value="<%=c.getComplaintId() %>" ><br><br>
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :<input type="hidden"  name="email"value="<%=c.getEmail() %>" ><br><br>
complaint&nbsp;&nbsp; :<input type="text" name="complaint" value="<%=c.getComplaint() %>"><br><br>
flatNumber:<input type="text" name="flatNumber"value="<%=c.getFlatNumber() %>"><br><br>
date &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;:<input type="date" disabled="disabled"  name="date" value="<%=c.getDate() %>"><br><br>
phone&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;:<input type="text" name="phoneNumber" value="<%=c.getPhoneNumber() %>"><br><br>
&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<input type="hidden"  name="status" value="<%=c.getStatus() %>"><br><br>
<input type="submit" value="submit">
</form>
</center>
</body>
</html>