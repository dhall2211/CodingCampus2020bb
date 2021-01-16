package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Order {
    private Customer customer;
    private Vector<Customer> customers;
    private Vector<OrderBasket> orderBaskets;

    public Order(Customer customer) {
        this.customer = customer;
        this.customers = new Vector<>();
        this.orderBaskets =new Vector<>();
    }


    public void addOrderBasket(OrderBasket orderBasket) {
        orderBaskets.add(orderBasket);
    }

    public Vector<OrderBasket> getOrderBaskets() {
        return orderBaskets;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printStructure(String prefix) {
        System.out.println(prefix+"PendingOrders");
        for (int i = 0; i <customers.size() ; i++) {
            System.out.println(customers.get(i).getName());
            for (int j = 0; j <orderBaskets.size() ; j++) {
                System.out.println(orderBaskets.get(j).getProduct().getName() +" "+orderBaskets.get(j).getAmount());

            }
            System.out.println("--");
        }
    }
}