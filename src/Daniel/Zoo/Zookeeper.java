package Daniel.Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Zookeeper {
    private String name;
    private Animal favouriteAnimal;
    private Vector<Compound> compounds;
    private Zoo zoo;

    public Zookeeper(String name, Animal favouriteAnimal, Vector<Compound> compounds, Zoo zoo) {
        this.name = name;
        this.favouriteAnimal = favouriteAnimal;
        this.compounds = compounds;
        this.zoo = zoo;
    }

    public String getName() {
        return name;
    }

    public void feedAnimals(){
        // get food demand of compounds
        var demands = new Vector<Demand>();
        for (var compound : compounds) {
            demands.addAll(compound.getDemands());
        }
        System.out.println("Tagesbedarf ermittelt: " + Arrays.toString(demands.toArray()));

        // get food from stock and check for reorders
        var food = zoo.getFood(demands);
        System.out.println("Futter aus Lager genommen: " + Arrays.toString(food.toArray()));

        // feed every animal in all compounds
        for (var compound : compounds) {
            compound.feedAnimals(food);
        }
    }

    public void printStruktur(String prefix) {
        System.out.println(prefix + this.name);
        System.out.println(prefix + "  Lieblingstier: " + favouriteAnimal.getName());
        System.out.println(prefix + "  Gehege:");
        for (var compound : compounds) {
            System.out.println(prefix + "    " + compound.getName());
        }
    }
}
