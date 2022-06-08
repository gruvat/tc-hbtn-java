package conta_basica;

import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual / 100;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor > 0) {
            if (valor <= this.saldo) {
                this.saldo -= valor;
            } else {
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            }

        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
    }

    public double calcularTarifaMensal() {
        double tarifaSobSaldo = this.saldo * 0.1;

        if (tarifaSobSaldo < 10) {
            return tarifaSobSaldo;
        } else {
            return 10;
        }
    }

    public double calcularJurosMensal() {
        if (saldo > 0) {
            return saldo * (this.taxaJurosAnual / 12);
        } else {
            return 0;
        }
    }

    public void aplicarAtualizacaoMensal() {
        double tarifa = this.calcularTarifaMensal();
        double jurosMensal = this.calcularJurosMensal();

        this.saldo -= tarifa;
        this.saldo += jurosMensal;

        if (this.saldo < 0) {
            this.saldo = 0;
        }
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
