<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Atualizar Pessoas</title>
</head>
<body>
<jsp:include page="/templates/menu.jsp"></jsp:include>
	<div align="center">
		<form action="../update" method="post">
		<fieldset style="width: 400px">
            <legend>Alterar Dados</legend>
   
		<input type="text" name="_id" value="${update.id }" hidden="true"><br/><br />
      Nome: <input type="text" name="nome"  value="${update.nome}"/><br /><br />
    Idade: <input type="number" name="idade" value="${update.idade}"/><br /> <br />
    País: <select id="pais" name="pais">
				   <option value="${update.endereco.pais}">${update.endereco.pais}</option>
				   <c:forEach var="pais" items="${paises}">
				   <option>
				     ${pais}
				   </option>
				    
				   </c:forEach>
				</select> <br /><br />
   Estado: <input type="text" name="estado" value="${update.endereco.estado}"/><br /><br />
   JUGS:<select id="jugs" name="jugs">
				   <option value="${update.jugs}">${update.jugs}</option>
				   <option>RioJug</option>
				   <option>SouJava Campinas</option>
				    <option>SouJava</option>
				</select>
				<br /><br /> 
   <textarea rows="10" cols="30" name="descricao">Descrição</textarea> 
   <br/><br />
      <input type="submit" value="Alterar Dados">
      </fieldset>
  </form>
  </div>
	<br />
	<jsp:include page="/templates/rodape.jsp"></jsp:include>
</body>
</html>