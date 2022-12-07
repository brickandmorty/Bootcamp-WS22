import java.util.Scanner;

public class Umrechner_Demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double money = scanner.nextDouble();


        convertToDollars(money);
        convertToFranken(money);
        convertToYen(money);

    }

    private static void convertToFranken(Double eur) {
        System.out.println("Der genaue Betrag in Schw. Franken ist: " + eur * 0.99);

    }

    private static void convertToDollars(Double eur) {
        System.out.println("Der genaue Betrag in Dollar ist: " + eur * 1.05);
    }

    private static void convertToYen(Double eur) {
        System.out.println("Der genaue Betrag in Yen ist: " + eur * 144.38);
    }
}

