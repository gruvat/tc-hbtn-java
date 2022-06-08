package livraria.exceptions;

public class LivroInvalidoException extends Exception {

    public LivroInvalidoException(String message) {
        super(message);
    }

    public LivroInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}
