package Ali.ghanmi.com.Pizzeria;

import java.util.Vector;

public class BasicPizza {

    private int idNumberPizza;
    private String name;
    private double price;
    private Vector<Topping> toppings;

    public BasicPizza(int idNumberPizza, String name, double price,String[]topping) {
        this.idNumberPizza = idNumberPizza;
        this.name = name;
        this.price = price;
        toppings = new Vector<>();

    }

    public int getIdNumberPizza() {
        return idNumberPizza;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BasicPizza: "+ name + "\n" +
                "Kostet: " + price;
    }

    public void addToppingToBasic(Topping[] toppings) {
        for (Topping oneTopping : toppings) {
            this.toppings.add(oneTopping);
        }
    }
}
