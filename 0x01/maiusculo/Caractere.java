package maiusculo;

public class Caractere {
    public static boolean EhMaiusculo(char c) {
        String upperCaseVar = String.valueOf(c).toUpperCase();

        return upperCaseVar.equals(String.valueOf(c));
    }
}
