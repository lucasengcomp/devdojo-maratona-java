package academy.devdojo.maratonajava.enums.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "  Nome = '" + nome + '\'' +
                ", Tipo Cliente Int = " + tipoCliente.getValor() +
                ", Tipo Cliente Nome = " + tipoCliente.getNomeRelatorio() +
                ", Tipo Pagamento = " + tipoPagamento + '}';
    }
}
