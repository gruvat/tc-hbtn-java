package numeros;

public class Numeros0a99 {
    public static void main(String[] args) {
        int minNum = 0;
        int maxNum = 99;

        StringBuilder finalPrint = new StringBuilder();

        for (int i = minNum; i < maxNum; i++) {
            finalPrint.append(i);
            finalPrint.append(", ");
        }
        finalPrint.append(maxNum);

        System.out.println(finalPrint);
    }
}
