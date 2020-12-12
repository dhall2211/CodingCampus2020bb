package Eric.zoo.animals;

import Eric.zoo.data.InMemoryAnimalList;
import Eric.zoo.data.InMemoryFoodlist;
import Eric.zoo.food.Food;

public abstract class Animal {
    private String name;
    private String species;
    private Food food;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        InMemoryAnimalList.animals.add(this);
    }

    public Animal(String name, String species, Food food) {
        this.name = name;
        this.species = species;
        this.food = food;
        InMemoryAnimalList.animals.add(this);
        InMemoryFoodlist.addToFoodlist(food.getName(), food);
    }

    public Animal(String name) {
        this.name = name;
        InMemoryAnimalList.animals.add(this);
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Food getFood() {
        return this.food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return species + ": name='" + name + '\'';
    }

}
