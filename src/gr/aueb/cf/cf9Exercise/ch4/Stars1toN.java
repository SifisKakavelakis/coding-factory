package gr.aueb.cf.cf9Exercise.ch4;

import java.util.Scanner;

public class Stars1toN {

    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε των αριθμό που θέλετε να τελειώνει η εκτύπωση των αστερίων");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
