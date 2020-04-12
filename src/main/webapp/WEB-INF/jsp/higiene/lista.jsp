<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de itens de higiene</title>
</head>
<body>
	<h4>Itens de Higiene</h4>
	
	<h4><a href="/higiene">Novo</a> | <a href="/produtos">Produtos</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="i" items="${higieneItens}">
		<h5>Higiene: ${i.item} | Descrição: ${i.descricao} <a href="/higiene/${i.id}" > excluir</a> </h5>
	</c:forEach>
</body>
</html>