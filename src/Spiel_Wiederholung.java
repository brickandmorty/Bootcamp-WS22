import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Spiel_Wiederholung {

    static Integer randomNumber = ThreadLocalRandom.current().nextInt(0,100 + 1);

    static Integer tries = 0;


    public static void main(String[] args) {

        System.out.println("The number is: " + randomNumber);

        nextRound();

    }
    public static void nextRound() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");

        Integer userNumber = scanner.nextInt();
        guess(userNumber);
    }

    public static void guess(Integer userNumber) {

        if (userNumber == randomNumber) {
            System.out.println("Super! Richtig geraten!");
            System.out.println("Sie haben " + tries + " Versuche gebraucht.");
        } else {

            tries++;

            if (userNumber < randomNumber){
                System.out.println("Leider falsch. Die Zahl ist zu klein!");
                System.out.println("Versuchen Sie es noch einmal.");
            } else {
                System.out.println("Leider falsch. Die Zahl ist zu groß!");
                System.out.println("Versuchen Sie es noch einmal.");
            }

            nextRound();
        }

    }

}
