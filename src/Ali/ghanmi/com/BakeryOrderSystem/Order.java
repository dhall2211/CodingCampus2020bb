package Ali.ghanmi.com.BakeryOrderSystem;

public class Order {
    private Customer customer;
    private OrderBasket orderBasket;

    public Order(Customer customer, OrderBasket orderBasket) {
        this.customer = customer;
        this.orderBasket = orderBasket;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
