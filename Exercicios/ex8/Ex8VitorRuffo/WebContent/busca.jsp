<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Resultado da busca</title>
		<style>
			table, th, td { border: 1px solid black; }
		</style>
	</head>
	<body>
		<h3>Resultado da busca por "${param['nome']}":</h3>
		<table> 
			<tr>
				<th> Nome </th>
				<th> Preço </th>
				<th> Quantidade </th>
			</tr>
			<c:forEach var="produto" items="${requestScope['listaProdutos']}">
				<tr>
					<td>${produto.nome}</td>
					<td>${produto.preco}</td>
					<td>${produto.quantidade}</td>
					<td>
						<a href="/Ex8VitorRuffo/alterarServlet?id=${produto.id}">
							Alterar
						</a>
					</td>
					<td>
						<a href="/Ex8VitorRuffo/excluirServlet?id=${produto.id}&nome=${produto.nome}">				      
							Excluir
						</a>
					</td>
					<td>
						<a href="/Ex8VitorRuffo/adicionarCarrinhoServlet?id=${produto.id}">				      
							Adicionar no Carrinho
						</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="/Ex8VitorRuffo/adicionar.jsp">Adicionar novo produto.</a>	
		<br/>
		<a href="/Ex8VitorRuffo/index.jsp">Voltar</a>
	</body>
</html>