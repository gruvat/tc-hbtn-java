package armazem_especifico;

import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel<T> {

    private Map<String, T> itensArmazenados;

    public Armazem() {
        this.itensArmazenados = new HashMap<String, T>();
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        this.itensArmazenados.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return this.itensArmazenados.get(nome);
    }
}
