package gr.aueb.cf.cf9.ch6;

/**
 * Ελεγχει αν ενας πινακας ακεραιων
 * ειναι συμμετρικος ή οχι. Συμμετρικος
 * ειναι ενας πινακας αν διαβαζεται το ιδιο
 * απο την αρχη και το τελος.
 * Για παραδειγμα [1, 2, 3, 3, 2, 1]
 * [1, 2, 3, 2, 1]
 */
public class ArraySymetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySymetric(int[] arr) {
//        boolean isSymetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
//                isSymetric = false;
//                break;
                return false;
            }
        }
        return true;
    }
}
