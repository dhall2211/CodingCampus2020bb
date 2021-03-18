package Bokhee.skiShop;

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
    public boolean isAvailable(Category category) {
        return false;
    }

    @Override
    public Reservation request(Category category) {
        return null;
    }
}
