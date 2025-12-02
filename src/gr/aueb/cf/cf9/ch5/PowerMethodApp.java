package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Να υπολογιζει την δυναμη a^b
 */
public class PowerMethodApp {

    public static void main(String[] args) {
        int power = 0;
        int base = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number for base: ");
        base = scanner.nextInt();

        System.out.println("Please enter a number for power: ");
        power = scanner.nextInt();

        result = powerCalclutor(power, base);

        System.out.println(base + " ^ " + power + " = " + result);

    }

    public static int powerCalclutor (int power, int base) {
        int result =1;
        for (int i =1; i <= power; i++) {
            result = result * base;
        }

        return result;
    }
}
