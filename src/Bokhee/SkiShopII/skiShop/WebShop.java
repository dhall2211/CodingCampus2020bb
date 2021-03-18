package Bokhee.SkiShopII.skiShop;

import java.util.List;

public class WebShop implements IProvider {

    private static WebShop instance;

    private WebShop() {
    }

    public static WebShop getInstance() {
        if (instance == null) {
            instance = new WebShop();
        }
        return instance;
    }

    @Override
    public boolean isAvailable(Category category, List<Item> items) {

        for (Item item : items) {
            if (item.getCategory().equals(category) && item.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Reservation request(Customer customer, Category category, List<Item> items) {
        for (Item item : items) {
            if (item.getCategory().equals(category) && item.isAvailable()) {
                item.setAvailable(false);
                Shop.reservations.add(new Reservation(customer, item ));
                return null;
            }
        }
        return null;
    }
}
