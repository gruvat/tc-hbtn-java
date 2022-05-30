package todo;

import java.util.ArrayList;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws Exception {
        for (Tarefa t : this.tarefas) {
            if (t.getIdentificador() == tarefa.getIdentificador()) {
                throw new IllegalArgumentException(
                        String.format("Tarefa com identificador %d ja existente na lista", t.getIdentificador())
                );
            }
        }

        this.tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa t : this.tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa t : this.tarefas) {
            if (t.getIdentificador() == identificador) {
                t.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void fazerTodas() {
        for (Tarefa t : this.tarefas) {
            t.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa t : this.tarefas) {
            t.setEstahFeita(false);
        }
    }

    public void listarTarefas() {
        for (Tarefa t : this.tarefas) {
            String mark = " ";
            if (t.isEstahFeita()) {
                mark = "X";
            }
            System.out.printf("[%s]  Id: %d - Descricao: %s\n", mark, t.getIdentificador(), t.getDescricao());
        }
    }

}
