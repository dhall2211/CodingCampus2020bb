package Eric;

import java.util.*;

class testInit {

    public static void main(String[] args) {

        Vector<String > list = new Vector<>();
        list.add("2er");
        list.add("3z5");

        System.out.println(list.get(0).substring(1,2));
        list.sort((o1, o2) -> o2.substring(1,2).compareTo(o1.substring(1,2)));

        System.out.println(list);
        // counter initialisieren
        int toppingCounter = 2;

        // da nur bei richtiger eingabe reagiert wird reicht eine schleife
        // solange counter > 0 kann topping hinzugefügt werden
        while (toppingCounter > 0) {

            System.out.println("add topping to your pizza");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.next();

            // wenn user 0 eingibt wird die abfrage beendet und das programm springt aus der while loop
            if (userInput.equals("0")){
                break;
            }

            switch (userInput) {
                case "1", "2","3","4" -> {
                    addTopping(userInput);
                    toppingCounter--;
                }
                default -> printError();
            }
        }
        System.out.println("pizza is ready");
    }

    public static void addTopping(String str) {
        if (str.equals("1")){
            System.out.println("pep");
        }
        System.out.println("topping added " + str);
    }

    public static void printError() {
        System.out.println("no topping added");
    }
}
