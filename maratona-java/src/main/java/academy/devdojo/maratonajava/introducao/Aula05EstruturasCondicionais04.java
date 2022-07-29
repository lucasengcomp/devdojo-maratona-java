package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    // € 0  € 34,712  ->  9.70%
    // € 34,713  € 68,507 ->  37.35%
    // € 68,508  ->  49.50%
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;

        System.out.println(validaFaixaSalarial(salarioAnual, primeiraFaixa, segundaFaixa, terceiraFaixa));
    }

    private static double validaFaixaSalarial(double salarioAnual, double primeiraFaixa, double segundaFaixa, double terceiraFaixa) {
        if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            return calculaSalarioAnual(salarioAnual, segundaFaixa);
        } else if (salarioAnual <= 34712) {
            return calculaSalarioAnual(salarioAnual, primeiraFaixa);
        } else {
            return calculaSalarioAnual(salarioAnual, terceiraFaixa);
        }
    }

    private static double calculaSalarioAnual(double salario, double faixa) {
        return salario * faixa;
    }
}
