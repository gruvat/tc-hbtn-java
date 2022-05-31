package banco;

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public Cliente buscarCliente(String nomeCliente) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
        Cliente cliente = this.buscarCliente(nomeCliente);
        if (cliente == null) {
            this.clientes.add(new Cliente(nomeCliente, valorTransacaoInicial));
            return true;
        } else {
            return false;
        }
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao) {
        Cliente cliente = this.buscarCliente(nomeCliente);
        if (cliente != null) {
            cliente.adicionarTransacao(valorTransacao);
            return true;
        } else {
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
