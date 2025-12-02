package gr.aueb.cf.cf9Exercise.ch4;

import java.util.Scanner;

public class NxNStars {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε 2 αριθμούς για την εκτύπωση αστεριών οριζόντια και κάθετα");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
