package Ali.ghanmi.com.skiShop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private static Shop instance;
    private final String name = "Skishop";
    private final WebShop webShop = WebShop.getInstance();
    private final List<SalesPerson> salesPersons = SimulationFactory.createSalesPerson(1);
    private List<Item> items = SimulationFactory.createItems(10);
    public static List<Reservation> reservations = new ArrayList<>();

    private Shop() {
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        if (instance.salesPersons.size() < 1){
            try {
                throw new Exception("Chef has to come himself!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public WebShop getWebShop() {
        return this.webShop;
    }

    public SalesPerson getSalesPerson() {
        return this.salesPersons.get(0);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
