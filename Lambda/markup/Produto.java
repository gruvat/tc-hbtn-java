package markup;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private Double preco;
    private String nome;
    private Double percentualMarkup = 10.;

    public Supplier<Double> precoComMarkup = () -> this.preco * (1 + this.percentualMarkup/100);
    public Consumer<Double> atualizarMarkup = v -> this.percentualMarkup = v;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPercentualMarkup() {
        return percentualMarkup;
    }
}
