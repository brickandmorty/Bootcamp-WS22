import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
// int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

public class Spiel_Demo {

    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static Integer tries = 0;
    static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
    static JTextField einzigesTextField = new JTextField();


    public static void main(String[] args) {

        openUI();

        // Die nächste Zeile nachher auskommentieren, sonst ist es ja kein Raten mehr.. :D
        //System.out.println("The number is: " + myNumber);

        //nextRound();
    }

    public static void openUI(){
        JFrame frame = new JFrame("Rate die Zahl!");
        frame.setSize(400, 300);
        frame.setLocation(100,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);

        // auch das hier oben geaddet, deshalb hier obsolet: JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein!");
        text.setBounds(50,50,350,30);

        // das stand hier bevor wir es oben geaddet haben: JTextField einzigesTextField = new JTextField();
        einzigesTextField.setBounds(50,100,50,30);

        JButton button = new JButton("Raten Sie!");
        button.setBounds(50,150,200,30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                String textFromEinzigesTextfield = einzigesTextField.getText();
                Integer userNumber = Integer.parseInt(textFromEinzigesTextfield);
                guess(userNumber); }
                catch (Exception exception){
                    text.setText("Bitte gebe eine ZAHL ein!");
                }
            }
        });

        frame.add(text);
        frame.add(einzigesTextField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    /** public static void nextRound() {

        tries++;
        // ist das gleiche wie tries = tries +1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");

        Integer userNumber = scanner.nextInt();
        guess(userNumber); */


    public static void guess(Integer userNumber) {

        if (userNumber == myNumber) {
            System.out.println("Richtig geraten!! :-)");
            System.out.println("Du hast " + tries + " Versuche gebraucht.");

            text.setText("Richtig geraten!! :-) Du hast " + tries + " Versuche gebraucht!");

        } else {
            tries++;
            if (userNumber < myNumber) {
                text.setText("Leider falsch geraten! :-( \n Deine Zahl ist zu klein.");

            } else {
                text.setText("Leider falsch geraten! :-( \n Deine Zahl ist zu groß.");
            }

            // nextRound();
            // Zeile oberhalb in UI nicht notwendig, denn Eingabe über CMD Zeile obsolet

        }
    }
}
