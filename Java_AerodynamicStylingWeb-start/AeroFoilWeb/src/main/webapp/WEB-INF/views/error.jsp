<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Laboratory work 3.1 [Error]</title>
</head>

<body>
	<jsp:include page="introduction.jsp" />
	<p>
		<br> <br> <br> Request from
		${pageContext.errorData.requestURI} is failed <br /> Servlet name or
		type: ${pageContext.errorData.servletName} <br /> Status code:
		${pageContext.errorData.statusCode} <br /> Exception:
		${pageContext.errorData.throwable}
</body>
</html>