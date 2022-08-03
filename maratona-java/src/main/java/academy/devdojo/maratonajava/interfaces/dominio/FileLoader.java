package academy.devdojo.maratonajava.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void chekPermission() {
        System.out.println("Checkando permissões no arquivo...");
    }
}
