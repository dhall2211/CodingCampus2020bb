package Ali.ghanmi.com.kinderGarten;

import java.util.Vector;

public class KinderGartenMain {
    public static void main(String[] args) {
        Vector<ISimulation> simulation = new Vector<>();
/*
        Vector<Tiere> tieres = new Vector<>();
        Vector<Kind> kinds = new Vector<>();
        Vector<KinderGäertner> kinderGäertners = new Vector<>();
*/
        simulation.add(new KinderGäertner("Manuel"));
        simulation.add(new KinderGäertner("Manuel"));

        simulation.add(new Kind("Alex"));
        simulation.add(new Kind("Alexandra"));
        simulation.add(new Kind("Felix"));
        simulation.add(new Kind("Anton"));


        simulation.add(new Katze("Franz"));
        simulation.add(new Hund("Bello"));
        simulation.add(new Fisch("Memo"));

        for (ISimulation is: simulation) {
            is.printSimulation(simulation);
        }
    }
}
