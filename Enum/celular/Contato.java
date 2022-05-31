package celular;

public class Contato {
    private String nome;
    private String numero;
    private TipoNumero tipo;

    public Contato(String nome, String numero, TipoNumero tipo) {
        this.nome = nome;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public TipoNumero getTipo() {
        return tipo;
    }
}
