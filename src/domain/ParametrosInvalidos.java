package domain;

public class ParametrosInvalidos extends Throwable {

    public String getMessage() {
        return "Um dos valores devem ser maior do que o outro!";
    }
}
