public class Operations {
    public static int giveAnswer(String znakDzialania, String liczba1, String liczba2) {
        switch (znakDzialania){
            case "+":
                return Integer.valueOf(liczba1) + Integer.valueOf( liczba2);
                //zadeklarowalismy ze liczba to string wiec musimy zaienic ja na INT
            case "-":
                return Integer.valueOf(liczba1) - Integer.valueOf( liczba2);
            case "*":
                return Integer.valueOf(liczba1) * Integer.valueOf( liczba2);
            case "/":
                return Integer.valueOf(liczba1) / Integer.valueOf( liczba2);
                default:
                    throw new IllegalArgumentException();
                    //jezlei umiescimy tutaj wyjatek to dowiemy sie od razu ze cos jest nie tak ze znakiem niz bedzie to krazylo po kodzie
        }

    }
}
