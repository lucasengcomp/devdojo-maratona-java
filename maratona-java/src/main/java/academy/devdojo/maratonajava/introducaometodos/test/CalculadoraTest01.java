package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma dois numeros");
        calculadora.somaDoisNumeros();
        System.out.println("Subtrai dois numeros");
        calculadora.subtraiDoisNumeros();
    }
}
