<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of patients</title>
</head>
<body>

	<p>
		<br></br>
	</p>

	<h2 align="center">List of patients, medical record number whose is between ${interval}:</h2>

	<p>
		<br></br>
	</p>

	<c:if test="${resultList.isEmpty()}">
		<p align="center" style="font: 20px arial;">Patients who have a medical record number between
			${interval} not found!!!
	</c:if>

	<c:if test="${!resultList.isEmpty()}">

		<table border="1" style="font: 20px arial;" align="center">

			<tr>
				<th>ID</th>
				<th>Last Name</th>
				<th>First Name</th>
				<th>Patronymic</th>
				<th>Address</th>
				<th>Phone</th>
				<th>MedicalCard</th>
				<th>Diagnosis</th>
			</tr>
			<c:forEach var="row" items="${resultList}">
				<tr>
					<td>${row.id}</td>
					<td>${row.surName}</td>
					<td>${row.name}</td>
					<td>${row.patronymic}</td>
					<td>${row.address}</td>
					<td>${row.phone}</td>
					<td>${row.medicalCard}</td>
					<td>${row.diagnosis}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>


	<jsp:include page="introduction.jsp" />
	<p>
		<br></br>
	</p>

	<form method="post" action="chooseintervalnumber.jsp">
		<p align="center">
			<input type="submit" name="back" value="Go back"
				style="width: 25x; height: 40px">
	</form>

</body>
</html>
