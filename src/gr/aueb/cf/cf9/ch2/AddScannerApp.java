package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβαζει δυο ακεραιους απο το stdin (keyboard)
 * και υπολογιζει το αποτελεσμα
 */
public class AddScannerApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολες
        System.out.println("Παρακαλω εισαγετε δυο ακεραιους: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        // Εκτυπωση αποτελεσματων
        System.out.printf("Το αθροισμα των %d και %d ειναι ισο με %d\n", num1, num2, sum);
    }
}
