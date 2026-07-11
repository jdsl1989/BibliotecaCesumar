<%@ page import="repository.LivroRepository"%>
<%@ page import="model.Livro"%>
<html><body>
<h2>Livros cadastrados</h2>
<table border='1'>
<tr><th>Titulo</th><th>Autor</th><th>Ano</th><th>ISBN</th><th>Excluir</th></tr>
<% for(Livro l : LivroRepository.listar()){ %>
<tr>
<td><%=l.getTitulo()%></td>
<td><%=l.getAutor()%></td>
<td><%=l.getAno()%></td>
<td><%=l.getIsbn()%></td>
<td>
<form action="livro" method="post">
<input type="hidden" name="acao" value="excluir">
<input type="hidden" name="isbn" value="<%=l.getIsbn()%>">
<button>Excluir</button>
</form>
</td>
</tr>
<% } %>
</table>
</body></html>