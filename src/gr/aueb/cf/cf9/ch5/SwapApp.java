package gr.aueb.cf.cf9.ch5;

/**
 * Οριζει μια μεθοδο void swap(int a, int b)
 * η οποια θα ανταλασει αμοιβαια τις τιμες a, b
 */
public class SwapApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a,b);

        System.out.printf("a = %d, b = %d\n", a, b);

    }

    /**
     * Swap two numbers
     * @param a the first number
     * @param b the second number
     */
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
