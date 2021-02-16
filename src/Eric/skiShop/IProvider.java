package Eric.skiShop;

public interface IProvider {

boolean isAvailable(Category category);
Reservation request(Category category);

}
