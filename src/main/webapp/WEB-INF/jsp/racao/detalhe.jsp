<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ra��o</title>
</head>
<body>
	<form action="/racao" method="post">
		Fabricante: <input type="text" name="fabricante">
		Ra�a: <input type="text" name="raca">
		Descri��o: <input type="text" name="descricao">
		<input type="submit" value="Cadastrar">
	</form>
</body>
</html>