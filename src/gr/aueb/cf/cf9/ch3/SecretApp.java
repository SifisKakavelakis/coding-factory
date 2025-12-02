package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης προσπαθει να μαντεψει ενα μυστικο αριθμο.
 */
public class SecretApp {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση μεταβλητων
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.println("Please guess the secret number: ");
        num = scanner.nextInt();

        if(num == SECRET){
        System.out.println("You guessed the secret number!");
        } else {
            System.out.println("You did not guess the secret number!");
        }
    }
}
