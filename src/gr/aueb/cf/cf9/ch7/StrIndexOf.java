package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfoof = cf.indexOf("o"); // 1
        System.out.println(positionOfoof);

        int positionOfNexto = cf.indexOf("o",2); // 11
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o"); // 11
        System.out.println(positionOfLasto);
    }

    // Μεθοδος που να επιστρεφει την καταληξη του ονοματος ενος αρχειου
    // coding.txt

    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
