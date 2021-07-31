<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Carrinho de compras</title>
		<style>
			table, th, td { border: 1px solid black; }
		</style>
	</head>
	<body>
		<h1>Carrinho de compras:</h1>
		
		<c:if test="${not empty sessionScope['carrinho']}">
			<table>
				<tr>
					<th> Nome </th>
					<th> Preço </th>
					<th> Quantidade </th>
				</tr>
				<c:forEach var="produto" items="${sessionScope['carrinho']}" varStatus="index">
					<tr>
						<td>${produto.nome}</td>
						<td>${produto.preco}</td>
						<td>${produto.quantidade}</td>
						<td>
							<a href="/Ex8VitorRuffo/removerCarrinhoServlet?indice=${index.count-1}">
								Remover
							</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${empty sessionScope['carrinho']}">
			<p>Não há produtos no carrinho.</p>
		</c:if>
		<a href="/Ex8VitorRuffo/index.jsp">Voltar</a>
	</body>
</html>