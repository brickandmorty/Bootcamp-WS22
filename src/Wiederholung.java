public class Wiederholung {
    public static void main(String[] args) {

        showGreeting(20);

        System.out.println();
        System.out.println("Wir wiederholen jetzt, was wir bereits gelernt haben!");

        String name = "Sara \"Kati\" Horvat";
        String job = "WIN - Studentin";
        System.out.println();
        System.out.println("Mein Name ist " + name + " und aktuell bin ich " + job + ".");

    }

    public static void showGreeting (Integer hour) {

        if (hour < 12) {
            System.out.println("Guten Morgen!");
        } else if (hour < 18) {
            System.out.println("Guten Tag! Wie geht's, wie steht's?");
        } else {
            System.out.println("Guten Abend!");
        }

        }

    }
