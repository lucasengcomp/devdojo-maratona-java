package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Multiplica dois numeros com passagem de parâmetros");
        calculadora.multiplicaDoisNumeros(10, 4.9F);
    }
}
