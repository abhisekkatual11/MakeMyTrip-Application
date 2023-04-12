<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Trip | Update</title>
</head>
<body>
	<h3 align="center">Trip | Update</h3>
	<form action="updateTrip" method="post">
		<table align="center">
			<tr>
				<td><hr></td>
				<td><hr></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="hidden" name="aadharId" value="${id.aadharId}"/></td>
			</tr>
			<tr>
				<td>Name:~</td>
				<td><input type="text" name="name" value="${id.name}"/></td>
			</tr>
			<tr>
				<td>Address:~</td>
				<td><input type="text" name="address" value="${id.address}"/></td>
			</tr>
			<tr>
				<td>Email:~</td>
				<td><input type="email" name="email" value="${id.email}"/></td>
			</tr>
			<tr>
				<td>Mobile:~</td>
				<td><input type="tel" name="mobile" value="${id.mobile}"/></td>
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
</body>
</html>