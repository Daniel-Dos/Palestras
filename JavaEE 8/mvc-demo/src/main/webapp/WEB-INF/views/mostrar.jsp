<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar Pessoas</title>
<link href="${mvc.contextPath}/recursos/css/ozark.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<jsp:include page="/templates/menu.jsp"></jsp:include>
<h1 align="center">Listagem dos Dados</h1>

<a href="novo">Adicionar</a>

		<table align="center" border="4" class="table">
		<tr bgcolor="gray">
		    <th>ID</th>
			<th>Nome</th>
			<th>Idade</th>
			<th>País</th>
			<th>Estado</th>
			<th>JUGS</th>
			<th>Descrição</th>
			<th>Editar</th>
			<th>Deletar</th>
		</tr>
		<c:forEach items="${pessoas}" var="pessoas">
			<tr class="table tr">
				<td>${pessoas.id}</td>
				<td>${pessoas.nome}</td>
				<td>${pessoas.idade}</td>
				<td>${pessoas.endereco.pais}</td>
				<td>${pessoas.endereco.estado}</td>
				<td>${pessoas.jugs}</td>
				<td>
				<textarea rows="10" cols="60" name="descricao" disabled="disabled"> ${pessoas.descricao} </textarea>
				</td>
				<td><a href="atualizar/${pessoas.id }">Alterar</a></td>
				<td><a href="remover/${pessoas.id}">Excluir</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>