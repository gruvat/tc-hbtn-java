package consistencia;

public final class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        this.setSaudeAtual(saudeAtual);
    }

    public void tomarDano(int quantidadeDeDano) {
        this.setSaudeAtual(this.saudeAtual - quantidadeDeDano);
    }

    public void receberCura(int quantidadeDeCura) {
        this.setSaudeAtual(this.saudeAtual + quantidadeDeCura);

    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        // life logic
        if (saudeAtual < 0) {
            this.saudeAtual = 0;
        } else if (saudeAtual > 100) {
            this.saudeAtual = 100;
        } else {
            this.saudeAtual = saudeAtual;
        }

        // setStatus
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
        if(!(nome == null || nome.equals(""))){
            this.nome = nome;
        }
    }

    public String getStatus() {
        return this.status;
    }
}
