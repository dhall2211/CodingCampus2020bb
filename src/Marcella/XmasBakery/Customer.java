package Marcella.XmasBakery;

import java.util.Vector;

public class Customer {

    private String name;
    private String adress;

    public Customer(Bakery bakery, String name, String adress) {
        this.name = name;
        this.adress = adress;
        bakery.registerNewCustomer(this);
    }

    public void printStructure(String spaces) {
        System.out.println(spaces + "_ " + this.name);
    }

}
