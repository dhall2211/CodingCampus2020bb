package Eric.zoo;

import Irene.zoo.Compound;

import java.util.List;

public class Veterinarian {
    private String name;
    private List animals;

    public List getAnimals() {
        return animals;
    }

    public Veterinarian(String name, List animals) {
        this.name = name;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }
}
