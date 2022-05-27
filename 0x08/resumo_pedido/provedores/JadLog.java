package resumo_pedido.provedores;

public class JadLog extends Empresa implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 2000) {
            this.setPreco(valor * 0.07);
        } else {
            this.setPreco(valor * 0.045);
        }

        return new Frete(this.getPreco(), this.obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
