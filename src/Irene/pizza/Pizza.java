package Irene.pizza;

import java.util.Vector;

public class Pizza {
    private String name;
    private double basePrice;
    private int idPizza;

    public Pizza(String name, double basePrice, int idPizza) {
        this.name = name;
        this.basePrice = basePrice;
        this.idPizza = idPizza;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void printStructurePizzas(){
        System.out.printf("%s for %s Euro (%s) ",
                name,
                basePrice,
                idPizza);
    }
}
