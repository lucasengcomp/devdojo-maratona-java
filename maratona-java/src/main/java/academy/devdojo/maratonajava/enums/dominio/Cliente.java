package academy.devdojo.maratonajava.enums.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public enum TipoPagamento {
        DEBITO, CREDITO
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome = '" + nome + '\'' +
                ", tipoClienteInt = " + tipoCliente.valor +
                ", tipoClienteNome = " + tipoCliente.nomeRelatorio +
                ", tipoPagamento = " + tipoPagamento + '}';
    }
}
