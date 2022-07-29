package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {


    public static void main(String[] args) {
        int count = 0;

        estruturaWhile(count);
        quebraLinha();
        quebraLinha();
        estruturaDoWhile(count);
        quebraLinha();
        quebraLinha();
        lacoFor();
    }

    private static void quebraLinha() {
        System.out.println();
    }

    private static void lacoFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Contador dor FOR vale " + i);
        }
    }

    private static String estruturaDoWhile(int contador) {
        do {
            System.out.println("Dentro do laco do-while pela " + ++contador + "º vez");
        } while (contador < 10);
        return "Fim DO-WHILE";
    }

    private static String estruturaWhile(int contador) {
        while (contador < 10) {
            System.out.println(++contador);
        }
        return "Fim WHILE";
    }
}
