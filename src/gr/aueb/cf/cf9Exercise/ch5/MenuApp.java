package gr.aueb.cf.cf9Exercise.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        int choice = 0;
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            System.out.println("Δώσε επιλογή: ");

            choice = scanner.nextInt();

            System.out.println("Δώστε αριθμό για αστεράκια");
            n = scanner.nextInt();

            switch (choice) {
                case 1:
                    horizontal(n);
                    break;
                case 2:
                    vertical(n);
                    break;
                case 3:
                    nXn(n);
                    break;
                case 4:
                    nLines1ToN(n);
                    break;
                case 5:
                    nLinesNTo1(n);
                    break;
                case 6:
                    System.out.println("Έξοδος...");
                    return;
                default:
                    System.out.printf("Μη έγκυρη επιλογή!");
            }
            System.out.println();
        }
    }

    public static void horizontal(int n) {
        for (int i =0; i < n; i++){
            System.out.print("*");
        }
    }

    public static void vertical(int n) {
        for (int i =0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void nXn(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
            horizontal(n);
        }
    }

    public static void nLines1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(i);
            System.out.println();
        }
    }

    public static void nLinesNTo1(int n) {
        for (int i = n; i >= 1; i--) {
            horizontal(i);
            System.out.println();
        }
    }
}
