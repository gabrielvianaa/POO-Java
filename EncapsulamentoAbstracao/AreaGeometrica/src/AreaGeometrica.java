public class AreaGeometrica {
    public int calcularArea(int lado) {
        return lado * lado;
    }
    public double calcularArea(int lado1, int lado2) {
        return lado1 * lado2;
    }
    public double calcularArea(double raio, boolean circulo){
        final double PI = 3.14;
        return PI * raio * raio;
    }

}
