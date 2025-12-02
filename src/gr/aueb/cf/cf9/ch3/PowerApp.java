package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number, a^n
 * base^power = base * base * base * base ... * base
 * (power φορες)
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Εισοδος δεδομενων και αντιστοιχιση σε μεταβλητες
        System.out.println("Παρακαλω εισαγετε το base και το power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        // Επεξεργασια δεδομενων - While - do
        while (i <= power) {
            result *= base; // result = result * base
            i++;
        }

        // Εκτυπωση των αποτελεσματων
        System.out.printf("%d ^ %d = %d\n", base, power, result);
    }
}
