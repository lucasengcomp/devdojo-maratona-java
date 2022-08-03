package academy.devdojo.maratonajava.polimorfismo.servico;

import academy.devdojo.maratonajava.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto: ");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularImposto());
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
