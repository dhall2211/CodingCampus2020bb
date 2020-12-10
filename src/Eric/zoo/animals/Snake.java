package Eric.zoo.animals;

import Eric.zoo.food.Food;
import Eric.zoo.food.SnakeFood;

public class Snake extends Animal {
    private Food food;

    public Snake(String name, String species) {
        super(name, species);
    }

    public Snake(String name, String species, SnakeFood snakeFood) {
        super(name, species, snakeFood);
    }
}