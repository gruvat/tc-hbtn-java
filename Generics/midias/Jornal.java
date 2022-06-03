package midias;

public class Jornal extends Midia{

    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeArtigos) {
        super.nome = nome;
        this.quantidadeArtigos = quantidadeArtigos;
    }

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }
}
