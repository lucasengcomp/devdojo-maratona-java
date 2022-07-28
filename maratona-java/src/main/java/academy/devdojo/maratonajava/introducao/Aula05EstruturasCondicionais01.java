package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        int idade = 19;
        int maiorIdade = 18;

        System.out.println(podeComprarBebidaAlcoolica(idade, maiorIdade));
        System.out.println(autorizadoComprarBebida(idade));
    }

    private static String autorizadoComprarBebida(int idade) {
        if (idade < 18 && idade >= 15) {
            return "Compre no máximo um energético se os pais permitirem";
        } else if (idade < 15) {
            return "Tá autorizado comprar suco ou refrigerante se os pais autorizarem";
        } else {
            return "Ok, voce tem idade para comprar qualquer bebida lícita!";
        }
    }

    private static String podeComprarBebidaAlcoolica(int idade, int maiorIdade) {
        return idade >= maiorIdade ? "Ok, pode comprar bebida alcoolica!" : "Xiii, espere mais um tempo antes de comprar bebida alcoolica";
    }
}
