package Eric.zoo;

import Eric.zoo.data.InMemoryAnimalList;
import Eric.zoo.compounds.LionCompound;
import Eric.zoo.compounds.SnakeCompound;
import Eric.zoo.keeper.Keeper;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        var animals = new InMemoryAnimalList();

        Zoo zoo = new Zoo("GreenDream");
/*        zoo.printStructure();
        System.out.println("-------------------------------------");*/

        var lions = animals.getAnimalsBySpecies("Lion");
        var snakes = animals.getAnimalsBySpecies("Snake");

        LionCompound lionCompound = new LionCompound("Lions",  lions) ;
        SnakeCompound snakeCompound = new SnakeCompound("Snakes",  snakes) ;

        var compounds = new ArrayList<>();
        compounds.add(lionCompound);
        compounds.add(snakeCompound);

        Keeper keeper = new Keeper("WildBill", compounds);
        Veterinarian vet = new Veterinarian("Doolittle", animals.getAllAnimals());

         System.out.println("-------------------------------------");
        zoo.printStructure();

/*        snakeCompound.assignAnimalToCompound("Scar",lionCompound);
        zoo.printStructure();
        System.out.println("-------------------------------------");*/
        Thread.sleep(1000);
        System.out.println("-------------------------------------");
        System.out.println("All our animals:");
        animals.printAllAnimals();

        Thread.sleep(1000);
        System.out.println("-------------------------------------");
        zoo.printFoodlist(animals.getAllAnimals());

        Thread.sleep(1000);
        System.out.println("-------------------------------------");
        System.out.println("Our keeper is " + keeper.getName());
        System.out.println("he takes care of" + keeper.getCompoundsToKeep().toString());

        Thread.sleep(1000);
        System.out.println("-------------------------------------");
        System.out.println("Our veterinarian is " + vet.getName());
        System.out.println("he takes care of" + vet.getAnimals().toString());
    }
}