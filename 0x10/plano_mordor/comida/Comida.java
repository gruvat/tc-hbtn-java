package comida;

public abstract class Comida {
    protected int pontosDeFelicidade;

    public Comida(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;
    }

    public Integer getPontosDeFelicidade() {
        return this.pontosDeFelicidade;
    }
}