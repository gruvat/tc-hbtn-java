package quantidade_pessoas_por_cargo_idade;

import java.util.*;
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

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                Collectors.counting()
                        )
                );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        //Map< cargo, Map< idade, quantidade>>
        return pessoas.stream()
                .collect(
                  Collectors.groupingBy(
                          Pessoa::getCargo,
                          Collectors.groupingBy(
                                  Pessoa::getIdade,
                                  Collectors.counting()
                          )
                  )
                );
    }

}
