package Eric._zoo_simulation.keeper;

import Eric._zoo_simulation.Observer;
import Eric._zoo_simulation.ZooController;
import Eric._zoo_simulation.animals.Animal;
import Eric._zoo_simulation.compounds.Compound;

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
