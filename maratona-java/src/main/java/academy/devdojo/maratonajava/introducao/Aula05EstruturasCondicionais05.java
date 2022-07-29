package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    // € 0  € 34,712  ->  9.70%
    // € 34,713  € 68,507 ->  37.35%
    // € 68,508  ->  49.50%
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo

        byte dia = 52;
        // char, int, byte, short, enum, string

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Essa opção " + dia + " é inválida!");
                break;
        }

        char sexo = 'F';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
            case 'F':
                System.out.println("Feminino");
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
