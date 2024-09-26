public class Livro {
    public String titulo;
    public String autor;
    public double preco;
    public Livro(String titulo,String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    public void exibirDetalhes(){
        System.out.println("Título: " + titulo +"\n" + "Autor: " + autor + "\n" + "Preço: " + preco);
    }
}
