package gr.aueb.cf.cf9.ch6;

/**
 * Εστω οτι αναπαριστουμε μεγαλους ακεραιους σε μορφη
 * πινακα. Θελουμε να προσθεσουμε την μοναδα
 */
public class AddOneUp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        int[] print;

        print = AddOne(arr);
        printArray(arr);
        System.out.println();
        printArray(print);

    }

    /**
     * Προσθετει τη μοναδα σε ενα πινακα που
     * αναπαριστα ενα ακεραιο.
     * @param arr ο input πινακας
     * @return ενα array με το αποτελεσμα
     */
    public static int[] AddOne (int[] arr) {
        if (arr == null) return new int[0];
        int[] arrOut = new int[arr.length + 1];
        int sum = 0;
        int carry = 1;

        for (int i = arr.length - 1; i >=0; i--) {
            sum = arr[i] + carry;
            arrOut[i + 1] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 1) {
            arrOut[0] = 1;
        }
        return arrOut;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}



