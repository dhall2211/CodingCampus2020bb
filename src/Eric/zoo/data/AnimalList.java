package Eric.zoo.data;

import Eric.zoo.animals.Animal;

import java.util.List;

public interface AnimalList {

    List<Animal> getAllAnimals();
    List<Animal> getAnimalsBySpecies(String species);
    void printAllAnimals();
    void addAnimal(Animal animal);
}
