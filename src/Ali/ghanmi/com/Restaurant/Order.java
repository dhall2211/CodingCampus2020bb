package Ali.ghanmi.com.Restaurant;

import java.util.Vector;

public class Order {
    private Vector<Product> products;
    private Vector<Order> customerGroups;

    public Order() {
        this.products = new Vector<>();
        this.customerGroups= new Vector<Order>();
    }

    public void addProductsToOrder(Product[] products) {
        for (Product oneProduct : products) {
            this.products.add(oneProduct);

        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", customerGroup=" + customerGroups +
                '}';
    }

    public void addOrderToCustumer(Order order) {
        customerGroups.add(order);
    }
}
