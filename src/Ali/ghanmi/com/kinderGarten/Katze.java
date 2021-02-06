package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class Katze extends Tiere {
    public Katze(String name) {
        super(name);
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
        System.out.println("katze: " +name+" springt hin und her");
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
