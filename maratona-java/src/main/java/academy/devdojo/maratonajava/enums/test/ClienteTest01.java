package academy.devdojo.maratonajava.enums.test;

import academy.devdojo.maratonajava.enums.dominio.Cliente;
import academy.devdojo.maratonajava.enums.dominio.TipoCliente;

public class ClienteTest01 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
