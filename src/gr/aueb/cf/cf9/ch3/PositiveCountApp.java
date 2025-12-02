package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positive numbers
 * How many loops will be needed is a decision that
 * happens @runtime.
 */
public class PositiveCountApp {
    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        // Εισαγωγη Δεδομενων
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Διαβαζει μεχρι να βρει αρνητικο ακεραιο (sentinel)
        while(num >= 0) {
            positives++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();
        }

        // Εκτυπωση των αποτελεσματων
        System.out.println("The count of positive numbers is: " + positives);
    }
}
