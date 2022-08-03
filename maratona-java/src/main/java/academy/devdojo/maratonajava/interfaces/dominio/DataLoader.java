package academy.devdojo.maratonajava.interfaces.dominio;

public interface DataLoader {

    void load();

    default void chekPermission() {
        System.out.println("Fazendo checagem de permissões");
    }
}
