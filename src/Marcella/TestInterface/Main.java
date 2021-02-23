package Marcella.TestInterface;

import java.util.Vector;

    public class Main {
        public static void main(String[] args) {
            Vector<ISimulation> simulation = new Vector<>();

            simulation.add(new Lion("Leo"));
            simulation.add(new Lion("Lea"));
            simulation.add(new Lion("Luisa"));
            simulation.add(new Monkey("Utan"));

            for (ISimulation oneSimulation : simulation) {
                oneSimulation.doSomething(simulation);
            }
        }

    }

