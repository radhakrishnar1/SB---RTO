<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner</title>
<script type="text/javascript" src="./views/js/jquery.validate.js"></script>
<script type="text/javascript" src="./views/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="./views/js/jquery.app.js"></script>
<style type="text/css">
.error{color:red}

</style>
</head>
<body>
	<h2>Vehicle Owner Form</h2>
	<form:form action="saveOwnerDtls" method="post" modelAttribute="ownerObj" id= "ownerForm">
		<table>

			<tr>

				<td>First Name:</td>
				<td><form:input path="firstName" /></td>

			</tr>

			<tr>

				<td>Last Name:</td>
				<td><form:input path="lastName" /></td>

			</tr>

			<tr>

				<td>Email:</td>
				<td><form:input path="emailId" /></td>

			</tr>

			<tr>

				<td>Mobile No:</td>
				<td><form:input path="mobileNumber" /></td>

			</tr>

			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="Male" />Male
				<td><form:radiobutton path="gender" value="Female" />Female</td>
			</tr>

			<tr>

				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Next"></td>

			</tr>


		</table>

	</form:form>




</body>
</html>