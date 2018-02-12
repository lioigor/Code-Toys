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
	<p>
		<br></br>
	</p>
	
	<h3 align="center">List of patients, medical record number for which is in a given range:</h3>

	<form method="post" action="PatientServlet">
	<p align="center">Min range:
	<p align="center">
		<input name="minrange" type="text" /> <br>
		<p align="center">Max range:
	<p align="center">
		<input name="maxrange" type="text" /> <br>
	<p align="center">
	<input type="hidden" name="command" value="viewcardnumberlist" />
		 <input type="submit" name="accept" value="Find"
			style="width: 25x; height: 40px">
	</form>
	
	<form method="post" action="patientInfo.jsp">
		<p align="center">
			<input type="submit" name="back" value="Go back"
				style="width: 25x; height: 40px">
	</form>

</body>
</html>
