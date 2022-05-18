public class Empregado {
    private String name;
    private int codigo;
    private Endereco endereco;

    // constructor
    public Empregado(String name, int codigo, Endereco endereco) {
        this.name = name;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    // public methods
    public void apresentar() {
        System.out.printf("Codigo: %d\n", this.codigo);
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Bairro: %s\n", this.endereco.getBairro());
        System.out.printf("Cidade: %s\n", this.endereco.getCidade());
        System.out.printf("Pais: %s\n", this.endereco.getPais());
    }
    
    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

