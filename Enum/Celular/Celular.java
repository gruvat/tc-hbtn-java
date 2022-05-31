package Celular;

import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(Contato novoContato) throws Exception {
        if(this.isThereContact(novoContato)) {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        } else {
            this.contatos.add(novoContato);
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        if (this.isThereContact(contatoAntigo)) {
            if (this.isThereContact(novoContato) && !contatoAntigo.getNome().equals(novoContato.getNome())) {
                throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            } else {
                int indexOfOldContact = this.obterPosicaoContato(contatoAntigo.getNome());
                this.contatos.set(indexOfOldContact, novoContato);
            }
        } else {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }
    }

    public void removerContato(Contato contato) throws Exception{
        if (this.isThereContact(contato)) {
            this.contatos.remove(this.obterPosicaoContato(contato.getNome()));
        } else {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }
    }

    public void listarContatos() {
        for (Contato contato : this.contatos) {
            System.out.printf("%s -> %s (%s)\n", contato.getNome(), contato.getNumero(), contato.getTipo().name());
        }
    }

    public int obterPosicaoContato(String nomeContato) {
        for(int i = 0; i < this.contatos.size(); i++) {
            if(this.contatos.get(i).getNome().equals(nomeContato)) {
                return i;
            }
        }
        return -1;
    }
    private boolean isThereContact(Contato contato) {
        return this.obterPosicaoContato(contato.getNome()) > -1;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
}
