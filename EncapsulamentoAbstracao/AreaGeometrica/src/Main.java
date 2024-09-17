public class Main {
    public static void main(String[] args) {
        AreaGeometrica area = new AreaGeometrica();

        System.out.println("Área do quadrado = " + area.calcularArea(5));
        System.out.println("Área do retângulo: " + area.calcularArea(3, 5));
        System.out.println("Área do círculo: " + area.calcularArea(5, true));
    }


}