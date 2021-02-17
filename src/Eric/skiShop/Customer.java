package Eric.skiShop;

import java.util.List;
import java.util.Random;

public class Customer {
    private final double PROBABILITY = 0.3;
    private final String firstName;
    private final String lastName;
    private Reservation reservation;

    public Customer(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public void rentItem(Category category, List<Item> items) {
        var provider = chooseShop(PROBABILITY);

        if (!provider.isAvailable(category, items)) {
            System.err.println("sorry not available: " + category);
        } else {
            provider.request(category, items);
        }
    }

    public IProvider chooseShop(double probability) {
        Random random = new Random();
        IProvider provider = null;
        var shop = Shop.getInstance();

        if (random.nextDouble() > probability) {
            provider = shop.getWebShop();
        } else {
            provider = shop.getSalesPerson();
        }
        return provider;
    }
}
