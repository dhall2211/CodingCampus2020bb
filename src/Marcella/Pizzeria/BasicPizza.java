package Marcella.Pizzeria;

public class BasicPizza {

    private int idNumberPizza;
    private String name;
    private double price;

    public BasicPizza(int idNumberPizza, String name, double price) {
        this.idNumberPizza = idNumberPizza;
        this.name = name;
        this.price = price;
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
}
