package Eric._zoo_simulation.data;

import java.util.HashMap;
import java.util.Map;

public class InMemoryPricelist {

    public static Map<String,Double> prices;

    public InMemoryPricelist() {
        prices = new HashMap<>();
        initialize();
    }

    public void initialize(){
        prices.put("Cheesecake", 34.5);
        prices.put("Vegan", 12.7);
        prices.put("Meat", 25.0);
        prices.put("DriedMeal", 2.3);
    }
}
