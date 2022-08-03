package academy.devdojo.maratonajava.polimorfismo.servico;

import academy.devdojo.maratonajava.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados...");
    }
}
