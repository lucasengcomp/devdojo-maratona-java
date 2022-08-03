package academy.devdojo.maratonajava.polimorfismo.test;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {

    public static void main(String[] args) {
        Computador computador = new Computador("NU10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);

//        CalculadoraImposto.calcularImpostoComputador(computador);
//        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
