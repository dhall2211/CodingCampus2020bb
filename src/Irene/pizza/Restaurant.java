package Irene.pizza;

import java.util.Vector;

public class Restaurant {
    private String name;
    private Vector<Topping> toppingList;

    public Restaurant(String name) {
        this.name = name;
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
}
