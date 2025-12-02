package gr.aueb.cf.cf9Exercise.ch4;

public class SumInteger {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <=50; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Το άθροισμα των μονών αριθμών από το 1 μέχρι το 50 είναι ίσο με " + sum);
    }
}
