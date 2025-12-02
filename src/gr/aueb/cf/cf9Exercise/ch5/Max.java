package gr.aueb.cf.cf9Exercise.ch5;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 3 αριθμούς τους οποίους θέλετε να συγκρίνετε.");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        result = findMax(num1, num2, num3);
        System.out.println("Ο μεγαλύτερος από τους 3 αριθμούς είναι ίσος με " + result);
    }

    public static int findMax(int num1, int num2, int num3) {
        int max = num1; // Αρχικά υποθέτουμε ότι ο a είναι ο μεγαλύτερος
        if (num2 > max) {
            max = num2; // Αν ο b είναι μεγαλύτερος, ενημερώνουμε
        }
        if (num3 > max) {
            max = num3; // Αν ο c είναι μεγαλύτερος, ενημερώνουμε
        }
        return max;
    }
}