
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {

        Comparator<String> c = (String p1, String p2) -> p1.compareTo(p2) * -1;
        return  pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                () -> new TreeMap<>(c),
                                Collectors.toCollection(TreeSet::new)
                        )
                );
    }
}
