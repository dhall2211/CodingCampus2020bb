package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class Fisch extends Tiere{
    public Fisch(String name) {
        super(name);
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
      //  System.out.println("Fisch: "+name+" Macht nicht");
    }

    @Override
    public void interaction(ISimulation friend) {

    }

    @Override
    public String getName() {
        return name;
    }
}
