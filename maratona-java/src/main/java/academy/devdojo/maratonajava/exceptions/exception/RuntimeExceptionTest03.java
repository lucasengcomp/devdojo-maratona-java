package academy.devdojo.maratonajava.exceptions.exception;

import java.io.IOException;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) throws IOException {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
        return "Não abriu a conexão";
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo...");
            System.out.println("Escrevendo dados no arquivo...");
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
    }
}
