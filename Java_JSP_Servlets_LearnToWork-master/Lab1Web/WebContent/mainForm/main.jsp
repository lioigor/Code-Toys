<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Laboratory work 1</title>
<style>
.layer1 {
	margin-left: 5%;
}

.b1 {
	background: grey; /* Синий цвет фона */
	color: white; /* Белые буквы */
	font-size: 10pt; /* Размер шрифта в пунктах */
}
</style>
</head>
<body>
	<jsp:include page="../pattern/introduction.jsp" />
	<p>
		<br></br>
	</p>
	<font size="5" face="Arial">
		<h2 align="center">Лабораторная работа №1 Web</h2>
		<p align="center">Приветствие! Данная программа решает 2 задания,
			условия которых приведены ниже...</p> <br>
		<div class="layer1">
			<b>Задание 1.</b> Написать приложение для ввода пароля из командной
			строки и сравнения его со строкой-образцом.
			<p>
				<b>Задание 2.</b> Ввести с консоли n целых чисел и поместить их в
				массив. Найти среди них указанные числа и вывести на консоль: <br>-
				Числа, которые делятся на 3 или на 9.
			</p>
			<p>
			<form action="../MainServlet">
				<table>
					<tr>
						<td>Посмотрим как работает:</td>
						<td><input type="radio" checked="checked" name="task"
							value="task1" />Задание 1<br> <input type="radio"
							name="task" value="task2" />Задание 2</td>
					</tr>
					<tr>
						<td align="right" colspan="2"><input type="submit"
							value="Подтвердить" style="width: 25x; height: 40px" class="b1"></td>
					</tr>
				</table>
			</form>
		</div>
	</font>
</body>
</html>