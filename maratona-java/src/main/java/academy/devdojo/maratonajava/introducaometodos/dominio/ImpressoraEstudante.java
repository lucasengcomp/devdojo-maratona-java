package academy.devdojo.maratonajava.introducaometodos.dominio;

public class ImpressoraEstudante {

    public void imprimeEstudante(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}
