package Irene.pizza;

public class Topping {
    private String toppingName;
    private double price;
    private int idNumber;

    public Topping(String name, double price, int idNumber) {
        this.toppingName = toppingName;
        this.price = price;
        this.idNumber = idNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public String toString() {
        return toppingName;
    }
}
