package controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import model.Livro;
import repository.LivroRepository;

@WebServlet("/livro")
public class LivroServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {

        String acao=req.getParameter("acao");

        if("cadastrar".equals(acao)){
            String titulo=req.getParameter("titulo");
            String autor=req.getParameter("autor");
            String isbn=req.getParameter("isbn");
            String anoTexto=req.getParameter("ano");

            if(titulo.isBlank() || autor.isBlank() || isbn.isBlank()){
                resp.sendRedirect("cadastro.jsp?erro=1");
                return;
            }

            int ano=Integer.parseInt(anoTexto);
            LivroRepository.adicionar(new Livro(titulo,autor,ano,isbn));

            resp.sendRedirect("lista.jsp");
        }

        if("excluir".equals(acao)){
            LivroRepository.excluir(req.getParameter("isbn"));
            resp.sendRedirect("lista.jsp");
        }
    }
}