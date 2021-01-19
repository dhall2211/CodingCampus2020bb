package Ali.ghanmi.com.Restaurant;

import java.util.Collections;
import java.util.Vector;

public class Restaurant {

    private String name;
    private Menu menu;
    private Vector<Tabel> tabels;
    private Vector<CustomerGroup> customerGroups;
    private Vector<Order> orders;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new Menu();
        this.tabels = new Vector<>();
        this.customerGroups = new Vector<>();
        this.orders = new Vector<>();
    }

    public void addProducts(Product[] products) {
        menu.addProducts(products);
    }


    public void addTables(Tabel[] tabels) {
        for (Tabel oneTabel : tabels) {
            this.tabels.add(oneTabel);
        }
    }


    @Override
    public String toString() {
        return "Restaurant: " + name +
                ", menu:" + menu +
                "\n, tabels: " + tabels +
                ", customerGroups: " + customerGroups;
    }

    public void assignTable(CustomerGroup customerGroup) {
         this.tabels.sort(new SortTabelsByCapacity());
        for (Tabel oneTabel : tabels) {
            if (oneTabel.isFree() && oneTabel.getCapacity() >= customerGroup.getNumberCustomers()) {
                this.customerGroups.add(customerGroup);
                oneTabel.setFree(false);
                System.out.println("Groupe von : " + customerGroup.getNumberCustomers() + " per.  Bitte setzen Sie sich an Tisch Nummer " + oneTabel.getTableNumber());
                return;
            }
        }
        System.out.println("Momentan sind alle Tische belegt. Sie können warten, bis ein passender Tisch frei wird.");
    }

}