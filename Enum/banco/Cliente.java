package banco;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, Double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<Double>(Arrays.asList(transacaoInicial));
    }

    public void adicionarTransacao(double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}
