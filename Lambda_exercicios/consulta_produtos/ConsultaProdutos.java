package consulta_produtos;

import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro filtro) {
        return produtos.stream()
                .filter(filtro::testar)
                .collect(Collectors.toList());
    }

}
