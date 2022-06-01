package telefones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> telephoneNumbers;

    public ListaTelefonica() {
        this.telephoneNumbers = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        ArrayList<Telefone> phones = this.telephoneNumbers.get(nome);
        if (phones != null) {
            phones.add(telefone);
            this.telephoneNumbers.put(nome, phones);
        } else {
            this.telephoneNumbers.put(nome, new ArrayList<Telefone>(Arrays.asList(telefone)));
        }
    }

    public ArrayList<Telefone> buscar(String nome) {
        if (this.telephoneNumbers.containsKey(nome)) {
            return this.telephoneNumbers.get(nome);
        } else {
            return null;
        }
    }

}
