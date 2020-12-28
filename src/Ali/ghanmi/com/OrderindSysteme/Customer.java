package Ali.ghanmi.com.OrderindSysteme;

import java.util.Vector;

public class Customer {
    private String name;
    private String adress;
    private int customerPw;
    private Vector<OrderBasket> orderBaskets;

    public Customer(String name, String adress, int customerPw, OrderBasket orderBaskets) {
        this.name = name;
        this.adress = adress;
        this.orderBaskets = new Vector<>();

        this.customerPw = customerPw;

    }

    public String getName() {
        return name;
    }

    public int getCustomerPw() {
        return customerPw;
    }

    public Vector<OrderBasket> getOrderBaskets() {
        return orderBaskets;
    }

    public void addOrderbasket(OrderBasket orderBasket) {
        orderBaskets.add(orderBasket);
    }
}
