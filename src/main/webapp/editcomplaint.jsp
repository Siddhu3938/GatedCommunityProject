<%@page import="com.Model.Complaint"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Complaints</title>
</head>
<body>
<table border="1">
<tr>
<th>ID</th>
<th>email</th>
<th>complaint</th>
<th>flatNumber</th>
<th>date</th>
<th>phoneNumber</th>
<th>status</th>
</tr>
<% List<Complaint> list=(List<Complaint>) request.getAttribute("list");
if(list!=null)
{
for(Complaint c : list)
{
%>	
<tr>
<td> <%=c.getComplaintId() %></td>
<td><%=c.getEmail() %></td>
<td><%=c.getComplaint() %></td>
<td><%=c.getFlatNumber() %></td>
<td><%=c.getDate() %></td>
<td><%=c.getPhoneNumber() %></td>
<td><%=c.getStatus() %></td>
<td> <a href="Updatecomplaint.jsp?complaintId=<%=c.getComplaintId()%>">Update</a></td>
<td> <a href="deletecomplaint?complaintId=<%= c.getComplaintId() %>">Delete</a></td>
</tr>
<%
}
}
%>
</table>
</body>
</html>