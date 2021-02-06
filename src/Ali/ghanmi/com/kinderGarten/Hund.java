package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class Hund extends Tiere {
    public Hund(String name) {
        super(name);
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
        System.out.println("Hund: "+name+" Verschreckt die kinder");
    }

    @Override
    public void interaction(ISimulation friend) {
        // TODO: 06.02.2021
    }

    @Override
    public String getName() {
        return name;
    }
}
