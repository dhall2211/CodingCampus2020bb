package Daniel.Zoo;

public class Animal {
    // Member Variablen
    private String name;
    private String species;
    private Demand foodDemand;

    // Constructor
    public Animal(Zoo zoo, String compound, String name, String species, String favouriteFoodName, int foodAmount){
        this.name = name;
        this.species = species;
        var favouriteFood = zoo.searchAndCreateFutter(favouriteFoodName);
        this.foodDemand = new Demand(favouriteFood, foodAmount);
        favouriteFood.addDailyDemand(foodAmount);
        zoo.searchAndCreateGehege(compound).addTier(this);
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s (%s) braucht %d %s %s%n",
                prefix,
                name,
                species,
                foodDemand.getAmount(),
                foodDemand.getFood().getUnit(),
                foodDemand.getFood().getName());
    }

    public String getName() {
        return name;
    }

    public Demand getDemand() {
        return foodDemand;
    }
}
