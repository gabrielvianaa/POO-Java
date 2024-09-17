public class Main {
    public static void main(String[] args) {

        Somatorio soma = new Somatorio();
        System.out.println("A soma dos números =" + soma.somar(2.5, 3));
        System.out.println("A soma dos números = " +soma.somar(3, 3.5)  );
        System.out.println("A soma dos números = " + soma.somar(2, 1));
        System.out.println("A soma dos números = " + soma.somar(5.5, 3.5));
    }
}