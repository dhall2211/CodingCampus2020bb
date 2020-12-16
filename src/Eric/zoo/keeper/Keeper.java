package Eric.zoo.keeper;

import Eric.zoo.Observer;
import Eric.zoo.ZooController;
import Eric.zoo.animals.Animal;
import Eric.zoo.compounds.Compound;

import java.util.List;

public class Keeper extends Observer {
    private final int bonus = 100;
    private String name;
    private List compoundsToKeep;

    public Keeper(String name, List<Compound> compoundsToKeep) {
        this.name = name;
        this.compoundsToKeep = compoundsToKeep;

        for (var c : compoundsToKeep) {
            var animals = c.getAnimalsInCompound();

            for (Animal animal : animals) {
                animal.attach(this);
            }
        }
    }

    public String getName() {
        return name;
    }

    public List getCompoundsToKeep() {
        return compoundsToKeep;
    }

    @Override
    public void update() {
        System.out.println("-> Keeper " + this.getName() + " is coming. Bonus " + this.bonus);
        ZooController.budget -= bonus;
    }
}
