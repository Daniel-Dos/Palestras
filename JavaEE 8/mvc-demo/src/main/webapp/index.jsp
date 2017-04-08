<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MVC 1.0 DEMO</title>
<link href="${mvc.contextPath}/recursos/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
<link href="${mvc.contextPath}/recursos/css/ozark.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="navbar navbar-fixed-top navbar-inverse">
      <div class="navbar-inner">
        <div class="container">
          <h1>
            MVC 1.0 DEMO
            <a class="btn btn-primary" href="soujava/pessoas/mostrar">
          Listar Pessoas »
        </a>
          </h1>
        </div>
      </div>
    </div>
    <div class="container">
      <div class="hero-unit">
        
        <div>
			<img src="${mvc.contextPath}/recursos/imagens/Duke2.jpg"/>
        </div>
        
      </div>
       
     <div>
      <h1>Sejam Bem Vindos!</h1>
      </div>
    </div>

		<script type="text/javascript" src="${mvc.contextPath}/recursos/js/bootstrap.min.js">
		</script>

		<script type="text/javascript" src="${mvc.contextPath}/recursos/js/jquery-3.1.1.min.js">
		</script>
</body>
</html>