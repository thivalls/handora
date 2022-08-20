package application.exceptions;

public class ContatoNaoExisteException extends Exception {
    String message = "Contato inexistente!";

    public ContatoNaoExisteException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
