<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Buscar produto(s)</title>
		<style>
			table, th, td { border: 1px solid black; }
		</style>
	</head>
	<body>
		<h1>Buscar produto(s):</h1>
		<h3>Insira o nome do produto:</h3>
		<form action="buscarServlet" method="POST">
			Nome: <input type="text" name="nome"/> <br />
			<input type="submit" value="buscar"/> <br />
		</form>
		<c:if test="${not empty sessionScope['listaBuscados']}">
			Lista de buscas recentes:
			<table>
				<tr>
					<th>
						Termo de busca		
					</th>
					<th>
						Operação
					</th>
				</tr>
				<c:forEach var="produto" items="${sessionScope['listaBuscados']}" varStatus="index">
					<tr>
						<td>
							<a href="/Ex8VitorRuffo/buscarServlet?nome=${produto}">
								${produto}
							</a>		
						</td>
						<td>
							<a href="/Ex8VitorRuffo/removerBuscaServlet?indice=${index.count-1}">
								Remover
							</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<c:if test="${empty sessionScope['listaBuscados']}">
			Nenhuma busca recente.
		</c:if>
		<br/>
		<a href="/Ex8VitorRuffo/adicionar.jsp">Adicionar novo produto.</a>	
		<br/>
		<a href="/Ex8VitorRuffo/index.jsp">Voltar</a>
	</body>
</html>