package Eric.skiShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationFactory {

    private static final String[] firstname = new String[]{"Ali", "Hari", "Bokhee", "Eric", "Jo"};
    private static final String[] lastname = new String[]{"Schmid", "Muller", "Metzger", "Bäcker", "Yan"};
    private static final Random random = new Random(System.currentTimeMillis());

    public static List<Customer> createCustomers(int max) {
        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            String first = firstname[random.nextInt(firstname.length - 1)];
            String last = lastname[random.nextInt(lastname.length - 1)];
            customers.add(new Customer(first, last));
        }
        return customers;
    }

    public static List<Item> createItems(int max) {
        List<Item> items = new ArrayList<>();
        var values = Category.values();

        for (Category value : values) {
            for (int i = 0; i < max; i++) {
                items.add(new Item(value));
            }
        }
        return items;
    }

    public static List<SalesPerson> createSalesPerson(int max) {
        List<SalesPerson> salesPersons = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            String first = firstname[random.nextInt(firstname.length - 1)];
            String last = lastname[random.nextInt(lastname.length - 1)];
            salesPersons.add(new SalesPerson(first, last));
        }
        return salesPersons;
    }
}
