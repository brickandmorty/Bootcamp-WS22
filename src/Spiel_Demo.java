import java.util.Scanner;

public class Spiel_Demo {

    static Integer myNumber = 42;

    public static void main(String[] args) {
        guess(42);
        guess(13);
        guess(42);
        guess(94);

    }

    public static void guess(Integer userNumber) {
        if (userNumber == myNumber) {
            System.out.println("Richtig geraten!! :-)");
        } else {
            System.out.println("Leider falsch geraten! :-( Try again..");
        }
    }
}
