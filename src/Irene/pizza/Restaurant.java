package Irene.pizza;

import java.util.Vector;

public class Restaurant {
    private String restaurantName;
    private Vector<Topping> toppingList;
    private Vector<Pizza> pizzaList;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
        toppingList = new Vector<>();
        pizzaList = new Vector<>();
    }

    public void addToppings(Topping t) {
        if (!toppingList.contains(t)) {
            toppingList.add(t);
        }
    }

    public void addPizzas(Pizza p) {
        if (!pizzaList.contains(p)) {
            pizzaList.add(p);
        }
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public Vector<Topping> getToppingList() {
        return toppingList;
    }

    public void printStructureToppingMenu() {
        for (int i = 0; i < toppingList.size(); i++) {
            toppingList.get(i).printStructureToppings();
        }
    }

    public void printStructurePizzaMenu() {
        for (int i = 0; i < pizzaList.size(); i++) {
            pizzaList.get(i).printStructurePizzas();
        }
    }
}
