package Marcella.Zoo;

public class Animal {

    private String name;
    private String species;
    private Food food;
    private int foodAmount;

    public Animal(Zoo zoo, String enclosure, String name, String species, String food, int foodAmount) {
        this.name = name;
        this.species = species;
        this.food = zoo.searchAndCreateFood(food);
        this.foodAmount = foodAmount;
        this.food.addDailyAmount(foodAmount);

        zoo.searchAndCreateEnclosure(enclosure).addAnimal(this);
    }

    public String getName() {
        return name;
    }

    public void printStructure() {
        System.out.println("_ " + this.name + ", "
                + species + ", "
                + foodAmount + food.getAmount() + ", "
                + food.getName());
    }

}
