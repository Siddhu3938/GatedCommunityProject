<%@page import="com.Model.Complaint"%>
<%@page import="com.dao.admindao"%>
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
 admindao ado = new admindao();
  int id=Integer.parseInt(request.getParameter("complaintId"));
Complaint c=  ado.getbyid(id);
%>
<form action="StatusUpdate"><br><br><br><br><br><br><br>
<input type="number"  name="complaintId" value="<%=c.getComplaintId() %>" hidden=""><br><br>
Status&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;:<input type="text"  name="status" value="<%=c.getStatus() %>"><br><br>
<input type="submit" value="submit">
</form>
</center>
</body>
</html>