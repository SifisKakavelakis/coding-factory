package gr.aueb.cf.cf9Exercise.ch4;

import java.util.Scanner;

public class HorizontalStars {

    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε των αριθμό των αστεριών που θέλετε να εκτυπώσετε");
        num = scanner.nextInt();

        for (int i =0; i < num; i++){
            System.out.print("*");
        }
    }

}
