import java.text.DecimalFormat;



public class ImpostoRenda {
    private double salarioBruto = 2500;
    DecimalFormat format = new DecimalFormat("#.###");


    public double getSalarioBruto() {
        return salarioBruto;

    }

    public double verificarTaxa() {
        double imposto;

        if (this.salarioBruto <= 1903.98) {
            return salarioBruto;
        } else if (this.salarioBruto <= 2826.65) {
            imposto = this.salarioBruto * 0.075 - 142.80;
        } else if (this.salarioBruto <= 3751.05) {
            imposto = this.salarioBruto * 0.15 - 354.80;
        } else if (this.salarioBruto <= 4664.68) {
            imposto = this.salarioBruto * 0.225 - 636.13;
        } else{
            imposto = this.salarioBruto * 0.275 - 869.36;
        }

        System.out.println("Valor do imposto de renda: " + format.format(imposto));
        return imposto;
    }

}
