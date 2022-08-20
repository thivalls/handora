package application.exceptions;

public class AgendaCheiaException extends Exception {
    String message = "Agenda cheia!";

    public AgendaCheiaException(String message) {
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
