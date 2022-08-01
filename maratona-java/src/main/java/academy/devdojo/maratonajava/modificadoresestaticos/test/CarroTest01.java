package academy.devdojo.maratonajava.modificadoresestaticos.test;

import academy.devdojo.maratonajava.modificadoresestaticos.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW x6", 280);
        Carro carro2 = new Carro("Audi", 290);
        Carro carro3 = new Carro("Jetta", 240);

        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
