package gr.aueb.cf.cf9Exercise.ch3;

import java.util.Scanner;

public class YearCalculator {

    public static void main(String[] args) {

        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγεται το έτος που θέλετε να εξετάσετε:");
        year = scanner.nextInt();

//        System.out.println(year % 4);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Το έτος είναι δίσεκτο");
        } else {
            System.out.printf("Το έτος δεν είναι δίσεκτο");
        }
    }
}
