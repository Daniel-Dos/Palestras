<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC 1.0 DEMO</title>
<%-- <link href="${mvc.contextPath}/recursos/css/bootstrap.min.css" rel="stylesheet" type="text/css"/> --%>
<%-- <link href="${mvc.contextPath}/recursos/css/ozark.css" rel="stylesheet" type="text/css"/> --%>
</head>
<body>
	<jsp:include page="/templates/menu.jsp"></jsp:include>

	<h1 align="center">Sejam Bem Vindos!</h1>

	<div align="center">
		<img src="${mvc.contextPath}/recursos/imagens/Duke2.jpg" class="img-responsive" />
	</div>
	<br />
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>