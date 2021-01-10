package Marcella.XmasBakery;

import java.util.Vector;

public class Customer {

    private String name;
    private String adress;
    private Vector<OrderDescription> orderDescriptions;


    public Customer(Bakery bakery, String name, String adress) {
        this.name = name;
        this.adress = adress;
        this.orderDescriptions = new Vector<>();
        bakery.registerNewCustomer(this);
    }

    public void addNewOrderDescription(OrderDescription newOrderDescription) {
        if (!orderDescriptions.contains(newOrderDescription)) {
            orderDescriptions.add(newOrderDescription);
        }
    }

    public void printStructure(String spaces) {
        System.out.println(spaces + "_ " + this.name);
    }

}
