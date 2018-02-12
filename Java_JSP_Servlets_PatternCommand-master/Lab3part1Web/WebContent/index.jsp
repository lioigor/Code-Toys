<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Laboratory work 2</title>
<style>
.layer1 {
	margin-left: 5%;
}

.b1 {
	background: grey;
	color: white;
	font-size: 10pt;
}
</style>
</head>
<body>
	<jsp:include page="introduction.jsp" />
	<p>
		<br></br>
	</p>
	<font size="5" face="Arial">
		<h2 align="center">Laboratory work №3 Web</h2>
		<h2 align="center">Task 1</h2>
		<p align="center">Welcome! This program solves the problem, the
			condition of which is shown below...</p> <br>
		<div class="layer1">
			<p align="center">
				<b>Task.</b> Patient: id, name, first name, address, phone, medical
				record number, diagnosis. Create an array of objects.
			</p>
			<p>Display:
			<p>a) a list of patients with this diagnosis;</p>
			<p>b) a list of patients, medical record number for which is in a
				given range.</p>
			<p>
			<form action="patientInfo.jsp">
				<p align="center">
					<input type="submit" value="   Continue   "
						style="width: 25x; height: 40px" class="b1">
			</form>
		</div>
	</font>

</body>
</html>