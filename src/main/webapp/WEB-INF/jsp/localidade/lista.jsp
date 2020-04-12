<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de localidades</title>
</head>
<body>
	<h4>Localidades</h4>
	
	<h4><a href="/localidade">Novo</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${localidades}">
		<h5>Bairro: ${item.bairro} <a href="/localidade/${item.id}" > excluir</a> </h5>
	</c:forEach>

</body>
</html>