package Bokhee.Pizzeria;

public class Topping {
    private int idNumber;
    private String name;
    private double price;

    public Topping(int idNumber, String name, double price) {
        this.idNumber = idNumber;
        this.name = name;
        this.price = price;
    }

    public Topping(String name, double price){
        this.idNumber = getIdNumber();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
