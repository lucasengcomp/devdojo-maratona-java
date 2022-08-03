package academy.devdojo.maratonajava.polimorfismo.dominio;

import academy.devdojo.maratonajava.polimorfismo.interfaces.ITaxavel;

public abstract class Produto implements ITaxavel {

    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
