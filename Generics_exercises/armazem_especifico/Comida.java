package armazem_especifico;

public class Comida {
    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%s] %f R$ %f", this.nome, this.calorias, this.preco);
    }

    public String getNome() {
        return nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPreco() {
        return preco;
    }
}
