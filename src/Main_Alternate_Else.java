public class Main_Alternate_Else {
    public static void main(String[] args) {

        Integer hour = 14;

        if (hour < 12) {
        System.out.println("Guten Morgen! "); }

        else {
            if (hour < 18) {
                    System.out.println("Guten Tag!");
                }
            else {
            System.out.println("Guten Abend!");
        }}

        System.out.println();

        String name = "Sara \"Kati\" Horvat.";
        String job = "WIN Studentin am Campus 02";

        System.out.println("Mein Name ist " + name + " Aktuell bin ich " + job + ".");

    }
}
