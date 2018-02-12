<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Input text</title>
</head>
<body>

	<jsp:include page="introduction.jsp" />
	<p>
		<br></br>
	</p>
	<h3 align="center">Enter any text:</h3>

	<form method="post" action="MainServlet">

		<p align="center">
			<textarea rows="10" cols="50" name="inputData"></textarea>
		</p>
		<br>
		<p align="center">
			<input type="submit" value="Submit" style="width: 25x; height: 40px">
	</form>
	<p>
		<strong><output name="labelAll">${sessionScope.labelAll}</output></strong>
		<output name="resultAll">${sessionScope.resultAll}</output>
	</p>
	<p>
		<strong><output name="labelFind">${sessionScope.labelFind}</output></strong>
		<output name="resultFind">${sessionScope.resultFind}</output>
	</p>

	<%
		session.setAttribute("sessionStep", true);
	%>

</body>
</html>
