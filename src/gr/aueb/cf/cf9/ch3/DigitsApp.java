package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το πληθος των ψηφιων ενος
 * ακεραιου. Για παραδειγμα αν ο ακεραιος ειναι
 * ο 178 το πληθος των φηφιων ειναι 3.
 */
public class DigitsApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        inputNum = num;
       do {
           digits++;
           num /= 10;
       } while (num > 0);

        System.out.println("The number of digits of " + inputNum + " 8is: " + digits);
    }
}
