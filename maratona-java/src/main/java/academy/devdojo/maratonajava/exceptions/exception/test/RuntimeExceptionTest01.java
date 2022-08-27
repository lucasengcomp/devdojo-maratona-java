package academy.devdojo.maratonajava.exceptions.exception.test;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        criaNovoArquivo();
    }

    public static void criaNovoArquivo() {
        try {
            File file = new File("arquivo\\teste.txt");
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
