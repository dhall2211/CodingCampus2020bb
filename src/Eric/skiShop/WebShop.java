package Eric.skiShop;

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
    public Reservation request(Category category, List<Item> items) {
        for (Item item : items) {
            if (item.getCategory().equals(category) && item.isAvailable()) {
                item.setAvailable(false);
                return null;
            }
        }
        return null;
    }
}
