package academy.devdojo.maratonajava.classesabstratas.test;

import academy.devdojo.maratonajava.classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("", 12000);
        System.out.println(desenvolvedor);
    }
}
