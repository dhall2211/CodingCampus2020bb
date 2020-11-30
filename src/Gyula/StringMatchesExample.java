package Gyula;

public class StringMatchesExample {
    public static void main(String[] args) {
        testFirstName("");
        testFirstName("123456");
        testFirstName("a234");
        testFirstName("a");
        testFirstName("aa");
        testFirstName("Alex Bertold Charlie");
    }

    public static void testFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.matches("[A-Za-z]") || firstName == ""){
            System.out.println("Original Matches: REJECT " + firstName);
        } else {
            System.out.println("Original Matches: ACCEPT " + firstName);
        }

        if (!firstName.matches("[A-Za-z]+")) {
            System.out.println("Neuer Matches: REJECT " + firstName);
        } else {
            System.out.println("Neuer Matches: ACCEPT " + firstName);
        }
    }
}
