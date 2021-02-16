package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public interface ISimulation {
    public void printSimulation(Vector<ISimulation> friends);

    public void interaction(ISimulation friend);

    public String getName();

}
