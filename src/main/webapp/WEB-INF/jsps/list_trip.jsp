<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List | Trip</title>
</head>
<body>
	<a href="back">Back To Home Page</a>
	<table align="center" border="1">
		<tr>
			<th>Aadhar_Number</th>
			<th>Name</th>
			<th>Address</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>UPDATE</th>
			<th>DELETE</th>
		</tr>
		<c:forEach var="all" items="${all}">
			<tr>
				<td>${all.aadharId}</td>
				<td>${all.name}</td>
				<td>${all.address}</td>
				<td>${all.email}</td>
				<td>${all.mobile}</td>
				<td><a href="update?aadharId=${all.aadharId}">update</a></td>
				<td><a href="delete?aadharId=${all.aadharId}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	${msgg}<br>
	${msg}
</body>
</html>