package gr.aueb.cf.cf9Exercise.ch4;

import java.util.Scanner;

public class DaySelector {

    public static void main(String[] args) {
        int choice  = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε ένα νούμερο το οποίο θα αντιπροσωπευεί μια μέρα της εβδομάδας.");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Δευτέρα");
                break;
            case 2:
                System.out.println("Τρίτη");
                break;
            case 3:
                System.out.println("Τετάρτη");
                break;
            case 4:
                System.out.println("Πέμπτη");
                break;
            case 5:
                System.out.println("Παρασκευή");
                break;
            case 6:
                System.out.println("Σάββατο");
                break;
            case 7:
                System.out.println("Κυριακή");
                break;
        }
    }
}
