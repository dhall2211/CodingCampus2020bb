package Marcella.Pizzeria;

import java.util.Vector;

public class Order {

    private int idNumberOrder;
    private Vector<BasicPizza> basicPizzas;
    private Vector<Topping> toppings;

    public Order(int idNumberOrder) {
        this.idNumberOrder = idNumberOrder;
        this.basicPizzas = new Vector<>();
        this.toppings = new Vector<>();
    }

    public void addBasicPizza(int idNumberPizza) {
        for (BasicPizza oneBasicPizza : basicPizzas) {
            if (oneBasicPizza.getIdNumberPizza() == idNumberPizza) {
                this.basicPizzas.add(oneBasicPizza);
            }
        }
    }

    public void addTopping(int idNumberTopping) {
        for (Topping oneTopping : toppings) {
            if (oneTopping.getIdNumberTopping() == idNumberTopping) {
                this.toppings.add(oneTopping);
            }
        }
    }
}
