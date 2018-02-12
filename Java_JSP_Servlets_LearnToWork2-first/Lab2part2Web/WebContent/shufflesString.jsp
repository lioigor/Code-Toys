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
	<h3 align="center">Enter any string:</h3>

	<form method="post" action="MainServlet">

		<p align="center">
			<textarea rows="10" cols="50" name="inputData"></textarea>
		</p>
		<br>
		<p align="center">
			<input type="submit" value="Make a reverse string"
				style="width: 25x; height: 40px">
	</form>
	<p>
		<strong><output name="labelRevByArray">${sessionScope.labelRevByArray}</output></strong>
		<output name="resultRevByArray">${sessionScope.resultRevByArray}</output>
	</p>
	<p>
		<strong><output name="labelRevByStack">${sessionScope.labelRevByStack}</output></strong>
		<output name="reultRevByStack">${sessionScope.reultRevByStack}</output>
	</p>
	<p>
		<strong><output name="labelRevByStrBuild">${sessionScope.labelRevByStrBuild}</output></strong>
		<output name="reultRevByStrBuild">${sessionScope.reultRevByStrBuild}</output>
	</p>
	<p>
		<strong><output name="labelRevByRecursion">${sessionScope.labelRevByRecursion}</output></strong>
		<output name="reultRevByRecursion">${sessionScope.reultRevByRecursion}</output>
	</p>

	<%
		session.setAttribute("sessionStep", true);
	%>

</body>
</html>
