<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>VEHICLE OWNER DETAILS</h1>
<form:form action="saveVehicleDetails" method="POST" modelAttribute="vehicleDetailsObj">
	<table>
	<tr>
	<td>ID</td>
	<td>${vehicleDetailsObj.id}</td>
	<form:hidden path="id"/>
	</tr>
	 <tr>
			<td>Enter Vehicle Type</td>
			<td>
			<form:select path="vehType">
				<form:option value="">-SELECT-</form:option>
				<form:option value="2-wheeler">2-wheeler</form:option>
				<form:option value="4-wheeler">4-wheeler</form:option>
				<form:option value="6-wheeler">6-wheeler</form:option>
			</form:select>
			</td>
		</tr>
		
		<tr>
			<td>Enter Company name</td>
			<td><form:input path="vehCmpName"/></td>
		</tr>
		 
		<tr>
			<td>Enter Manufacturing Year</td>
			<td><form:input path="vehMfcYear"/></td>
			</tr>
	 
			
			
		<tr>
			<td>Enter Vehicle color</td>
			<td><form:input path="vehColr"/></td>
		</tr>
		<tr>
			
			<td><input type="reset" value="Clear"></td>
			<td><input type="submit" value="Next"/></td>
		</tr>
		 
		</table>
</form:form>

</body>
</html>