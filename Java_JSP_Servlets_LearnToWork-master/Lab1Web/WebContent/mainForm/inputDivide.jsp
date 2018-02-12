<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Input numbers and divide numbers for 3 and 9</title>
</head>
<body>
	<jsp:include page="../pattern/introduction.jsp" />
	<p>
		<br></br>
	</p>
	<h3 align="center">Введите массив целых чисел через запятую:</h3>

	<form action="../ServletTask2">

		<p align="center">
			<textarea rows="10" cols="50" name="inputData"></textarea>
	</p>
			<p align="center">
	<input type="submit" value="Подтвердить"
				style="width: 25x; height: 40px">
		</form>


	<p>
		<output name="labelAll">${sessionScope.labelAll}</output>
		<output name="resultAll">${sessionScope.resultAll}</output>
	</p>
	<p>
		<output name="labelDiv">${sessionScope.labelDiv}</output>
		<output name="resultDel">${sessionScope.resultDiv}</output>
	</p>
	
</body>
</html>
