package status;

public final class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public void tomarDano(int quantidadeDeDano) {
        int novaSaude = this.saudeAtual - quantidadeDeDano;

        this.setSaudeAtual(Math.max(novaSaude, 0));
    }

    public void receberCura(int quantidadeDeCura) {
        int novaSaude = this.saudeAtual + quantidadeDeCura;

        this.setSaudeAtual(Math.min(novaSaude, 100));
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else if (this.saudeAtual == 0) {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return this.status;
    }
}
