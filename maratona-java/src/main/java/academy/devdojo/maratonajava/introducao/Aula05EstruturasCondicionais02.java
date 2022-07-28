package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        int idade = 14;

        verificaCategoriaConformeIdade(idade);
    }

    private static void verificaCategoriaConformeIdade(int idade) {
        if (idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else if (idade < 15) {
            System.out.println("Categoria infantil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
