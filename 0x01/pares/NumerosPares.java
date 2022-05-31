package pares;

public class NumerosPares {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 99;

        StringBuilder finalPrint = new StringBuilder();

        for (int i = minNum; i <= maxNum; i++) {
            if ((i % 2) == 0) {
                finalPrint.append(i);
                finalPrint.append(", ");
            }
        }
        finalPrint.deleteCharAt(finalPrint.length() - 1);
        finalPrint.deleteCharAt(finalPrint.length() - 1);

        System.out.println(finalPrint);
    }
}
