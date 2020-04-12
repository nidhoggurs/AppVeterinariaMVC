<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicina</title>
</head>
<body>
	<form action="/medicina" method="post">
		Tipo Serviço: <input type="text" name="tipoServico">
		Descrição: <input type="text" name="descricao">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>