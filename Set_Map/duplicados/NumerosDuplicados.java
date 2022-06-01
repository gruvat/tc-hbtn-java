package duplicados;

import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] intengers) {
        List<Integer> intengersList = Arrays.stream(intengers).boxed().toList();

        HashSet<Integer> intengersHashSet = new HashSet<Integer>();
        TreeSet<Integer> numbersSet = new TreeSet<Integer>();

        for (Integer i : intengersList) {
            if ( intengersHashSet.contains(i) ) {
                numbersSet.add(i);
            } else {
                intengersHashSet.add(i);
            }
        }

        return numbersSet;
    }
}
