package Eric._zoo_simulation.animals;

import Eric._zoo_simulation.food.Food;
import Eric._zoo_simulation.food.LionFood;

public class Lion extends Animal {
    private Food food;

    public Lion(String name, String species) {
        super(name, species);
        this.food = new LionFood();
    }

    public Lion(String name, String species, Food lionFood) {
        super(name, species, lionFood);
    }
}
