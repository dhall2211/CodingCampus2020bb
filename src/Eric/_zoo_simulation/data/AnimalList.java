package Eric._zoo_simulation.data;

import Eric._zoo_simulation.animals.Animal;

import java.util.List;

public interface AnimalList {

    List<Animal> getAllAnimals();
    List<Animal> getAnimalsBySpecies(String species);
    void printAllAnimals();
    void addAnimal(Animal animal);
}
