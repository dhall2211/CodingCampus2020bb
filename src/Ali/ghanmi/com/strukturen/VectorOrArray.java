package Ali.ghanmi.com.strukturen;

import java.util.Arrays;
import java.util.Vector;

public class VectorOrArray {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Hello", "World", "!"};
        Vector<String> vectorOfStrings = new Vector<>(Arrays.asList(arrayOfStrings));

        for (String s: arrayOfStrings) {
            System.out.println("array: " + s);
        }

        for (String s: vectorOfStrings) {
            System.out.println("vector: " + s);
        }


        vectorOfStrings.remove("!");
        for (int i = 0; i < 10; i++) {
            vectorOfStrings.add("?");
        }

        arrayOfStrings[1] = "Vorarlberg";
        vectorOfStrings.set(1, "Vorarlberg");

        System.out.println(Arrays.asList(arrayOfStrings));
        System.out.println(vectorOfStrings);
    }
}
