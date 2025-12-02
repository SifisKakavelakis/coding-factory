package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει ενα ακεραιο που συμβολιζει μια
 * θερμοκρασια. Και το προγραμμα υπολογιζει αν η
 * θερμοκρασια ειναι μικροτερη απο το 0 τοτε μια μεταβλητη
 * γινεται true αλλιως γινεται false
 */
public class TemperatureApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        // Εισαγωγη Δεδομενων
        System.out.println("Παρακαλω εισαγεται μια θερμοκρασια: ");
        temperature = scanner.nextInt();

        // Επεξεργασια των δεδομενων
        isTempBelowZero = temperature < 0;

        // Εκτυπωση των αποτελεσματων
        System.out.println("Η θερμοκρασια ειναι μικροτερη απο το 0: " + isTempBelowZero);
    }
}
