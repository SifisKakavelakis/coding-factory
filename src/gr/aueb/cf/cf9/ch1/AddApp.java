package gr.aueb.cf.cf9.ch1;

/**
 * Προσθετει δυο ακεραιους και εμφανιζει το αποτελεσμα στην κονσολα.
 */
public class AddApp {

    public static void main(String[] args){

        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 500_000;
        int num2 = 10_000;
        int result = 0;

        // Εντολες
        result = num1 + num2;

        // Εκτυπωση αποτελεσματων
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.println("Το αθροισμα των: " + num1 + ", " + num2 + " ειναι: " + result);
        System.out.printf("Το αθροισμα των: %,d, %,d ειναι: %,d\n", num1, num2, result);

    }
}
