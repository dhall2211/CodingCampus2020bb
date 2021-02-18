package Eric.skiShop;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private Customer customer;
    private List<Item> items = new ArrayList<>();
    private boolean isInUse;
    private int ticksSinceReservation;
    private int ticksSincePickup;

    public Reservation(Customer customer, Item item) {
        this.customer = customer;
        items.add(item);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
