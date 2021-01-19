package Irene.pizza;

import java.util.Vector;

public class Order {
    private Vector<Pizza> pizzaList;
    private String customerName;

    public Order(Vector<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }
}
