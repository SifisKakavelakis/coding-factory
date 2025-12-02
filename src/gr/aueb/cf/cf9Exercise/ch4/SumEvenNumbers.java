package gr.aueb.cf.cf9Exercise.ch4;

public class SumEvenNumbers {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Το άθροισμα των ζυγών αριθμών από το 1 μέχρι το 20 είναι ίσο με " + sum);
    }
}
