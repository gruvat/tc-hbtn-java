package midias;

public class Livro extends Midia{

    private int edicao;

    public Livro(String nome, int edicao) {
        super.nome = nome;
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }
}
