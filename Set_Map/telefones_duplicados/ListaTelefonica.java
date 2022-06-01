package telefones_duplicados;

import java.util.*;
import java.util.Map.Entry;

public class ListaTelefonica {

    private HashMap<String, HashSet<Telefone>> telephoneNumbers;

    public ListaTelefonica() {
        this.telephoneNumbers = new HashMap<String, HashSet<Telefone>>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) throws Exception {

        for (Entry<String, HashSet<Telefone>> person : this.telephoneNumbers.entrySet()) {
            if (person.getValue().contains(telefone)) {
                if (person.getKey().equals(nome)) {
                    throw new Exception("Telefone jah existente para essa pessoa");
                } else {
                    throw new Exception("Telefone jah pertence a outra pessoa");
                }
            }
        }

        HashSet<Telefone> telefones = this.telephoneNumbers.get(nome);
        this.insertNumber(telefones, nome, telefone);
        return telefones;
    }

    private void insertNumber(HashSet<Telefone> telefones, String nome, Telefone telefone) {
        if (telefones != null) {
            telefones.add(telefone);
            this.telephoneNumbers.put(nome, telefones);
        } else {
            this.telephoneNumbers.put(nome, new HashSet<Telefone>(Arrays.asList(telefone)));
        }
    }

    public HashSet<Telefone> buscar(String nome) {
        if (this.telephoneNumbers.containsKey(nome)) {
            return this.telephoneNumbers.get(nome);
        } else {
            return null;
        }
    }

}
