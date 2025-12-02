package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Ο χρηστης εισαγει το base και power και το προγραμμα
 * υπολογιζει το base^power.
 */
public class PowerApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a number for base: ");
        base = scanner.nextInt();

        System.out.println(" Please enter a number for power: ");
        power = scanner.nextInt();

        for (int i = 1; i <= power; i++ ) {
            result = result * base;
        }

        System.out.println(base + " ^ " + power + " = " + result);
    }
}
