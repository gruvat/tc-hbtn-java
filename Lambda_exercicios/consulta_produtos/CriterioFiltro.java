package consulta_produtos;

@FunctionalInterface
public interface CriterioFiltro {

    boolean testar(Produto produto);

}
