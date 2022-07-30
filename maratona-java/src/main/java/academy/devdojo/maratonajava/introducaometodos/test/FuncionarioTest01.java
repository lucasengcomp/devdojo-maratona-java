package academy.devdojo.maratonajava.introducaometodos.test;

import academy.devdojo.maratonajava.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Picolo";
        funcionario.idade = 327;
//        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprimirDados();
    }
}
