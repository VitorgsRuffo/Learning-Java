<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Adicionar produto</title>
	</head>
	<body>
		<h1>Adicionar produto</h1>
		<h3>Preencha as informações do novo produto:</h3>
		<form action="adicionarServlet" method="POST">
			Nome: <input type="text" name="nome"/> <br />
			Preço: <input type="text" name="preco"/> <br />
			Quantidade: <input type="text" name="quantidade"/> <br />
			<input type="submit" value="adicionar"/> <br />
		</form>
		<c:if test="${not empty requestScope['mensagem']}">
			<h4>${requestScope['mensagem']}</h4>
		</c:if>
		<br/>
		<a href="/Ex8VitorRuffo/buscar.jsp">Buscar produto(s).</a>	
		<br/>
		<a href="/Ex8VitorRuffo/index.jsp">Voltar</a>
	</body>
</html>