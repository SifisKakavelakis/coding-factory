package gr.aueb.cf.cf9Exercise.ch4;

import java.util.Scanner;

public class StarsNto1 {

    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε των αριθμό από τον οποόο θέλετε να ξεκινάει η εκτύπωση των αστερίων");
        num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
