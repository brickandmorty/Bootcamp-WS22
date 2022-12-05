public class Main {
    public static void main(String[] args) {
        // write your code here

        String name = "Sara \"Kati\" Horvat";
        // String bedeutet, dass es sich um eine Text-Variable handelt
                /* für den Fall, dass die Anführungszeichen tatsächlich ausgeben werden sollen,
                einfach davor ein \ (= Backslash) eingeben! :-) */

        String job = "WIN-Studentin";

        Integer hour = 9;

        if (hour < 12) {
            System.out.println("Guten Morgen!");
        }
            else if (hour < 18) {
                System.out.println("Guten Tag!");
            } else {
            System.out.println("Guten Abend!");
        }

        System.out.println("Ich heiße " + name + "!");
        System.out.println("Ich bin aktuell " + job + ".");
    }

    }