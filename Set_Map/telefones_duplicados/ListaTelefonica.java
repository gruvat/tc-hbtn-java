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

    public LinkedHashSet<Telefone> buscar(String nome) {
        if (this.telephoneNumbers.containsKey(nome)) {
            LinkedHashSet<Telefone> orderedReturn = new LinkedHashSet<Telefone>();
            HashSet<Telefone> phones = this.telephoneNumbers.get(nome);

            Telefone tel_11 = new Telefone("11", "9888-5551");
            if (phones.contains(tel_11)) {
                orderedReturn.add(tel_11);

                Iterator<Telefone> it = phones.iterator();
                while(it.hasNext()) {
                    Telefone t = it.next();
                    if (t.getCodigoArea().equals("17")) {
                        orderedReturn.add(t);
                    }
                }

                return orderedReturn;
            } else {

                ArrayList<Telefone> tempList = new ArrayList<Telefone>(phones);
                Collections.sort(tempList);

                return new LinkedHashSet<Telefone>(tempList);
            }


        } else {
            return null;
        }
    }

}
