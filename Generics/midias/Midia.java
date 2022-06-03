package midias;

public abstract class Midia {

    String nome;

    @Override
    public String toString() {
        return String.format("Tipo: %s - Nome: %s", this.getClass().getSimpleName(), getNome());
    }

    public String getNome() {
        return nome;
    }
}
