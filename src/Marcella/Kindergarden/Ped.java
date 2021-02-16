package Marcella.Kindergarden;

import java.util.Comparator;
import java.util.Vector;

public class Ped extends Being {

    public Ped(Kindergarden kindergarden, String name, String type) {
        super(kindergarden, name, type);
    }

    @Override
    public void doSomething() {
        Vector<Child> children = new Vector<>(kindergarden.getChildren());
        children.sort(Comparator.comparing(Child::getHappyIndex));

        Child unhappiestChild = children.get(0);
        System.out.println(this.name + " kümmert sich um " + unhappiestChild.name);
    }

}
