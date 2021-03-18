package Bokhee.Pizzeria;

import java.util.Vector;

public class Pizza {
    private int idNumber;
    private String name;
    private double price;



    public Pizza( int idNumber,String name, double price) {

        this.idNumber = idNumber;
        this.name = name;
        this.price = price;

    }
    public void addPizza(Pizzeria pizzaria, Pizza pizza){
        pizzaria.addPizza(pizza);
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
