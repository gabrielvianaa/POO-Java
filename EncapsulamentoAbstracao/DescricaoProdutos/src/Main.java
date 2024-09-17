public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos();
        System.out.println("Nome do produto: " + produto.produto("Detergente"));
        System.out.println("Preço do produto: " + produto.produto("R$" + 5.99));
        System.out.println("Codigo do produto: " + produto.produto(5228999));
    }
}