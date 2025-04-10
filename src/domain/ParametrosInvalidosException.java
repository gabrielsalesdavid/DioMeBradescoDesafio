package domain;

public class ParametrosInvalidosException extends Throwable {

    public String getMessage() {
        return "O primeiro valor é maior do que o segundo!";
    }
}