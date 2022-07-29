package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "GOKU";
        estudante.idade = 186;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
