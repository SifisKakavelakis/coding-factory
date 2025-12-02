package gr.aueb.cf.cf9.ch2;


import java.util.Scanner;

/**
 * Calc Hours to Minutes and Seconds for a given number of hours.
 */

public class HoursToMinSec {

        // Δηλωση και αρχικοποιηση μεταβλητων
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final int HOURS_IN_MIN = 60;
            final int HOURS_IN_SEC = 3600;
            int hours = 0;
            int minutes = 0;
            int seconds = 0;

            //Εντολες
            //Παρε input απο τον χρηστη -- data binding
            System.out.println("Παρακαλω εισαγετε τον αριθμο των ωρων: ");
            hours = scanner.nextInt();

            //Επεξεργασου το input --expressions
            minutes = hours * HOURS_IN_MIN;
            seconds = hours * HOURS_IN_SEC;

            //Δωσε στον χρηστη το αποτελεσμα
            System.out.printf("The number of minutes is: %,d\n", minutes);
            System.out.printf("The number of seconds is: %,d\n", seconds);

        }
    }

