<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Adicionar no carrinho</title>
	</head>
	<body>
		<h1>Adicionar no carrinho:</h1>
		
		<h3>${requestScope['produto'].nome}</h3>
		<h3>R$ ${requestScope['produto'].preco}</h3>
		<form action="/Ex8VitorRuffo/adicionarCarrinhoServlet" method="POST">
			Quantidade:
			<select name="quantidade">
			  <option value="1">1</option>
			  <option value="2">2</option>
			  <option value="3">3</option>
			  <option value="4">4</option>
			  <option value="4">5</option>
			  <option value="4">6</option>
			  <option value="4">7</option>
			  <option value="4">8</option>
			  <option value="4">9</option>
			  <option value="4">10</option>
			</select>
			<br/>
			<input type="hidden" name=id value="${requestScope['produto'].id}"/> <br />
			<input type="submit" value="Adicionar" />
		</form>
	</body>
</html>