import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

        listaLivros.add(new Livro("Os códigos do milhão", "Pablo marçal", 59.90));
        listaLivros.add(new Ebook("Cabeça Fria, Coração Quente", "Abel Ferreira", 63.67, 1500));
        listaLivros.add(new Livro("Elon Musk", "Elon Musk", 78.42));
        listaLivros.add(new Ebook("A Revolução dos Bichos", "George Orwell", 15.00, 800));

        for (Livro livro : listaLivros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}