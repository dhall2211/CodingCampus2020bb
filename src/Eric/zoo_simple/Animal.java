package Eric.zoo_simple;

import java.util.Objects;

public class Animal {
    // Member Variablen
    private String name;
    private String species;
    private Food favouriteFood;
    private int foodDemand;

    // Constructor
    public Animal(Zoo zoo, String compound, String name, String species, String favouriteFood, int foodDemand){
        this.name = name;
        this.species = species;
        this.favouriteFood = zoo.searchAndCreateFutter(favouriteFood);
        this.foodDemand = foodDemand;
        this.favouriteFood.addDailyDemand(foodDemand);

        zoo.searchAndCreateGehege(compound).addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                species,
                foodDemand,
                favouriteFood.getUnit(),
                favouriteFood.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) &&
                Objects.equals(species, animal.species);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
