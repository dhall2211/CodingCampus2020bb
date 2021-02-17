package Eric.skiShop;

import java.util.List;

public class SalesPerson implements IProvider {
    private final String firstName;
    private final String lastName;
    private List<Item> items;

    public SalesPerson(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void pickUp(Reservation reservation) {

    }

    @Override
    public boolean isAvailable(Category category, List<Item> items) {
        items = Shop.getInstance().getItems();

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
