<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de servi�os de medicina</title>
</head>
<body>
	<h4>Servi�os de Medicina</h4>
	
	<h4><a href="/medicina">Novo</a> | <a href="/produtos">Produtos</a> | <a href="/">Voltar</a></h4>
	
	<c:forEach var="item" items="${medicinaServicos}">
		<h5>Tipo de Servi�o: ${item.tipoServico} | Descri��o: ${item.descricao} <a href="/medicina/${item.id}" > excluir</a> </h5>
	</c:forEach>
</body>
</html>