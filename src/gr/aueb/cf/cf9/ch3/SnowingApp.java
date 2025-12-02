package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * The user inserts the temperature, and the boolean status of isRaining
 * variable and calculates if it is snowing or not. If it is raining and
 * the temperature is below 0, it is snowing.
 */
public class SnowingApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        // Εισαγωγη Δεδομενων
        System.out.println("Παρακαλω εισαγετε αν βρεχει (true/false)");
        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλω εισαγετε την θερμοκρασια");
        temperature = scanner.nextInt();

        // Επεξεργασια των δεδομενων
        isSnowing = isRaining && (temperature < 0);

        // Εκτυπωση των αποτελεσματων
        System.out.println("Is Snowing: " + isSnowing);
    }
}
