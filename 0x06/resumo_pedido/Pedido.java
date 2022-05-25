import java.util.Locale;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = this.calcularTotalSemDesconto();
        return total - this.getDescontoTotal(total);
    }

    private double calcularTotalSemDesconto() {
        double total = 0;

        for(ItemPedido item : itens) {
            total += item.getValorLiquido();
        }

        return total;
    }

    private double getDescontoTotal(double productsValue) {
        return (this.percentualDesconto / 100) * productsValue;
    }

    public void apresentarResumoPedido() {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            System.out.printf("Tipo: %s  Titulo: %s  Preco: %s  Quant: %d  Total: %s\n",
                        item.getProduto().getClass().getSimpleName(),
                        item.getProduto().getTitulo(),
                        String.format("%.2f", item.getProduto().obterPrecoLiquido()),
                        item.getQuantidade(),
                        String.format("%.2f", item.getValorLiquido())
                    );
        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %s\n", String.format("%.2f", this.getDescontoTotal(this.calcularTotalSemDesconto())));
        System.out.printf("TOTAL PRODUTOS: %s\n", String.format("%.2f", this.calcularTotalSemDesconto()));
        System.out.println("----------------------------");
        System.out.printf("TOTAL PRODUTOS: %s\n", String.format("%.2f", this.calcularTotal()));
        System.out.println("----------------------------");

    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }
}
