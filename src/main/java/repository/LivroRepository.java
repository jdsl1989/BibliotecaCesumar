package repository;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroRepository {
    private static final List<Livro> livros = new ArrayList<>();

    public static void adicionar(Livro livro){ livros.add(livro); }
    public static List<Livro> listar(){ return livros; }
    public static void excluir(String isbn){
        livros.removeIf(l -> l.getIsbn().equals(isbn));
    }
}