package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβανει απο τον χρηστη ενα ποσο (ακεραιος) σε ευρω και το
 * μετατρεπει σε δολαρια ΗΠΑ με βαση μια ισοτιμια. Για παραδειγμα:
 * Αν ο χρηστης δωσει 100 ευρω και η ισοτιμια ειναι 1 ευρω = 99 USA cents,
 * τοτε τα συνολικα USA cents ειναι 9900 και αυτο αντιστιχει σε 99 USA Dollars
 * και 0 USA Cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args){

        //Δηλωση και αρχικοποιηση μεταβλητων
        int inputEuros = 0;
        int usaDollars = 0;
        int usaCents = 0;
        int totalUsaCents = 0;
        final int EUROS_TO_DOLLARS_RATE = 99;
        Scanner scanner = new Scanner(System.in);

        // Data Input
        System.out.printf("Παρακαλω εισαγετε ενα ποσο σε ευρω: \n");
        inputEuros = scanner.nextInt();

        // Data processing - Expressions
        totalUsaCents = (EUROS_TO_DOLLARS_RATE * inputEuros);
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Data Output
        System.out.printf("%d Euros = %d USD dollars και %d USD Cents", inputEuros, usaDollars, usaCents);
    }
}
