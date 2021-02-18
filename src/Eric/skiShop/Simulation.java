package Eric.skiShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulation {
    public static int tick = 7;
    private final Shop shop = Shop.getInstance();
    private final List<Item> items = new ArrayList<>(shop.getItems());

    public void run() {

        var customers = SimulationFactory.createCustomers(5);

        for (int i = 0; i < 5; i++) {
            tick++;
            System.out.println(tick + " o clock:");
            showAvailabeItems();
            for (Customer customer : customers) {
                doCustomerRent(customer, items);
            }
        }

        showAvailabeItems();
    }

    private void showAvailabeItems() {
        var values = Category.values();
        int counter;

        System.out.println("Our available items: ");
        for (Category value : values) {
            counter = 0;
            for (Item item : items) {
                if (item.getCategory().equals(value) && item.isAvailable()) {
                    counter++;
                }
            }
            System.out.println(value + ": " + counter + " | Price per day: " + value.getPrice());
        }
        System.out.println("-------------------");
    }

    private void doCustomerRent(Customer customer, List<Item> items) {
        var values = Category.values();
        Random random = new Random();
        var randomItem = values[random.nextInt(values.length)];
        customer.rentItem(randomItem, items);
    }
}
