<!DOCTYPE html>
<%@page import="ctr.ProdutoProcess"%>
<%@page import="vo.Produto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUTOS - JOIAS</title>
</head>
<body>
<%
	ProdutoProcess.testes();
	out.print("<table style='border: solid 1px'>");
	for (Produto c : ProdutoProcess.produtos) {
		out.print(c.toHTML());
	}
	out.print("</table>");
	out.print(ProdutoProcess.salvar());
	%>

</body>
</html>