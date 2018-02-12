<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Input password</title>
</head>
<body>"
	<jsp:include page="../pattern/introduction.jsp" />

	<form id="login" action="../ServletTask1">

		<h1 id="ff-proof" class="ribbon"> ${sessionScope.result} &nbsp;&nbsp;</h1>

		<div class="apple">
			<div class="top">
				<span></span>
			</div>
			<div class="butt">
				<span></span>
			</div>
			<div class="bite"></div>
		</div>

		<fieldset id="inputs">
			<input name="username" type="text"
				onblur="if(this.value=='')this.value='Логин';"
				onfocus="if(this.value=='Логин')this.value='';" value="Логин" /> <input
				name="password" type="password"
				onblur="if(this.value=='')this.value='Пароль';"
				onfocus="if(this.value=='Пароль')this.value='';" value="Пароль"/>
		</fieldset>

		<fieldset id="actions">
			<input type="submit" id="submit" value="ВОЙТИ" />
		</fieldset>

	</form>
</body>
</html>

