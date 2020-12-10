package Eric.zoo.animals;

import Eric.zoo.food.Food;
import Eric.zoo.food.LionFood;

public class Lion extends Animal {
    private Food food;

    public Lion(String name, String species) {
        super(name, species);
    }


    public Lion(String name, String species, LionFood lionFood) {
        super(name, species, lionFood);
    }
}
