package academy.devdojo.maratonajava.polimorfismo.test;

import academy.devdojo.maratonajava.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.polimorfismo.dominio.Produto;

public class ProdutoTest02 {

    public static void main(String[] args) {

        Produto produto = new Computador("Ryzen 9", 3000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------------------------------");

        Produto produto2 = new Computador("Americano", 2000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("-------------------------------");
    }
}
