<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adicionar Pessoas</title>
</head>
<body>
<div align="center">
 <form action="add" method="post">
<fieldset style="width: 400px">
   <legend>Dados</legend>
   

	 Nome: <input type="text" name="nome" /><br /><br />
     Idade: <input type="number" name="idade"/><br /> <br />

     País: <select id="pais" name="pais">
				   <option value="Selecione">Selecione</option>
					   <c:forEach var="pais" items="${paises}">
					   		<option>${pais}</option>
					   </c:forEach>
				</select> 
				<br /><br />

   Estado: <input type="text" name="estado"/><br /><br />
   
   JUGS:   <input type="radio" name="jugs" value="SouJava"/>SouJava
		   <input type="radio" name="jugs" value="RioJug"/>RioJug
		   <input type="radio" name="jugs" value="SouJava Campinas"/>SouJava Campinas<br /><br />
		   
   <textarea rows="10" cols="30" name="descricao">Descrição</textarea> 
   <br/><br />
  
   <input type="submit" value="Cadastrar Dados."/>
   
</fieldset>
  </form>
  </div>
</body>
</html>