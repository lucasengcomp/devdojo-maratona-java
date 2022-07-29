package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Sanji";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
