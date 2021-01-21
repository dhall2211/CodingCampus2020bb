package Irene.pizza;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<Topping> toppingList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        toppingList = new Vector<>();
    }

    public void addToppings(Vector<Topping> t) {
            toppingList.addAll(t);
    }

    public void printToppings() {
        for (int i = 0; i < toppingList.size(); i++) {
            System.out.println(toppingList.get(i));
        }
    }

    public String getRestaurantName() {
        return restaurantName;
    }
}
