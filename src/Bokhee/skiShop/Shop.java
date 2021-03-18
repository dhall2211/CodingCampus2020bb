package Bokhee.skiShop;

import java.util.List;

public class Shop {

    private String name = "Skishop";
    private static Shop instance;
    private List<SalesPerson> salesPersons;
    private WebShop webShop;
    private List<Item> items;

    private Shop() {
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public String getName() {
        return name;
    }
}
