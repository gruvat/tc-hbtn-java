package resumo_pedido_1;

import resumo_pedido_1.produtos.Produto;

public class ItemPedido {

    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getValorLiquido() {
        return this.quantidade * this.produto.obterPrecoLiquido();
    }
    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
