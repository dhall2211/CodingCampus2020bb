package Ali.ghanmi.com;

import java.util.Random;

public class RondomMethode {
    public static void zufall() {
        String[] etablisementSelection = {"Restaurant", "Pub", "Club", "Pizzeria", "Brasserie"};
        String[] nameR = {"Löwe", "Oepfelchammer", "Hausmaa", "Hirschen", "Bären", "Rösli", "Damen", "StammTisch"};
        String[] nameAdetive = {"Blau", "Rosarot", "Pink", "Sauber", "fine", "Süss", "Junge", "Geile"};

        String titel = etablisementSelection[new Random().nextInt(etablisementSelection.length)];
        String name = nameR[new Random().nextInt(nameR.length)];
        String nameZusatz = nameAdetive[new Random().nextInt(nameAdetive.length)];

        System.out.println(titel + " " + nameZusatz + " " + name);



                }
            }


