package provedores;

public class Loggi extends Empresa implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5000) {
            this.setPreco(valor * 0.12);
        } else {
            this.setPreco(valor * 0.04);
        }

        return new Frete(this.getPreco(), this.obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
