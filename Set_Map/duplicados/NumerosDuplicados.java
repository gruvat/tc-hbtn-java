package duplicados;

import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] integers) {

        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        TreeSet<Integer> integersDuplicated = new TreeSet<Integer>();

        for (Integer i : integers) {
            if ( integerHashSet.contains(i) ) {
                integersDuplicated.add(i);
            } else {
                integerHashSet.add(i);
            }
        }

        return integersDuplicated;
    }
}
