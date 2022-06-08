package contas_especiais.exceptions;

public class OperacaoInvalidaException extends Exception {

    public OperacaoInvalidaException(String message) {
        super(message);
    }

    public OperacaoInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
}
