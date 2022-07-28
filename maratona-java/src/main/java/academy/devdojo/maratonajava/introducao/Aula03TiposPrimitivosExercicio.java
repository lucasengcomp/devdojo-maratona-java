package academy.devdojo.maratonajava.introducao;

/**
 * Crie variáveis com campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * <p>
 * Eu <nome>, morando no endereco <endereco>,
 * confirmo que recebi o salario de <salario>, na data <data>
 */
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua A quadra B lote C";
        String dataRecebimento = "28/07/2022";
        double salario = 1234.56;

        String relatorio = "Eu " + nome +
                " morando no endereco " + endereco +
                " confirmo que recebi  o salário de " + salario +
                " na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
