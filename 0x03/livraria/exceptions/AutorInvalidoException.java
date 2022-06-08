package livraria.exceptions;

public class AutorInvalidoException extends Exception {

    public AutorInvalidoException(String message) {
        super(message);
    }

    public AutorInvalidoException(String message, Throwable cause) {
        super(message, cause);
    }
}
