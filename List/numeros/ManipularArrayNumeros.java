package numeros;

import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> integerList, Integer value) {
        return integerList.indexOf(value);
    }

    public static void adicionarNumero(List<Integer> integerList, Integer value) throws Exception {
        if(ManipularArrayNumeros.buscarPosicaoNumero(integerList, value) > -1) {
            throw new Exception("Numero jah contido na lista");
        } else {
            integerList.add(value);
        }
    }

    public static void removerNumero(List<Integer> integerList, Integer value) throws Exception {
        if (ManipularArrayNumeros.buscarPosicaoNumero(integerList, value) == -1) {
            throw new Exception("Numero nao encontrado na lista");
        } else {
            integerList.remove(value);
        }
    }

    public static void substituirNumero(List<Integer> integerList, Integer numeroSubstituir, Integer numeroSubstituto) {
        int index = ManipularArrayNumeros.buscarPosicaoNumero(integerList, numeroSubstituir);
        if (index > -1) {
            integerList.set(index, numeroSubstituto);
        } else {
            integerList.add(numeroSubstituto);
        }
    }

}
