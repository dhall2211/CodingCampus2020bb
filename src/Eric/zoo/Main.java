package Eric.zoo;

import Eric.zoo.data.InMemoryAnimals;
import Eric.zoo.compounds.LionCompound;
import Eric.zoo.compounds.SnakeCompound;

public class Main {
    public static void main(String[] args) {

        var animals = new InMemoryAnimals();

        Zoo zoo = new Zoo("GreenDream");
        zoo.printStructure();
        System.out.println("-------------------------------------");

        var lions = animals.getAnimalsBySpecies("Lion");
        var snakes = animals.getAnimalsBySpecies("Snake");

        LionCompound lionCompound = new LionCompound("Lions",  lions) ;
        SnakeCompound snakeCompound = new SnakeCompound("Snakes",  snakes) ;

        zoo.printStructure();
        System.out.println("-------------------------------------");

        snakeCompound.assignAnimalToCompound("Scar",lionCompound);

        zoo.printStructure();
        System.out.println("-------------------------------------");

        System.out.println("All our animals:");
        animals.printAllAnimals();
        zoo.printFoodlist();
    }
}