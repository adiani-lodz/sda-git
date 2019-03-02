public class OperationValidator {
    public static void validate(String działanie) {

        if (działanie.trim().length() > 1 &&
                !działanie.trim().matches("/ [+-/*]/g"))
            throw new UnsupportedOperationException(
                    "To nie jest znak działania matematycznego");
    }
}
