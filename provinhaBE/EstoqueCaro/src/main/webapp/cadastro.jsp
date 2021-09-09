<%@page import="ctr.ProdutoProcess"%>
<%@page import="vo.Produto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="estilo.css">
<title>Cadastro (CREATE)</title>
</head>
<body>
	<form method="POST">
		<label>Perola:</label><input type="text" name="perola" required>
		<label>Numero:</label><input type="text" name="numero" required>
		<label>Tab:</label><input type="text" name="tab" required>
		<input type="reset" value="Limpar"><input type="submit" value="Enviar">
	</form>
	<%
		Produto produto = new Produto();
		produto.setPerola(request.getParameter("perola"));
		produto.setNome(request.getParameter("nome"));
		produto.setTelefone(request.getParameter("telefone"));	
		if(produto.getPerola() == null || produto.getPerola().equals("")){
			out.print("<p>Aguardando dados</p>");
		}else{
			ProdutoProcess.produto.add(produto);
			out.print(ProdutoProcess.salvar());
		}
	%>
	<a href="clientes.jsp">Listar Geral</a>
</body>
</html>