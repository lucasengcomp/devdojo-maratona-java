package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    /**
     * Imprima os primeiros 25 número de um dado valor, por exemplo: 50
     */

    public static void main(String[] args) {
        int valorMaximo = 50;
        int imprimirAte = 25;

        lacoRepeticao(valorMaximo, imprimirAte);
    }

    private static void lacoRepeticao(int contador, int ate) {
        for (int i = 0; i <= contador; i++) {
            if (i >= ate) {
                break;
            }
            System.out.println(i);
        }
    }
}
