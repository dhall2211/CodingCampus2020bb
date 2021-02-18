package Eric.skiShop;

import java.util.List;

public interface IProvider {

    boolean isAvailable(Category category, List<Item> items);

    Reservation request(Customer customer, Category category, List<Item> items);

}
