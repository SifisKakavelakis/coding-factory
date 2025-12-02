package gr.aueb.cf.cf9Exercise.ch2;

import java.util.Scanner;

public class FahrenheitConverter {

    public static void main(String[] args) {
        int fahrenheitInput = 0;
        int celsiusOutput = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγεται την θερμοκρασία την οποία θέλετε να μετατρέψετε απο την κλίμακα Fahrenheit στην κλίμακα Celsius: ");
        fahrenheitInput = scanner.nextInt();
        celsiusOutput = 5 * (fahrenheitInput - 32) / 9;

        System.out.println("Η μετατροπη ισουται με " + celsiusOutput);

    }
}
