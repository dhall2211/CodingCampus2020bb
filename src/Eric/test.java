package Eric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class testInit {

    public static void main(String[] args) {

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
