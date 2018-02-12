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
		<h2 align="center">Laboratory work №2 Web</h2>
		<p align="center">Welcome! This program solves the problem, the
			condition of which is shown below...</p> <br>
		<div class="layer1">
			<p align="center">
				<b>Task.</b> In the text to find and print the characters occurring
				most often.
			</p>
			<p>
			<form action="foundFrequently.jsp">
				<p align="center">
					<input type="submit" value="   Continue   "
						style="width: 25x; height: 40px" class="b1">
			</form>
		</div>
	</font>
	<%
		session.setAttribute("sessionStep", false);
	%>
</body>
</html>