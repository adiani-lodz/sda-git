public class KalkulatorApp {
    public static void main(String[] args) {
        String działanie = InputManager.getOperation();
        try {
            OperationValidator.validate(działanie); //todo obsługa wyjatku
        } catch (IllegalArgumentException e ) {
            e.printStackTrace();
            działanie = InputManager.getOperation();
        }

        String liczba1 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba1);

        String liczba2 = InputManager.getNumber(); //todo obsługa wyjatku
        NumberValidator.validate(liczba2);

        System.out.println(Operations.giveAnswer(działanie, liczba1, liczba2)); //todo obsługa wyjatku... czy napewno?
    }
}
