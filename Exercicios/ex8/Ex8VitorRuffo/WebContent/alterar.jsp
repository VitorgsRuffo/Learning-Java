<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alterar produto</title>
	</head>
	<body>
		<h1>Alterar produto:</h1>
		<form action="/Ex8VitorRuffo/alterarServlet" method="POST">
			Nome: <input type="text" name="nome" value="${requestScope['produto'].nome}"/> 
			<br />
			Preço: <input type="text" name="preco" value="${requestScope['produto'].preco}"/> 
			<br />
			Quantidade: <input type="text" name="quantidade" value="${requestScope['produto'].quantidade}"/> 
			<br />
			<input type="hidden" name=id value="${requestScope['produto'].id}"/> <br />
			<input type="submit" value="Finalizar alteração" />
		</form>
	</body>
</html>