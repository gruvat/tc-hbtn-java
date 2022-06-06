package postagem_blog;

import java.util.Objects;

public class Autor implements Comparable<Autor> {

    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public int compareTo(Autor autor) {
        int result = this.nome.compareTo(autor.getNome());

        if (result == 0) {
            return this.sobrenome.compareTo(autor.getSobrenome());
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return this.nome + " " + this.sobrenome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) && Objects.equals(sobrenome, autor.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

}
