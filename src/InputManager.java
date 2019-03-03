import javax.swing.*;
import java.util.Scanner;

public class InputManager {

    private static Scanner scanner = new Scanner(System.in);

    public static String getOperation() {
        System.out.println("Podaj znak operacji matematycznej," + " którą chcesz wykonać");
        return scanner.next();

//        return JOptionPane.showInputDialog("Podaj znak operacji matematycznej," + "którą chcesz wykonać");
//        //dlatego plus bo sie nie miesci w jednej lini
    }

    public static String getNumber() {
        System.out.println("Podaj liczbę dla której chcesz wykonac operację");
        return scanner.next();
    }
}
