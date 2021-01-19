package Ali.ghanmi.com.Restaurant;

import java.util.Arrays;
import java.util.Vector;

public class CustomerGroup {

    private int numberCustomers;
    private Vector<Order> orders;

    public CustomerGroup(int numberCustomers) {
        this.numberCustomers = numberCustomers;
        this.orders = new Vector<>();


    }

    public int getNumberCustomers () {
            return numberCustomers;
        }


    public void add(Order[] orders) {
        for (Order oneOrder : orders) {
            this.orders.add(oneOrder);
    }

}
    @Override
    public String toString() {
        return "\n" + "numberCustomers=" + numberCustomers + ", orders=" + orders;
    }

    public void addOrderToCustumer(Order order) {
        orders.add(order);
    }
}
