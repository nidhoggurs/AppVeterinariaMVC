<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de veterinárias</title>
</head>
<body>	
	<h4>Veterinárias</h4>
	
	<h4><a href="/veterinaria">Novo</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${veterinarias}">
		<h5>Nome: ${item.nome} <a href="/veterinaria/${item.id}" > excluir</a> </h5>
	</c:forEach>

</body>
</html>