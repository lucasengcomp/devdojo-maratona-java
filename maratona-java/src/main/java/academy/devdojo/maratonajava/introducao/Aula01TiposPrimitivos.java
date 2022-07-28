package academy.devdojo.maratonajava.introducao;

public class Aula01TiposPrimitivos {

    public static void main(String[] args) {
        int idade = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 100;
        double salarioFloat = 2000;
        byte idadeByteMax = 127;
        byte idadeByteMin = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87; //numero pega o caracter da posicao da tabela ASCII ou unicode '\u0041'
        String nome = "Goku";

        System.out.println("IDADE: " + idade);
        System.out.println("NUMERO LONGO: " + numeroGrande);
        System.out.println("SALARIO DOUBLE: " + salarioDouble);
        System.out.println("SALARIO FLOAT: " + salarioFloat);
        System.out.println("IDADE BYTE MAX: " + idadeByteMax);
        System.out.println("IDADE BYTE MIN: " + idadeByteMin);
        System.out.println("IDADE SHORT: " + idadeShort);
        System.out.println("BOOLEANO: " + verdadeiro);
        System.out.println("BOOLEANO: " + falso);
        System.out.println("CARACTER: " + caractere);
        System.out.println("CARACTER: " + nome);
    }
}
