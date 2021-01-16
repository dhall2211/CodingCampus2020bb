package Marcella.Restaurant;

import java.util.Vector;

public class Restaurant {

    private String name;
    private Menu menu;
    private Vector<Tabel> tabels;
    private Vector<CustomerGroup> customerGroups;

    public Restaurant(String name) {
        this.name = name;
        this.menu = new Menu();
        this.tabels = new Vector<>();
        this.customerGroups = new Vector<>();
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
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", tabels=" + tabels +
                ", customerGroups=" + customerGroups +
                '}';
    }

    public void assignTable(CustomerGroup customerGroup) {
        for (Tabel oneTabel : tabels) {
            if (oneTabel.isFree() && oneTabel.getCapacity() >= customerGroup.getNumberCustomers()) {
                this.customerGroups.add(customerGroup);
                oneTabel.setFree(false);
                System.out.println("Bitte setzen Sie sich an Tisch Nummer " + oneTabel.getTableNumber());
                return;
            }
        }
        System.out.println("Momentan sind alle Tische belegt. Sie können warten, bis ein passender Tisch frei wird.");
    }
}
