package Irene.pizza;

import java.util.Vector;

public class Pizza {
    private String name;
    private Vector<Topping> orderedToppingsList;
    private double basePrice;

    public Pizza(String name, Vector<Topping> toppingsList, double basePrice) {
        this.name = name;
        this.orderedToppingsList = toppingsList;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void addTopping(Topping topping) {
        orderedToppingsList.add(topping);
    }
}
