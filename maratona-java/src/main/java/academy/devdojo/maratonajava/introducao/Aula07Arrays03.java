package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

    public static void main(String[] args) {
        //int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};

        impressaoDoArrayComForPadrao(numeros2);

        impressaoComDoArrayComForDosObjetos(numeros2);
    }

    private static void impressaoComDoArrayComForDosObjetos(int[] numeros2) {
        for (int num : numeros2) {
            System.out.println(num);
        }
    }

    private static void impressaoDoArrayComForPadrao(int[] numeros2) {
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(i);
        }
    }
}
