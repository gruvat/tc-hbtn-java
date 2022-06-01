package analisador_frase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String texto) {
        TreeMap<String, Integer> contagem = new TreeMap<String, Integer>();

        String noSpecialCharacters = texto.replaceAll("[.!?]", "").toLowerCase();
        List<String> formattedText = Arrays.asList(noSpecialCharacters.split(" "));

        for (String word : formattedText) {
            Integer count = contagem.get(word);
            if (count == null) {
                contagem.put(word, 1);
            } else {
                contagem.put(word, count + 1);
            }

            // Can change the whole logic above per a simpler function
            // contagem.merge(word, 1, Integer::sum);
        }

        return contagem;
    }
}
