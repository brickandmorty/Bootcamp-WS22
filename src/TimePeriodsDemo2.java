import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimePeriodsDemo2 {

    // Java program to get the difference
// between Two Time Periods in Java

// Importing the LocalTime class
// Importing the ChronoUnit class

        public static void main(String[] args)
        {

            // Parsing Time Period in the format HH:MM:SS
            LocalTime time1 = LocalTime.of(18,00,00);
            LocalTime time2 = LocalTime.of(21,22,22);

            // Calculating the difference in Hours
            long hours = ChronoUnit.HOURS.between(time1, time2);

            // Calculating the difference in Minutes
            long minutes =
                    ChronoUnit.MINUTES.between(time1, time2) % 60;

            // Calculating the difference in Seconds
            long seconds =
                    ChronoUnit.SECONDS.between(time1, time2) % 60;


            // Printing the difference
            System.out.println(
                    "Difference of time is:  " + hours + " hours " + minutes +
                            " minutes " + seconds + " seconds." );
        }
    }

