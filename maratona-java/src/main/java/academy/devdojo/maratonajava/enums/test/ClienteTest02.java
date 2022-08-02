package academy.devdojo.maratonajava.enums.test;

import academy.devdojo.maratonajava.enums.dominio.TipoCliente;

public class ClienteTest02 {

    public static void main(String[] args) {
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente2);
    }
}
