package gr.aueb.cf.cf9Exercise.ch5;

import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {
        int num = 0;
        int sq =0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισαγετε το νουμερο το οποιο θελετε το τετραγωνο του");
        num = scanner.nextInt();

        sq = square(num);

        System.out.println("Το τετραγωνο του " + num + " ειναι ισο με " + sq);
    }

    public static int square (int num) {
        int sq = 0;
        sq = num * num;

        return sq;
    }
}
