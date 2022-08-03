package academy.devdojo.maratonajava.polimorfismo.test;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.polimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-------------------------------");
        tomate.setDataValidade("11/12/2022");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
