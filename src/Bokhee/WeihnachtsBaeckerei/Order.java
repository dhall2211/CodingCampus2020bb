package Bokhee.WeihnachtsBaeckerei;

import java.time.LocalDate;
import java.util.Vector;

public class Order {
    private Customer customer;
    private Vector<OrderItem> orderItems;

    public Order(Customer customer, Vector<OrderItem> orderItems) {
        this.customer = customer;
        this.orderItems = new Vector<>();
    }

     public Vector<OrderItem> getOrderItem() {
        return orderItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return
                        " ============================== " +
                        "Your Order on " + LocalDate.now() +
                        " ============================== " +
                        "     " + customer.getName() + "   " +
                        " ============================== ";
    }

    public void printStructure() {
        toString();
        for (int i = 0; i <= orderItems.size(); i++) {
            System.out.println("[" + i + "] " + orderItems.get(i));
        }
        LocalDate deliverylimit = LocalDate.now();
        System.out.println("Expected delivery is on " + deliverylimit.plusDays(2));
        System.out.println(" ============================== ");
    }
}


