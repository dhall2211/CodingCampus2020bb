package Eric._zoo_simulation.animals;

import Eric._zoo_simulation.food.Food;

public class Snake extends Animal {
    private Food food;

    public Snake(String name, String species) {
        super(name, species);
    }

    public Snake(String name, String species, Food snakeFood) {
        super(name, species, snakeFood);
    }
}