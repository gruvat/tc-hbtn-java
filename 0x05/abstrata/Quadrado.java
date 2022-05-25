import java.util.Locale;

public class Quadrado extends Retangulo {
    private double lado;

    @Override
    public String toString() {
        return String.format(new Locale("en", "BR"), "[Quadrado] %.2f", lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
            super.setAltura(lado);
            super.setLargura(lado);
        }
    }
}
