package resumo_pedido.provedores;

public class Sedex extends Empresa implements ProvedorFrete {

    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1000) {
            this.setPreco(valor * 0.1);
        } else {
            this.setPreco(valor * 0.05);
        }

        return new Frete(this.getPreco(), this.obterTipoProvedorFrete());
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
