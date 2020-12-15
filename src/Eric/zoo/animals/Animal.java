package Eric.zoo.animals;

import Eric.zoo.Observer;
import Eric.zoo.Veterinarian;
import Eric.zoo.data.InMemoryAnimalList;
import Eric.zoo.data.InMemoryFoodlist;
import Eric.zoo.food.Food;
import Eric.zoo.keeper.Keeper;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private String name;
    private String species;
    private Food food;
    private int health = 10;
    private List<Observer> observers = new ArrayList();

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

    public void setHealth(int health){
            this.health = health;
            notifyAllObservers(health);
}

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(int health) {

        if (health < 4 ) {

            System.out.println("!!!\t" + this.getName() + " feels very ill ");
            for (Observer observer : observers) {
                if (observer.getClass() == Veterinarian.class) {
                    observer.update();
                }
            }
        } else if (health < 7) {

            System.out.println("!\t" + this.getName() + " feels not too good ");
            for (Observer observer : observers) {
                if (observer.getClass() == Keeper.class) {
                    observer.update();
                }
            }
        }
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

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return species + ": " + name;
    }

}
