package gr.aueb.cf.cf9.ch7;

public class StrEtc {

    public static void main(String[] args) {

        // Travers as array
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }

        System.out.println("\u2764");
    }

    // Replace
    String firsname = "Maria-Helen";
    String simplename = firsname.replace("-", " ");

    // Concat
    String lastname = "Smith";
    String fullname1 = firsname + " " + lastname;
    String fullname2 = firsname.concat(" ").concat(lastname);
}
