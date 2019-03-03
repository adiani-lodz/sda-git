public class OperationValidator {
    public static void validate(String działanie) {
        //sprawdzamy czy dlugosc stronga jest 1 lub mniejsza
        //przewidujemy tylko pojedynczy znak
        if (działanie.trim().length() > 1 &&
                //sprawdzamy czy znak jest znakiem operacji
                !działanie.trim().matches("/ [+-/*]/g"))
            //jezeli warunek jest spelniony rzucamy wyjatek
            throw new UnsupportedOperationException(
                    "To nie jest znak działania matematycznego");
    }
}
