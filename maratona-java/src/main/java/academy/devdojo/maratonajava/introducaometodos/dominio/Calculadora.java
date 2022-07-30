package academy.devdojo.maratonajava.introducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 7);
    }

    public void multiplicaDoisNumeros(int numero1, float numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double numero1, double numero2) {
        if (numero1 == 0 || numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }

    public void imprimeDivisaoDeDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(numero1 / numero2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println(numero1);
        System.out.println(numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
