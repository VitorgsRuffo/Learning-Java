<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SISTEMA CRUD - Produtos</title>
	</head>
	<body>
		<h1>SISTEMA CRUD - Produtos</h1>
		<ul>
		  <li>
		  	<a href="/Ex8VitorRuffo/adicionar.jsp">Adicionar novo produto</a>
		  </li>
		  <li>
		  	<a href="/Ex8VitorRuffo/buscar.jsp">Buscar produto(s)</a>
		  </li>
		  <li>
		  	<a href="/Ex8VitorRuffo/carrinho.jsp">Carrinho de compras.</a>
		  </li>
		</ul>
		<c:if test="${not empty requestScope['mensagem']}">
			<h4>${requestScope['mensagem']}</h4>
		</c:if>
	</body>
</html>