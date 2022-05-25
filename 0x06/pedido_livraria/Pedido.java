import java.util.Locale;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public String calcularTotal() {
        double total = 0;

        for(ItemPedido item : itens) {
            total += (item.getQuantidade() * item.getProduto().obterPrecoLiquido());
        }

        return String.format(new Locale("pt", "BR"), "%.2f",total * (1 - (this.percentualDesconto / 100)));
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }
}
