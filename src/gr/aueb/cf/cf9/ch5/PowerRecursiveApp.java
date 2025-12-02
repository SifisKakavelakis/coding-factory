package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static int powerCalculator(int base, int power) {
//        if (power == 0) {
//            return 1;
//        }
//        return base* powerCalculator(base,power -1);

        return power == 0 ? 1 : base * powerCalculator(base, power - 1);

    }
}
