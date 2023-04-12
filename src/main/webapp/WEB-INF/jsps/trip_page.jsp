<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trip Registration</title>
</head>
<body>
	<h3 align="center">Trip | Registration</h3>
	<form action="save" method="post">
		<table align="center">
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td>Aadhar_Number:~</td>
				<td><input type="number" name="aadharId"/></td>
			</tr>
			<tr>
				<td>Name:~</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>Address:~</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>Email:~</td>
				<td><input type="email" name="email"/></td>
			</tr>
			<tr>
				<td>Mobile:~</td>
				<td><input type="tel" name="mobile"/></td>
			</tr>
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save Details"/></td>
			</tr>
		</table>
	</form>
	<h3 align="center"><a href="All_Details">Trip Details List</a></h3>
</body>
</html>