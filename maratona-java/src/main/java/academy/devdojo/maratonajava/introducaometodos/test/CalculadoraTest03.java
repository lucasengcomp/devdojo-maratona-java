package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Divide dois numeros com passagem de parâmetros");
        System.out.println(calculadora.divideDoisNumeros(15,0));

        System.out.println("Outro método de divisão de dois números");
        calculadora.imprimeDivisaoDeDoisNumeros(14, 3);
    }
}
