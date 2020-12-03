package Ali.ghanmi.com;

import java.util.Random;

public class WichteÜbung2 {
    public static void main(String[] arg) {
        String[] namesList = {"Pet", "San", "Jane", "Jo", "Elias"};

        String[] assignedName = new String[namesList.length];

        Random random = new Random();

        for (int i = 0; i < namesList.length; i++) {
            boolean loop = true;

            while (loop) {
                int selected = random.nextInt(namesList.length);
                if (i != selected && !isInArray(assignedName, namesList[selected])) {

                    assignedName[i] = namesList[selected];
                    System.out.println(namesList[i] + " ---> " + namesList[selected]);
                    loop = false;

                }
            }

        }

    }
//methodem check ob die gleiche name schon selected

    public static boolean isInArray(String[] arr, String string) {
        boolean inArray = false;

        for (String element : arr) {
            if (element != null && element.equals(string)) {
                inArray = true;
                break;
            }
        }
        return inArray;
    }

}


