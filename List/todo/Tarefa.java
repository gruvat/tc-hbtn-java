package todo;

public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) throws Exception {
        this.modificarDescricao(descricao);
        this.identificador = identificador;
    }

    public void modificarDescricao(String novaDescricao) throws Exception {
        if (novaDescricao == null || novaDescricao.equals("")) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
            this.descricao = novaDescricao;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }
}
