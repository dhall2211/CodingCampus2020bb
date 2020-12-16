package Eric.zoo;

import Eric.zoo.animals.Animal;

import java.util.List;

public class Veterinarian extends Observer {
    private final Double fee = 350.0;
    private String name;
    private List<Animal> animals;

    public List getAnimals() {
        return animals;
    }

    public Veterinarian(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;

        for (Animal animal : animals) {
            animal.attach(this);
        }
    }

    public String getName() {
        return name;
    }


    @Override
    public void update() {
        System.out.println("-> Veterinarian " + this.getName() + " is coming. Fee is " + this.fee);
        ZooController.budget -= fee;
    }
}
