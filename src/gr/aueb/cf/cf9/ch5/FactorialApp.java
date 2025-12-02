package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το παραγοντικο του n,
 * με μεθοδο. Το n! = 1 * 2 * 3 * 4 * ... * n
 * Και 0! = 1
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        int num = 0;
        int factorial = 0;
        Scanner scanner = new Scanner(System.in);

        // Input data from the user and data binding
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Call the service method - delegation
        factorial = facto(num);     // inject the num real parameter

        // Εκτυπωση αποτελεσματος
        System.out.println("The factorial of " + num +" is: " + factorial);

    }

    /**
     *
     * @param n the number to calculate factorial of.
     * @return the factorial of n.
     */
    public static int facto(int n) {
        int factorial = 1;

        for (int i = 1; i <=n; i++) {
            factorial = factorial * i; // factorial *= i;
        }

        return  factorial;
    }
}
