package academy.devdojo.maratonajava.heranca.test;

import academy.devdojo.maratonajava.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.heranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua modelo 01");
        endereco.setCep("12345678");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("12345678888");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
//        funcionario.setNome("");
        funcionario.setCpf("123456789-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("========== Funcionario ==========");
        funcionario.imprime();
    }
}
