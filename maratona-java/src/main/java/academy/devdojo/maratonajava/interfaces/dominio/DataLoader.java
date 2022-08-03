package academy.devdojo.maratonajava.interfaces.dominio;

public interface DataLoader {

    int MAX_SIZE = 10;

    void load();

    default void chekPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
