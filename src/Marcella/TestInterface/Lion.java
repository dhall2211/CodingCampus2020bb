package Marcella.TestInterface;

import java.util.Vector;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void doSomething(Vector<ISimulation> simulation) {
        System.out.println(this.getName() + " gähnt");
    }

}
