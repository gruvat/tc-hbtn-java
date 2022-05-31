package banco;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public Agencia buscarAgencia(String nomeAgencia) {
        for (Agencia agencia : this.agencias) {
            if (agencia.getNome().equals(nomeAgencia)) {
                return agencia;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia) {
        if (this.buscarAgencia(nomeAgencia) == null) {
            this.agencias.add(new Agencia(nomeAgencia));
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacaoInicial) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia != null) {
            if (agencia.buscarCliente(nomeCliente) == null) {
                agencia.novoCliente(nomeCliente, valorTransacaoInicial);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia != null) {
            Cliente cliente = agencia.buscarCliente(nomeCliente);
            if (cliente != null) {
                cliente.adicionarTransacao(valorTransacao);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agencia = this.buscarAgencia(nomeAgencia);
        if (agencia != null) {
            for (int i=0; i < agencia.getClientes().size(); i++) {
                if (imprimirTransacoes) {
                    this.printTransactionsComplete(agencia.getClientes().get(i), i);
                } else {
                    this.printTransactionsReduced(agencia.getClientes().get(i), i);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private void printTransactionsComplete(Cliente cliente, int index) {
        System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), index+1);
        for (int i=0; i < cliente.getTransacoes().size(); i++) {
            System.out.printf("  [%d] valor %.2f\n", i+1, cliente.getTransacoes().get(i));
        }
    }

    private void printTransactionsReduced(Cliente cliente, int index) {
        System.out.printf("Cliente: %s [%d]\n", cliente.getNome(), index+1);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
}
