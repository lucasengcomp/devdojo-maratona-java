package academy.devdojo.maratonajava.polimorfismo.test;

import academy.devdojo.maratonajava.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados(); // RepositorioMemoria() | RepositorioArquivo
        repositorio.salvar();

        List<String> lista = new LinkedList<>();
        lista.add("Goku");
        lista.add("Bulma");
        lista.add("Andoid 18");
        lista.add("Vegeta");

        System.out.println(lista);
    }
}
