package Eric.skiShop;

import java.util.List;
import java.util.NoSuchElementException;
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

        if (category == null || items == null) {
            throw new NoSuchElementException("You are a stupid customer");
        }
        if (!provider.isAvailable(category, items)) {
            System.err.println("sorry not available: " + category);
        } else {
            provider.request(this, category, items);
        }
    }

    public IProvider chooseShop(double probability) {
        Random random = new Random();
        IProvider provider;
        var shop = Shop.getInstance();

        if (random.nextDouble() > probability) {
            provider = shop.getWebShop();
        } else {
            provider = shop.getSalesPerson();
        }
        return provider;
    }
}
