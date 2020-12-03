package Ali.ghanmi.com;

import java.util.Random;

public class RandomMethoden2 {
    public static void zufall2() {

        String[] etablisementSelection2 = {"Restaurant", "Pub", "Club", "Pizzeria", "Brasserie"};
        String[] nameR2 = {"Löwe", "Oepfelchammer", "Hausmaa", "Hirschen", "Bären", "Rösli", "Damen", "StammTisch","Engel"};
        String[] nameAdetive2 = {"Blau", "Rosarot", "Pink", "Frische", "fine", "Süsse", "Junge", "Geile"};
        for (int i = 0; i < etablisementSelection2.length; i++) {
            String titel2 = etablisementSelection2[new Random().nextInt(etablisementSelection2.length)];
            for (int j = 0; j < nameR2.length; j++) {
                String name2 = nameR2[new Random().nextInt(nameR2.length)];
                for (int k = 0; k < nameAdetive2.length; k++) {
                    String nameZusatz2 = nameAdetive2[new Random().nextInt(nameAdetive2.length)];


                    System.out.println("  "+titel2 + ":  " + nameZusatz2 + " " + name2);

                }
            }
        }
    }
}