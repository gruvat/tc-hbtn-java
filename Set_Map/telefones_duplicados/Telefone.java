
import java.util.Objects;

public class Telefone implements Comparable<Telefone>{

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", this.codigoArea, this.numero);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(codigoArea, telefone.codigoArea) && Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoArea, numero);
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Telefone o) {
        int objectCode = Integer.parseInt(this.codigoArea);
        int comparingObjectCode = Integer.parseInt(o.codigoArea);

        int objectNumber = Integer.parseInt(this.codigoArea);
        int comparingObjectNumber = Integer.parseInt(o.codigoArea);

        if (objectCode > comparingObjectCode) {
            return 1;
        } else if (objectCode == comparingObjectCode) {
            if (objectNumber > comparingObjectNumber) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
