package Eric.zoo.data;

import Eric.zoo.animals.Animal;
import Eric.zoo.animals.Lion;
import Eric.zoo.animals.Snake;
import Eric.zoo.food.LionFood;
import Eric.zoo.food.SnakeFood;
import Eric.zoo.food.SpecialFood;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InMemoryAnimalList implements AnimalList {

    public static List<Animal> animals = new ArrayList<>();

    public InMemoryAnimalList() {
        new Lion("Simba", "Lion", new SpecialFood("Cheesecake", 12, "pieces"));
        new Lion("Scar", "Lion", new LionFood());
        new Animal("Kaa", "Snake", new SnakeFood()) {
        };
        new Snake("MontyThePython", "Snake", new SpecialFood("Vegan", 0.7));
        new Snake("IBiteYou", "Snake", new SnakeFood());
    }

    @Override
    public List<Animal> getAllAnimals() {
        return animals;
    }

    @Override
    public List<Animal> getAnimalsBySpecies(String species) {
        List<Animal> animalList = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getSpecies().equals(species)) {
                animalList.add(animal);
            }
        }
        return animalList;
    }

    @Override
    public void printAllAnimals() {
        List<Animal> animalsCopy = new ArrayList<>(animals);
        animalsCopy.sort(Comparator.comparing(Animal::getSpecies).reversed().thenComparing(Animal::getName));
        for (Animal a : animalsCopy) {
            System.out.println(a.toString());
        }
    }

    @Override
    public void addAnimal(Animal animal) {

    }
}