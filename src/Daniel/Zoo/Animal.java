package Daniel.Zoo;

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
}
