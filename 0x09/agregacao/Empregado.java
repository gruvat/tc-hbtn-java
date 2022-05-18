public class Empregado {
    private String nome;
    private int codigo;
    private Endereco endereco;

    // constructor
    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    // public methods
    public void apresentar() {
        System.out.printf("Codigo: %d\n", this.codigo);
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Bairro: %s\n", this.endereco.getBairro());
        System.out.printf("Cidade: %s\n", this.endereco.getCidade());
        System.out.printf("Pais: %s\n", this.endereco.getPais());
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

