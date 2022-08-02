package academy.devdojo.maratonajava.heranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    static {
        System.out.println("Dentro do bloco estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.getNome() + " recebi o salário de " + this.getSalario());
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
