package Irene.pizza;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<String> toppingList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        toppingList = new Vector<>();
    }

//   public void addToppings(Topping toppingName, String toppingName) {
//       toppingList.add(toppingName.getToppingName());
//    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Vector<String> getToppingList() {
        return toppingList;
    }

    @Override
    public String toString() {
        return String.valueOf(toppingList);
    }
}
