package cookies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Pedido {

    private List<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido) {
        this.cookies.add(pedido);
    }

    public int obterTotalCaixas() {
        AtomicInteger totalCaixas = new AtomicInteger();
        this.cookies.forEach(
                p -> totalCaixas.addAndGet(p.getQuantidadeCaixas())
        );
        return totalCaixas.get();
    }

    public int removerSabor(String sabor) {
        AtomicInteger removidos = new AtomicInteger();
        Iterator<PedidoCookie> i = this.cookies.iterator();
        while(i.hasNext()) {
            PedidoCookie p = i.next();
            if (p.getSabor().equals(sabor)) {
                removidos.addAndGet(p.getQuantidadeCaixas());
                i.remove();
            }
        }
        return removidos.get();
    }
}
