<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
</head>
<body>

	<h2>Vehicle Owner Address Form</h2>

	<form:form action="saveVehOwnerAddress" method="post" modelAttribute="ownerAddrObj">

		<table>
		
		<tr>
			<td>ID</td>
			<form:hidden path="id"/>
		</tr>
		
			<tr>
				<td>Enter House No:</td>
				<td><form:input path="houseNumber" /></td>
			</tr>

			<tr>
				<td>Enter Street Name:</td>
				<td><form:input path="streetName" /></td>
			</tr>

			<tr>
				<td>Choose City Name:</td>
				<td><form:select path="cityName">
						<form:option value="">-SELECT-</form:option>
						<form:option value="HYD">HYD</form:option>
						<form:option value="CHN">CHN</form:option>
						<form:option value="AJM">AJM</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td>Enter Zip Code:</td>
				<td><form:input path="zipCode" /></td>
			</tr>

			<tr>
				<td><input type="reset" value="Previous"></td>
				<td><input type="submit" value="Next"></td>
			</tr>


		</table>









	</form:form>
</body>
</html>