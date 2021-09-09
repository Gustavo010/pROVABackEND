<%@page import="ctr.ProdutoProcess"%>
<%@page import="vo.Produto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista</title>
</head>
<body>
	<div>
		<a href="cadastro.jsp">Cadastrar</a>
		
	</div>
	<table>
		<tr>
			<th>Perola</th>
			<th>Numero</th>
			<th>Tab</th>
		</tr>
		<%
		ProdutoProcess.abrir();
		for (Produto c : ProdutoProcess.produtos) {
			out.print(c.toHTML());
		}
		%>
	</table>
</body>
</html>