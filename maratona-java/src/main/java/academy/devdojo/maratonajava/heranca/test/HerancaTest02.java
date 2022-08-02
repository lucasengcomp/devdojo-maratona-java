package academy.devdojo.maratonajava.heranca.test;

import academy.devdojo.maratonajava.heranca.dominio.Funcionario;

public class HerancaTest02 {

    /**
     * 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai
     * 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
     * 2 - Alocado espaço em memória para o projeto da superclasse
     * 3 - Cada atributo da superclasse é criado e inicializado com valores default ou quando for passado
     * 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
     * 5 - Construtor da superclasse é executado
     * 6 - Alocado espaço em memória para o projeto da subclasse
     * 7 - Cada atributo de subclasse é criado e inicializado com valores default ou quando for passado
     * 4 - Bloco de inicialização da subclasse é executado na ordem em que aparece
     * 5 - Construtor da subclasse
     */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
