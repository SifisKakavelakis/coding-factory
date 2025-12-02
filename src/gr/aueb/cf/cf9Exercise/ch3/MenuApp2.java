package gr.aueb.cf.cf9Exercise.ch3;

import java.util.Scanner;

public class MenuApp2 {

    public static void main(String[] args) {

        int numberInput = 0;
        Scanner scanner = new Scanner(System.in);

        while (numberInput != 5){
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.println();

            System.out.println("Παρακαλώ επιλέξτε μια από τις πέντε επιλογές που εμφανίζονται στο παρακάτω menu:");
            numberInput = scanner.nextInt();

            if (numberInput == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (numberInput == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (numberInput == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (numberInput == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (numberInput == 5){
                System.out.println("Έξοδος");
                break;
            } else {
                System.out.println("Παρακαλώ επιλέξτε ενα νούμερο από το ένα μέχρι το πέντε");
            }
        }


    }
}
