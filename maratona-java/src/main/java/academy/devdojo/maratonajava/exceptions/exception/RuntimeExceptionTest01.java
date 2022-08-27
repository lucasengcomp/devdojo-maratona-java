package academy.devdojo.maratonajava.exceptions.exception;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) throws IOException {
        criaNovoArquivo();
    }

    public static void criaNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
