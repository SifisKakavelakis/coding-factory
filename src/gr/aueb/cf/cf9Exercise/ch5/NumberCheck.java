package gr.aueb.cf.cf9Exercise.ch5;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε έναν αριθμό τον οποίο θέλετε να ελέγξετε.");
        num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " είναι πρώτος αριθμός.");
        } else {
            System.out.println(num + " δεν είναι πρώτος αριθμός.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
