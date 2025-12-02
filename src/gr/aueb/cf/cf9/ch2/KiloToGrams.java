package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * The user inserts the weight in kilograms
 * and the program calculates the weight
 * in grams.
 */

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KILOS_TO_GRAMS = 1000;
        int inputWeightInKilos = 0;
        int weightInGrams = 0;

        System.out.println("Παρακαλω εισαγετε το βαρος σας σε κιλα: ");
        inputWeightInKilos = scanner.nextInt();
        weightInGrams = inputWeightInKilos * KILOS_TO_GRAMS;

        System.out.printf("Τα %d κιλα ειναι ισα με: %,d γραμμαρια\n", inputWeightInKilos, weightInGrams);

    }
}
