package Bokhee.Pizzeria;

import java.util.Vector;

public class Order {
    private int orderNumber;
    private Pizza pizza;
    private Vector<Topping> toppings;


    public Order(Pizza pizza) {
        this.orderNumber += (orderNumber+1)*100;
        this.pizza = pizza;
        this.toppings = new Vector<>();
    }

    public void addToppings(Topping[] toppings) {
        for (Topping oneTopping : toppings) {
            if (oneTopping != null) {
                this.toppings.add(oneTopping);
            }
        }
    }

    public void printToppings() {
        System.out.println("===============================\n" +
                "\tOrder Number : " +this.orderNumber);
        System.out.println("===============================" );
        System.out.println("Pizza : " + this.pizza.getName());
        for (Topping oneTopping : toppings) {
            if (oneTopping != null) {
                System.out.println(" + " +oneTopping.getName());
            }
        }
        System.out.println("===============================" );
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Vector<Topping> getToppings() {
        return toppings;
    }

    public void setOrderNumber() {
       this.orderNumber += orderNumber;
    }
}


