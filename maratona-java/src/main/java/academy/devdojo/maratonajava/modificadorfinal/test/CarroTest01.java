package academy.devdojo.maratonajava.modificadorfinal.test;

import academy.devdojo.maratonajava.modificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.modificadorfinal.dominio.Comprador;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
