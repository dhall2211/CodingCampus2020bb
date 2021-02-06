package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class KinderGäertner extends Person {
    public KinderGäertner(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printSimulation(Vector<ISimulation> friends) {
        System.out.println("kindergärtner: "+ name+" Passt auf dem kind ");
    }

    @Override
    public void interaction(ISimulation friend) {
        System.out.println();
    }

    @Override
    public String getName() {
        return name;
    }
}
