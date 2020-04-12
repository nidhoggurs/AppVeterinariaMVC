<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ração</title>
</head>
<body>
	<form action="/racao" method="post">
		Fabricante: <input type="text" name="fabricante">
		Raça: <input type="text" name="raca">
		Descrição: <input type="text" name="descricao">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>