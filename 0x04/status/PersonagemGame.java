package status;

public final class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public void tomarDano(int quantidadeDeDano) {
        int novaSaude = this.saudeAtual - quantidadeDeDano;

        if (novaSaude < 0) {
            this.setSaudeAtual(0);
        } else {
            this.setSaudeAtual(novaSaude);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        int novaSaude = this.saudeAtual + quantidadeDeCura;

        if (novaSaude > 100) {
            this.setSaudeAtual(100);
        } else {
            this.setSaudeAtual(novaSaude);
        }
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
