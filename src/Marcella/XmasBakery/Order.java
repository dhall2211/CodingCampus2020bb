package Marcella.XmasBakery;

import java.util.Vector;

public class Order {

    private Customer whoOrders;
    private Vector<OrderDescription> orderDescriptions;

    public Order(Bakery bakery, Customer whoOrders) {
        this.whoOrders = whoOrders;
        this.orderDescriptions = new Vector<>();
        bakery.addNewOrder(this);

    }

    public void addNewOrderDescription(OrderDescription newOrderDescription) {
        if (!orderDescriptions.contains(newOrderDescription)) {
            orderDescriptions.add(newOrderDescription);
        }
    }

    public Vector<OrderDescription> getOrderDescriptions() {
        return orderDescriptions;
    }
}
