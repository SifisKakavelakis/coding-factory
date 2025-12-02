package gr.aueb.cf.cf9.challenges;

/**
 * Εστω πινακας με ν στοιχεια απο 1 εως ν+1
 * Για παραδειγμα [1, 2 , 3 ,5]
 * Βρειτε το στοιχειο που λειπει.
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[]arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n= arr.length;
        expectedSum = (n * (n + 1) / 2);
        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
        }
    }
