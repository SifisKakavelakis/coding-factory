package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1,
 * the while-do loop will stop.
 */
public class IterationCountApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        // Εισοδος δεδομενων και αντιστοιχιση σε μεταβλητες
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Επεξεργασια δεδομενων - While - do
        while(num != -1) {
            iterations++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();
        }

        // Εκτυπωση των αποτελεσματων
        System.out.println("The count of iterations is: " + iterations);
    }
}
