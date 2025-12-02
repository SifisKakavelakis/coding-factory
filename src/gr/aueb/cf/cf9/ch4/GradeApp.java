package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * ¨Λαμβανει ενα βαθμο απο τον χρηστη
 *  και αναλογατην βαθμολογικη κλιμακα
 *  εμφανιζει καταλληλο μηνυμα.
 */
public class GradeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κατω απο τη βαση");
                break;
            case 5:
            case 6:
                System.out.println("Καλως");
            case 7:
            case 8:
                System.out.println("Λιαν καλως");
                break;
            case 9:
            case 10:
                System.out.println("Αριστα");
                break;
            default:
                System.out.println("Ο βαθμος πρεπει να ειναι μεταξυ 1-10");
                break;
        }
    }
}
