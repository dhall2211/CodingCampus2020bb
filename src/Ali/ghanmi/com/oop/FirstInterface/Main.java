package Ali.ghanmi.com.oop.FirstInterface;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Lehrer> lehrers = new Vector<>();
        lehrers.add(new Lehrer("Gyula", new German()));
        lehrers.add(new Lehrer("Dan", new English()));

        for (Lehrer l : lehrers) {
            l.greeting();
        }
    }
}
