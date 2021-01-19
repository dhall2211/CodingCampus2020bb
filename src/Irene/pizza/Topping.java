package Irene.pizza;

import java.util.Vector;

public class Topping {
    private String name;
    private double price;
    private int idNumber;

    public Topping(String name, double price, int idNumber) {
        this.name = name;
        this.price = price;
        this.idNumber = idNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ", idNumber=" + idNumber;
    }
}
