package academy.devdojo.maratonajava.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    /**
     *   private -> default -> protected -> public
     * */
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize no DataBaseLoader");
    }
}
