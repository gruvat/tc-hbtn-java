package midias;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<T> listaMidias;

    public Biblioteca() {
        this.listaMidias = new ArrayList<>();
    }

    public void adicionarMidia(T item) {
        this.listaMidias.add(item);
    }

    public List<? extends Midia> obterListaMidias() {
        return this.listaMidias;
    }
}
