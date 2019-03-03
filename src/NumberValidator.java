public class NumberValidator {
    public static void validate(String liczba1) {
        if (!liczba1.trim().matches("\\d+"))
        throw new IllegalArgumentException("To nie jest liczba");
    }
}
