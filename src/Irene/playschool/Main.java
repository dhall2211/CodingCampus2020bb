package Irene.playschool;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<ISimulation> everyThingCanBeSimulated = new Vector<>();
        Random random = new Random();

        everyThingCanBeSimulated.add(new Child("Luca", 5));
        everyThingCanBeSimulated.add(new Child("Victor", 3));

        for (int i = 0; i < 100; i++) { // 100 rounds of simulation
            for (ISimulation sim: everyThingCanBeSimulated){
                ISimulation target = everyThingCanBeSimulated.get(random.nextInt(everyThingCanBeSimulated.size()));
                sim.interaction(target);
            }

        }
    }
}
