package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει ενα μενου επιλογων μεχρι ο χρηστης
 * να επιλεξει "Exit" (τον αριθμο 3)
 */
public class Menu2App {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Επεξεργασια δεδομενων - While - do
        while (true) {
            System.out.println("Παρακαλω επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. Εισαγωγη αιτησης");
            System.out.println("2. Διαγραφη αιτησης");
            System.out.println("3. Εξοδος");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }
        // Εκτυπωση των αποτελεσματων
        System.out.println("Thanks for using the program");
    }
}
