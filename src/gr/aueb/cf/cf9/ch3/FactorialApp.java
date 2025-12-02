package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculate factorial of a number.
 * n! = 1 * 2 * 3 * ... * n
 * For instance 5! = 1 * 2 * 3 * 4 * 5 = 120
 */

public class FactorialApp {
    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        int i = 1;

        // Εισοδος δεδομενων και αντιστοιχιση σε μεταβλητες
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Επεξεργασια δεδομενων - While - do
        while (i <= num) {
            factorial *= i; // result = result * base
            i++;
        }

        // Εκτυπωση των αποτελεσματων
        System.out.printf("%d! = %d\n", num, factorial);
    }
}