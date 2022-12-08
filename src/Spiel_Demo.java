import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
// int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

public class Spiel_Demo {

    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static Integer tries = 0;


    public static void main(String[] args) {

        // Die nächste Zeile nachher auskommentieren, sonst ist es ja kein Raten mehr.. :D
        System.out.println("The number is: " + myNumber);

        nextRound();
    }

    public static void nextRound() {

        tries++;
        // ist das gleiche wie tries = tries +1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");

        Integer userNumber = scanner.nextInt();
        guess(userNumber);

    }
    public static void guess(Integer userNumber) {
        if (userNumber == myNumber) {
            System.out.println("Richtig geraten!! :-)");
            System.out.println("Du hast " + tries + " Versuche gebraucht.");
        } else {
            System.out.println("Leider falsch geraten! :-( Try again..");
        }

        if (userNumber < myNumber){
            System.out.println("Deine Zahl ist zu klein.");
        } else if ( userNumber == myNumber) {
            System.out.println("Supi!");
        }
        else {
            System.out.println("Deine Zahl ist zu groß.");
        }
        nextRound();
    }
}
