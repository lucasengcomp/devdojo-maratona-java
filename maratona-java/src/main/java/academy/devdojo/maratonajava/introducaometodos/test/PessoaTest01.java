package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(250);
        pessoa.imprime();
    }
}
