package academy.devdojo.maratonajava.enums.test;

import academy.devdojo.maratonajava.enums.dominio.Cliente;
import academy.devdojo.maratonajava.enums.dominio.TipoCliente;
import academy.devdojo.maratonajava.enums.dominio.TipoPagamento;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente3 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
