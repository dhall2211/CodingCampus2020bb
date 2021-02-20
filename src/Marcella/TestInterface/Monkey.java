package Marcella.TestInterface;

import java.util.Random;
import java.util.Vector;

public class Monkey extends Animal {

    private static Random random = new Random();

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void doSomething(Vector<ISimulation> simulation) {
        ISimulation choosenLion = simulation.get(random.nextInt(simulation.size()));
        if (choosenLion instanceof Lion) {
            System.out.println(this.getName() + " spielt mit " + ((Lion) choosenLion).getName());
        }
    }

}
