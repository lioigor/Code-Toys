<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main page</title>
</head>
<body>

	<jsp:include page="introduction.jsp" />
	<jsp:include page="display.jsp" />
	
	<h3 align="center">Fill in the fields:</h3>

	<form method="post" action="PatientServlet">
	<p align="center">ID:
	<p align="center">
		<input name="id" type="text" />
	<p align="center">surname:
	<p align="center">
		<input name="surname" type="text" />
	<p align="center">name:
	<p align="center">
		<input name="name" type="text" />
	<p align="center">patronymic:
	<p align="center">
		<input name="patronymic" type="text" />
	<p align="center">address:
	<p align="center">
		<input name="address" type="text" />
	<p align="center">phone:
	<p align="center">
		<input name="phone" type="text" />
	<p align="center">medicalCard:
	<p align="center">
		<input name="medicalCard" type="text" />
	<p align="center">diagnosis:
	<p align="center">
		<input name="diagnosis" type="text" /> <br>
	<p align="center">
		<input type="hidden" name="command" value="accept" /> <input
			type="submit" name="accept" value="Accept a patient"
			style="width: 25x; height: 40px">
	</form>

	<form method="post" action="PatientServlet">
	<p align="right">
		<input type="hidden" name="command" value="diagnosisList" /> <input
			type="submit" name="diagnosis" value="           See list diagnosis          "
			style="width: 25x; height: 40px">
	</form>

	<form method="post" action="PatientServlet">
	<p align="right">
		<input type="hidden" name="command" value="cardNumberIntervalList" />
		<input type="submit" name="card"
			value="See list medical record number"
			style="width: 25x; height: 40px">
	</form>

	<form method="post" action="PatientServlet">
	<p align="right">
		<input type="hidden" name="command" value="existingPatientList" /> <input
			type="submit" name="existPatients" value="        See existing patients         "
			style="width: 25x; height: 40px">
	</form>
	
	<form method="post" action="index.jsp">
		<p align="right">
			<input type="submit" name="back" value="Go back"
				style="width: 25x; height: 40px">
	</form>

</body>
</html>
