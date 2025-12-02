package gr.aueb.cf.cf9Exercise.ch2;

import java.util.Scanner;

public class DateConverter {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγεται 3 αριθμούς οι οποίοι αναπαριστούν της ημέρες τους μένες και τα χρόνια μιας ημερομηνίας.");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        System.out.printf("%d/%d/%d", day,month,year);
    }
}