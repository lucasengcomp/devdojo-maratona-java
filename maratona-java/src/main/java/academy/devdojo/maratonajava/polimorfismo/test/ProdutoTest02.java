package academy.devdojo.maratonajava.polimorfismo.test;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        Produto tomate = new Tomate("Tomate Siciliano", 10);
        Produto tv = new Televisao("Televisão Q80a Samsung", 4299);
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
