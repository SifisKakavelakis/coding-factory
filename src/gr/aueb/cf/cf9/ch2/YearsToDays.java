package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης δινει την ηλικια του σε ετη
 * και το προγραμμα επιστρεφει την ηλικια
 * σε ημερες, οπου θεωρουμαι οτι 1 ετος
 * αντιστοιχει σε 365 ημερες. Για παραδειγμα
 * αν δοθει ηλικια 20 ετων το αποτελεσμα
 * ειναι 7210.
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλω εισαγετε την ηλικια σας: ");
        inputAgeInYears = scanner.nextInt();
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικια σε ετη: %d, Ηλικια σε ημερες: %d\n", inputAgeInYears, ageInDays);

    }
}
