package Eric._zoo_simulation.compounds;

import Eric._zoo_simulation.ZooController;
import Eric._zoo_simulation.animals.Animal;

import java.util.List;

public abstract class Compound {
    private String name;
    public List<Animal> animalsInCompound;

    public Compound(String name, List<Animal> animals) {
        this.name = name;
        this.animalsInCompound = animals;
        ZooController.compounds.add(this);
    }

    public void assignAnimalToCompound(String animalName, Compound actualCompound) {
        Animal animal = actualCompound.animalsInCompound.stream().filter(a -> a.getName().equals(animalName)).findFirst().get();
        actualCompound.animalsInCompound.remove(animal);
        this.animalsInCompound.add(animal);
    }

    public void assignAnimalToCompound(Animal animal, Compound other) {
        this.animalsInCompound.remove(animal);
        other.animalsInCompound.add(animal);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalsInCompound() {
        return animalsInCompound;
    }

    public void setAnimalsInCompound(List<Animal> animalsInCompound) {
        this.animalsInCompound = animalsInCompound;
    }

    @Override
    public String toString() {
        return "Compound{" +
                "name='" + name + '\'' +
                ", animalsInCompound=" + animalsInCompound.toString();
    }
}
