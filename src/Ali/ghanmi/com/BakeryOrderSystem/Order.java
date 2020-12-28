package Ali.ghanmi.com.BakeryOrderSystem;

import java.util.Vector;

public class Order {
    private Vector<Customer> customer;
    private Vector<OrderBasket> pendingOrders;

    public Order(Vector<Customer> customer,  Vector<OrderBasket> pendingOrders) {
        this.customer = new Vector<>();
        this.pendingOrders =new Vector<>();

    }
}
