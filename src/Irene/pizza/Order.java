package Irene.pizza;

import java.util.Vector;

public class Order {
    private Vector<Pizza> pizzaList;
    private String customerName;
    private Vector<Topping> orderedToppingsList;

    public Order(String customerName) {
        pizzaList = new Vector<>();
        this.customerName = customerName;
        orderedToppingsList = new Vector<>();
    }

    public void addOrderedToppings(Topping name) {
        orderedToppingsList.add(name);
    }

    public Vector<Topping> getOrderedToppingsList() {
        return orderedToppingsList;
    }

    public String getCustomerName() {
        return customerName;
    }
}
