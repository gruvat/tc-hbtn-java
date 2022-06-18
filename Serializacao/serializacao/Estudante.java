package serializacao;

import java.io.Serializable;

public class Estudante implements Serializable {

    private int idade;
    private String name;
    private transient String senha;

    public Estudante(int idade, String name, String senha) {
        this.idade = idade;
        this.name = name;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", this.name, this.idade, this.senha);
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public String getSenha() {
        return senha;
    }
}
