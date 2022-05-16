import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumerosLocale {
        public static void main(String[] args) {
            float taxa = 0.2456f;
            float valor = 7654.321f;
	    NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("en", "BR"));
            System.out.printf("Valor: %s\nTaxa: %.2f%%\n", nf.format(valor), taxa);
	}
}
