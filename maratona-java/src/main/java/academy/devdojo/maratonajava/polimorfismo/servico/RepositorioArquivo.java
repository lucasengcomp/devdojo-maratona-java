package academy.devdojo.maratonajava.polimorfismo.servico;

import academy.devdojo.maratonajava.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {


    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");
    }
}
