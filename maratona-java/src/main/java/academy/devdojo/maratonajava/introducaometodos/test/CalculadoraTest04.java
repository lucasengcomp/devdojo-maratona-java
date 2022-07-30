package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        Calculadora calculadora = new Calculadora();

        calculadora.alteraDoisNumeros(num1, num2);
    }
}
