package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {

    /**
     * Imprima todos os números pares de 0 até 1 milhão
     */

    public static void main(String[] args) {
        lacoRepeticao(1000000);
    }

    private static void lacoRepeticao(int contador) {
        for (int i = 0; i <= contador; i++) {
            validaSeEPar(i);
        }
    }

    private static void validaSeEPar(int i) {
        if (i % 2 == 0) {
            System.out.println("Numero par " + i);
        }
    }
}
