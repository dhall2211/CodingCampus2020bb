package Ali.ghanmi.com.GyulaTiere;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Tier> tiere = new Vector<>();
        tiere.add(new Hase("Arthur"));
        tiere.add(new Papagei("Berta"));

        for (Tier t : tiere) {
            System.out.println(t);
        }
    }
}
