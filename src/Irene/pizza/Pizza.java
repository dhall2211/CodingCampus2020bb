package Irene.pizza;

import java.util.Vector;

public class Pizza {
    private String name;
    private double basePrice;

    public Pizza(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
