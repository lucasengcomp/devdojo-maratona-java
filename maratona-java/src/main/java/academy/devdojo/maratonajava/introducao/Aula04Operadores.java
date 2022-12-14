package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        imprimeResultados(numero1, numero2);
    }

    private static void imprimeResultados(int numero1, int numero2) {
        System.out.println("Numero 1 : " + numero1);
        System.out.println("Numero 2 : " + numero2);
        System.out.println("Soma do numero1 e numero2 : " + soma(numero1, numero2));
        System.out.println("Multiplicacaodo numero1 e numero2 : " + multiplicacao(numero1, numero2));
        System.out.println("Divisao do numero1 e numero2 : " + divisao(numero1, numero2));
        System.out.println("Subtracao do numero1 e numero2 : " + subtracao(numero1, numero2));
        System.out.println("Mod/resto do numero1 pelo numero2 : " + resto(numero1, numero2));
        System.out.println("Numero 1 é maior que o número 2? : " + isNumero1MaiorQueNumero2(numero1, numero2));
        System.out.println("Numero 1 é menor que o número 2? : " + isNumero1MenorQueNumero2(numero1, numero2));
        System.out.println("Numero 1 é diferente que o número 2? : " + isNumero1DiferenteDoNumero2(numero1, numero2));
        System.out.println("Está dentro da lei brasileira? : " + isDentroDaLei(1234.56, 18));
        System.out.println("Consegue comprar um Playstation 5? : " + isPodeComprarPlayStation5(3000.25, 2590.59, 5000.0));
        System.out.println("Operação de negação (numero1 é maior que numero2?) : " + negarOperacao(numero1, numero2));
    }

    public static boolean negarOperacao(int n1, int n2) {
        return !isNumero1MaiorQueNumero2(n1, n2);
    }

    public static boolean isPodeComprarPlayStation5(double saldoContaCorrente, double saldoContaPoupanca, double valorPlastation) {
        return saldoContaCorrente >= valorPlastation || valorPlastation >= saldoContaPoupanca;
    }

    public static boolean isDentroDaLei(double salario, int idade) {
        return idade >= 18 && salario > 1212.00;
    }

    public static boolean isNumero1DiferenteDoNumero2(int n1, int n2) {
        return n1 != n2;
    }

    public static boolean isNumero1MaiorQueNumero2(int n1, int n2) {
        return n1 > n2;
    }

    public static boolean isNumero1MenorQueNumero2(int n1, int n2) {
        return n1 < n2;
    }

    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int multiplicacao(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static int subtracao(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int resto(int numero1, int numero2) {
        return numero1 % numero2;
    }
}
