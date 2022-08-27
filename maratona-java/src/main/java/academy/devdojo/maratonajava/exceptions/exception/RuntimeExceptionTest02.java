package academy.devdojo.maratonajava.exceptions.exception;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Argumento ilegal. Não pode ser zero!");
        }
        return a / b;
    }
}
