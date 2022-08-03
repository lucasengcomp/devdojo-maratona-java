package academy.devdojo.maratonajava.interfaces.test;

import academy.devdojo.maratonajava.interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.chekPermission();
        fileLoader.chekPermission();
    }
}
