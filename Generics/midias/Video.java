package midias;

public class Video extends Midia{

    private int duracao;

    public Video(String nome, int duracao) {
        super.nome = nome;
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
}
