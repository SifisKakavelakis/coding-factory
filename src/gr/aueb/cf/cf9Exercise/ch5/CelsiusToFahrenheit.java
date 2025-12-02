package gr.aueb.cf.cf9Exercise.ch5;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double tempToCelsius = 0;
        double tempToFahrenheit = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία σε βαθμούς Celsius.");
        tempToCelsius = scanner.nextDouble();
        tempToFahrenheit = converter(tempToCelsius);

        System.out.println("Οι " + tempToCelsius + " βαθμοί Celsius είναι ίσοι με " + tempToFahrenheit + " βαθμούς Fahrenheit.");
    }

    public static double converter(double tempToCelsius) {
        double tempToFahrenheit = 0;
         tempToFahrenheit = tempToCelsius * 9 / 5 + 32;
        return tempToFahrenheit;
    }
}
