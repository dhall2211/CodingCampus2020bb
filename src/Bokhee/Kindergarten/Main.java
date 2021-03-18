package Bokhee.Kindergarten;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<IAction> simulationsCore = new Vector<>();

        simulationsCore.add(new Kindergartenerin("Karin", 10));
        String[] kinder = {"Luca", "Marcello", "Dominik", "Sandro", "Marvin", "Jona"};
        for (String name : kinder) {
            Kind kind = new Kind(name);
            simulationsCore.add(kind);
        }

        simulationsCore.add(new Katze("Blacky", Farbe.BLACK));
        simulationsCore.add(new Katze("whity", Farbe.WHITE));
        simulationsCore.add(new Katze("yellowy", Farbe.BROWN));

        simulationsCore.add(new Hund("Jindo", Farbe.WHITE));
        simulationsCore.add(new Hund("Rabarador", Farbe.BROWN));
        simulationsCore.add(new Fisch("Platy", Farbe.GOLD));
        simulationsCore.add(new Fisch("Guppy", Farbe.RED));


        for (int i = 0; i < 1; i++) {
            for (IAction a : simulationsCore) {
                a.doOwnThing(simulationsCore);
                a.interaction(a);
            }
        }

    }
}
