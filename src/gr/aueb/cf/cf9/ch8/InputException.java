package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * To {@link java.util.InputMismatchException} συμβαινει
 * οταν ο {@link java.util.Scanner} αποτυγχανει να διαβασει
 * το σωστο τυπο δεδομενων.
 */
public class InputException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one int: ");
        // num = scanner.nextInt();

        while (!scanner.hasNextInt()) {
            System.out.println("Μη αποδεκτοι χαρακτηρες");
            scanner.nextLine();
        }

        num = scanner.nextInt();
        System.out.printf("Num" + num);
    }
}
