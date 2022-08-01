package academy.devdojo.maratonajava.modificadoresestaticos.domain;

public class Carro {

    private String nome;
    private double velocidadeMedia;
    public static double velocidadeLimite = 250;

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade media " + this.velocidadeMedia);
        System.out.println("Velocidade limite " + this.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMedia) {
        this.nome = nome;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
