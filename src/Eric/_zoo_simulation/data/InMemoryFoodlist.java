package Eric._zoo_simulation.data;

import Eric._zoo_simulation.food.Food;

import java.util.HashMap;
import java.util.Map;

public class InMemoryFoodlist {
    public static Map<String, Food> foodlist = new HashMap<>();

    public static void addToFoodlist(String name, Food food){
        foodlist.put(name,food);
    }
}
