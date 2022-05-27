import java.util.List;
import java.util.ArrayList;

import atividades.Atividade;

public class Workflow {

    private List<Atividade> atividades = new ArrayList<>();

    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
}
